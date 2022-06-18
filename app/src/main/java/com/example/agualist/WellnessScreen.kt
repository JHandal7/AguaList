package com.example.agualist

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {

    Column(modifier = modifier) {
        val list = remember { getWellnessTasks().toMutableStateList() }
       // WellnessTasksList()
        WellnessTasksList(list = list, onCloseTask = { task -> list.remove(task) })
    }

}
private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }

//onCloseTask = { task -> list.remove(task) }
//fun WellnessTasksList(   : WellnessTaskItem(taskName = task.label,onClose = {onCloseTask(task)})
//fun WellnessTaskItem  : onClose = onClose, // we will implement this later!
