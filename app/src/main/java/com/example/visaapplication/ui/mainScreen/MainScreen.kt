package com.example.visaapplication.ui.mainScreen

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.visaapplication.viewModel.MainScreenViewModel

@Preview
@Composable
fun MainScreen() {
    val mainScreenViewModel : MainScreenViewModel = hiltViewModel()
}