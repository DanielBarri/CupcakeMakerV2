package com.ebc.cupcakemakerv2.view.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ebc.cupcakemakerv2.enumerators.ViewIDs
import com.ebc.cupcakemakerv2.view.components.cupcakeWizard.SelectFlavorScreen
import com.ebc.cupcakemakerv2.view.components.cupcakeWizard.StartOrderScreen
import com.ebc.cupcakemakerv2.viewmodel.CupcakeMakerViewModel

//Todo: Crear funcion para el topbar
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CupcakeAppBar() {
    CenterAlignedTopAppBar(
        title = {},
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        )
    )
}

//Todo: Crear el nav manager
@Composable
fun NavigationManager(cupcakeMakerViewModel: CupcakeMakerViewModel) {
    val navController = rememberNavController()

    Scaffold(
        topBar = {CupcakeAppBar()},
        bottomBar = { Text(text = "I'm the bottom container") }

    ) {
      NavHost(
          navController = navController,
          startDestination = ViewIDs.Start.id,
          modifier = Modifier
              .fillMaxSize()
              .padding(it)
      ) {
          composable(ViewIDs.Home.id) {
              Text(text = "Placeholder Home")
          }
          composable(ViewIDs.Start.id) {
              StartOrderScreen(navController, cupcakeMakerViewModel)
          }
          composable(ViewIDs.Flavors.id){
              SelectFlavorScreen(navController, cupcakeMakerViewModel)
          }
      }
    }
}