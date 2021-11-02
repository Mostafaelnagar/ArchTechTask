package com.structure.base_mvvm.presentation.base

import androidx.lifecycle.ViewModel
import com.structure.base_mvvm.presentation.base.utils.SingleLiveEvent

open class BaseViewModel : ViewModel() {

  var singleEvent: SingleLiveEvent<Int> = SingleLiveEvent()
}