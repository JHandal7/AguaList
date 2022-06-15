# AguaList
ComposableList
If you click the X in each row, the events go all the way up to the list that owns the state, removing the item from the list and causing 
Compose to recompose the screen.

If you try to use rememberSaveable() to store the list in WellnessScreen, you'll get a runtime exception:

