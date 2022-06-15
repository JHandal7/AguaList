package com.example.agualist
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.remember

private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }

@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask> = remember { getWellnessTasks() }
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(list) { task ->
            WellnessTaskItem(taskName = task.label)
            // WellnessTaskItem(
            //        taskName = taskName
        }
    }
}
//@Composable
//fun WellnessTaskItem(taskName: String, modifier: Modifier = Modifier) {


//data class WellnessTask(val id: Int, val label: String)