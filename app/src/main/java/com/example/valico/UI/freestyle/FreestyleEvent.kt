package com.example.valico.UI.freestyle

import com.example.valico.data.Freestyle

sealed class FreestyleEvent {
    data class DeleteFreestyle(val freestyle: Freestyle): FreestyleEvent()
    object OnUndoDeleteFreestyle: FreestyleEvent()
    data class OnFreestyleClick(val freestyle: Freestyle): FreestyleEvent()
    object OnAddFreestyleClick: FreestyleEvent()
}
