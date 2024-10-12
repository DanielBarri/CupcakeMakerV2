package com.ebc.cupcakemakerv2.model

data class CupcakeOrderState(
    val flavor: String = "",
    val quantity: Int = 0,
    val price: Double = 15.0,
    val total: Double = 0.0,
    val extraInstructions: String = "",
    val pickupInstructions: String = "",
    val pickupDate: String = ""
)
