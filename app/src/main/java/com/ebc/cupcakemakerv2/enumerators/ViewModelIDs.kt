package com.ebc.cupcakemakerv2.enumerators

enum class ViewModelIDs(val id: String) {
    Flavor(id = "flavor"),
    Quantity(id = "quantity"),
    Price(id = "price"),
    PickupDate(id = "pickupDate"),
    ExtraInstructions(id = "extraInstructions"),
    PickupInstructions(id = "pickupInstructions")
}