package com.example.busschedule.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.busschedule.database.schedule.Schedule
import com.example.busschedule.database.schedule.ScheduleDao
import kotlinx.coroutines.flow.Flow
import java.lang.IllegalArgumentException

/*
 * 간단한 테스트라 viewModel을 하나만 만들지만
 * activity, fragment 별로 만드는걸 권장함..
 */
class BusScheduleViewModel(private val scheduleDao: ScheduleDao) : ViewModel() {

    // 첫 번째 화면
    fun fullSchedule(): Flow<List<Schedule>> = scheduleDao.getAll()

    // 두 번째 화면
    fun scheduleForStopName(name: String): Flow<List<Schedule>> = scheduleDao.getByStopName(name)

}

/*
 * BusScheduleViewModel에 필요한 ViewModel 클래스는 수명 주기를 인식해야 하므로
 * 수명주기 이벤트에 응답할 수 있는 객체로 인스턴스화해야함
 * 프라그먼트 중 하나에서 직접 인스턴스화하면 프라그먼트 객체가 앱 코드의 기능 법위에 벗어나는 모든 메모리 관리를 처리해야함
 * 대신 뷰 모델 객체를 인스턴스화하는 팩토리라는 클래스를 만들 수 있음..
 */
class BusScheduleViewModelFactory(
    private val scheduleDao: ScheduleDao
) : ViewModelProvider.Factory {

    /*
     * 이제 BusScheduleViewModelFactory.create()로 busScheduleViewModelFactory 객체를 인스턴스화 할 수 있으므로
     * 프라그먼트에서 이를 직접 처리하지 않고도 뷰 모델이 수명 주기를 인식할 수 있음
     */
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(BusScheduleViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return BusScheduleViewModel(scheduleDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}