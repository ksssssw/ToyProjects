/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.background

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.work.WorkInfo
import com.example.background.databinding.ActivityBlurBinding

class BlurActivity : AppCompatActivity() {

    private val viewModel: BlurViewModel by viewModels { BlurViewModelFactory(application) }
    private lateinit var binding: ActivityBlurBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBlurBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goButton.setOnClickListener { viewModel.applyBlur(blurLevel) }

        // Setup view output image file button
        binding.seeFileButton.setOnClickListener {
            viewModel.outputUri?.let { currentUri ->
                val actionView = Intent(Intent.ACTION_VIEW, currentUri)
                actionView.resolveActivity(packageManager)?.run {
                    startActivity(actionView)
                }
            }
        }

        // Hookup the Cancel button
        binding.cancelButton.setOnClickListener { viewModel.cancelWork() }

        viewModel.outputWorkInfos.observe(this, workInfosObserver())
    }

    private fun workInfosObserver(): Observer<List<WorkInfo>> {
        return Observer { listOfWorkInfo ->
            // 다음 몇 줄은 WorkInfo가 있는 경우 단일 WorkInfo를 가져옵니다.
            // 이 코드는 ViewModel의 Transformation에 있을 수 있습니다. 그들은 여기에 포함되어 있습니다
            // WorkInfo를 표시하는 전체 프로세스가 한 위치에 있도록 합니다.
            // 일치하는 작업 정보가 없으면 아무 작업도 수행하지 않음

            /*
             * WorkInfo 목록이 null이 아닌지 검사
             */
            if (listOfWorkInfo.isNullOrEmpty()) {
                return@Observer
            }

            // 우리는 하나의 출력 상태에만 신경을 씁니다.
            // 모든 연속 작업에는 TAG_OUTPUT 태그가 지정된 작업자가 하나만 있습니다.
            val workInfo = listOfWorkInfo[0]

            // WorkInfo가 완료된 경우에
            if (workInfo.state.isFinished) {
                showWorkFinished()

                // workInfo.outputData를 사용하여 출력 데이터를 가져온다.
                // 그런 다음 출력 URI를 key를 사용해 가져온다.
                // 일반적으로 이 처리는 드로잉 뷰와 직접 관련이 없습니다.
                // 화면은 ViewModel에 있습니다. 단순화를 위해 여기에 보관합니다.
                val outputImageUri = workInfo.outputData.getString(KEY_IMAGE_URI)

                // 출력 파일이 있는 경우 "파일 보기" 버튼 표시
                if (!outputImageUri.isNullOrEmpty()) {
                    viewModel.setOutputUri(outputImageUri)
                    binding.seeFileButton.visibility = View.VISIBLE
                }
            } else {
                showWorkInProgress()
            }
        }
    }

    /**
     * Shows and hides views for when the Activity is processing an image
     */
    private fun showWorkInProgress() {
        with(binding) {
            progressBar.visibility = View.VISIBLE
            cancelButton.visibility = View.VISIBLE
            goButton.visibility = View.GONE
            seeFileButton.visibility = View.GONE
        }
    }

    /**
     * Shows and hides views for when the Activity is done processing an image
     */
    private fun showWorkFinished() {
        with(binding) {
            progressBar.visibility = View.GONE
            cancelButton.visibility = View.GONE
            goButton.visibility = View.VISIBLE
        }
    }

    private val blurLevel: Int
        get() =
            when (binding.radioBlurGroup.checkedRadioButtonId) {
                R.id.radio_blur_lv_1 -> 1
                R.id.radio_blur_lv_2 -> 2
                R.id.radio_blur_lv_3 -> 3
                else -> 1
            }
}
