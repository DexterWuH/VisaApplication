package com.example.visaapplication.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.visaapplication.model.CountryVisaTypes
import com.example.visaapplication.model.VisaDetail
import com.example.visaapplication.repository.CountryVisaTypesRepo
import com.example.visaapplication.repository.VisaDetailRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

interface MainScreenViewModelContract {
    fun fetchData()
}

@HiltViewModel
class MainScreenViewModel @Inject constructor(
    private val countryVisaTypesRepo: CountryVisaTypesRepo,
    private val visaDetailRepo: VisaDetailRepo,
) : ViewModel(), MainScreenViewModelContract {

    private val _visaDetail = MutableStateFlow<VisaDetail?>(null)
    val visaDetail: StateFlow<VisaDetail?> = _visaDetail
    private val _countryVisaTypes = MutableStateFlow<CountryVisaTypes?>(null)
    val countryVisaTypes: StateFlow<CountryVisaTypes?> = _countryVisaTypes

    override fun fetchData() {
        viewModelScope.launch {
            //      val visaUUID = countryVisaTypes.visaUUID
            //      val visaDetail = visaDetailRepo.fetchVisaDetail(visaUUID)
            //      _visaDetail.value = visaDetail
            _countryVisaTypes.value = countryVisaTypesRepo.fetchCountryVisaTypes()

        }
    }
}



