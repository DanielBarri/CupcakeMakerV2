package com.ebc.cupcakemakerv2.view.components.cupcakeWizard

import android.icu.util.Calendar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.ebc.cupcakemakerv2.viewmodel.CupcakeMakerViewModel
import java.text.SimpleDateFormat

fun createPickupOptions() : List<String> {
    val dateOptions = mutableListOf<String>()
    val dateFormat = SimpleDateFormat("E MMM d")
    val calendar = Calendar.getInstance()

    repeat(5){
        dateOptions.add(dateFormat.format(calendar.time))
        calendar.add(Calendar.DATE, 1)
    }

    return dateOptions
}

@Composable
fun SelectDataScreen(navController: NavController,
                     cupcakeMakerViewModel: CupcakeMakerViewModel) {
    Text("Select Date Placeholder")
    println(createPickupOptions())
}