/*
 * 이미지를 블러처리하는 코드가 포함됨
 * <적용>버튼을 누르면 WorkRequest 가 생성된 다음 WorkManager에 의해 큐에 추가된다.
 */

package com.example.background.workers

import android.content.Context
import android.graphics.BitmapFactory
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import com.example.background.KEY_IMAGE_URI
import com.example.background.R

private const val TAG = "BlurWorker"

class BlurWorker(ctx: Context, params: WorkerParameters) : Worker(ctx, params) {

    /*
     * doWork() 재정의
     */
    override fun doWork(): Result {
        val appContext = applicationContext // context를 가져온다. -> 처리할 다양한 비트맵 조작을 위해 필요 (1)

        // (4) 전달한 URI를 Data 객체에서 가져오도록 하기 위해 추가한다.
        val resourceUri = inputData.getString(KEY_IMAGE_URI)

        makeStatusNotification("Blurring image", appContext)

        // This is an utility function added to emulate slower work.
        sleep()

        return try {
            // Uri에서 사용자가 선택한 이미지를 블러 처리할 수 있다. (5)
            if (TextUtils.isEmpty(resourceUri)) {
                Log.e(TAG, "Invalid input uri")
                throw IllegalArgumentException("Invalid input uri")
            }

            val resolver = appContext.contentResolver

            // 테스트 이미지에서 Bitmap을 만든다. (2)
//            val picture = BitmapFactory.decodeResource(appContext.resources, R.drawable.test)
            val picture = BitmapFactory.decodeStream(
                resolver.openInputStream(Uri.parse(resourceUri))
            )

            // 정적 blurBitmap() 메서드를 호출하여 블러 처리된 버전의 비트맵을 가져온다. (3)
            val output = blurBitmap(picture, appContext)

            // bitMap 파일을 temp 파일로 변환한다.
            val outputUri = writeBitmapToFile(appContext, output)

            // 새 data를 만들고 입력의 경우와 마찬가지로 outputUri를 String으로 저장하고 같은 키를 사용한다.
            val outputData = workDataOf(KEY_IMAGE_URI to outputUri.toString())

            // URI를 표시하는 알림을 만든다.
            makeStatusNotification("출력물은 : $outputUri", appContext);

            Result.success(outputData) // WorkManager에 반환한다.
        } catch (throwable: Throwable) {
            Log.e(TAG, "Error applying blur")
//            throwable.printStackTrace()
            Result.failure()
        }
    }
}
