package com.example.agualist
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.remember

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }

@Composable
fun WellnessTasksList(
  // Inmutable list
    //  val list = remember { getWellnessTasks().toMutableStateList() }
    list: List<WellnessTask> = remember { getWellnessTasks() },
    onCloseTask: (WellnessTask) -> Unit,//Pass onCloseTask to the WellnessTaskItem
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(list,key = {task->task.label}) { task ->
            WellnessTaskItem(taskName = task.label,onClose = {onCloseTask(task)})
           // key = {task->task.label}
          //onClose = { onCloseTask(task) }
        }
    }
}
//@Composable
//fun WellnessTaskItem(taskName: String, modifier: Modifier = Modifier) {


//data class WellnessTask(val id: Int, val label: String)