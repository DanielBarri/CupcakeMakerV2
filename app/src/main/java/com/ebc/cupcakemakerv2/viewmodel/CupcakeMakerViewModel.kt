package com.ebc.cupcakemakerv2.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.ebc.cupcakemakerv2.enumerators.ViewModelIDs
import com.ebc.cupcakemakerv2.model.CupcakeOrderState

class CupcakeMakerViewModel: ViewModel() {
    //Esta es la variable de estado... va a dar seguimiento a los cambios.
    var state by mutableStateOf(CupcakeOrderState())
        private set

    /**
     * Si alguien solicita un cambio al state, esta funcion se encargara de ejecutar el cambio.
     * Opciones disponibles: flavor, quantity, price, pickupDate, extraInstructions, pickupInstructions
     */
    fun onValue(value:String, textId:String) {
        when (textId) {
            ViewModelIDs.Flavor.id -> state = state.copy(flavor = value)
            ViewModelIDs.Quantity.id -> {
                state = state.copy(quantity = value.toInt())
                calculateTotalAmount()
            }
            ViewModelIDs.Price.id -> {
                state = state.copy(price = value.toDouble())
            }
            ViewModelIDs.PickupDate.id -> state = state.copy(pickupDate = value)
            ViewModelIDs.ExtraInstructions.id -> state = state.copy(extraInstructions = value)
            ViewModelIDs.PickupInstructions.id -> state = state.copy(pickupInstructions = value)
        }
    }

    /**
     * Funcion para calcular total de la orden
     */
    private fun calculateTotalAmount() {
        val quantity = state.quantity
        val price = state.price
        val total = quantity * price

        state = state.copy(total = total)
    }

    /**
     * Funcion para hacer un reset a la orden e iniciar de nuevo
     */
    fun reset() {
        state = CupcakeOrderState()
    }

}