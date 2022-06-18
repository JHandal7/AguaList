package com.example.agualist


data class WellnessTask(val id: Int, val label: String)

//There's one more change you need to make.
// The items method receives a key parameter. By default,
// each item's state is keyed against the position of the item in the list.
//
//In a mutable list, this causes issues when the data set changes,
// since items that change position effectively lose any remembered state.
//
//You can easily fix this by using the id of each WellnessTaskItem as the key for each item.

//@Composable
//fun WellnessTasksList(
//   list: List<WellnessTask>,
//   onCloseTask: (WellnessTask) -> Unit,
//   modifier: Modifier = Modifier
//) {
//   LazyColumn(modifier = modifier) {
//       items(
//           items = list,
//           key = { task -> task.id }
//       ) { task ->
//           WellnessTaskItem(taskName = task.label, onClose = { onCloseTask(task) })
//       }
//   }
//}