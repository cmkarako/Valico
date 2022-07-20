package com.example.valico.UI.freestyle

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.example.valico.data.*
import com.example.valico.util.UiEvent
import dagger.Provides
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import javax.inject.Inject

@HiltViewModel
class FreestyleViewModel @Inject constructor(
    private val repository: FreestyleRepository
) : ViewModel() {

    val freestyles = repository.getFreestyles()


//    val myBarrelFreestyle: LiveData<List<Freestyle>>


    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

//    fun reorderBarrelFreestyle(barrelFreestyle: BarrelFreestyle) {
//
//    }

    fun addToBarrelFreestyle() {

    }



    fun onEvent(event: FreestyleEvent) {
        when(event) {
            is FreestyleEvent.OnFreestyleClick -> {
                //add itemtouchhelper here
                freestyles
            }
            is FreestyleEvent.OnAddFreestyleClick -> {

            }
            is FreestyleEvent.OnUndoDeleteFreestyle -> {

            }
            is FreestyleEvent.DeleteFreestyle -> {

            }

        }
    }



}