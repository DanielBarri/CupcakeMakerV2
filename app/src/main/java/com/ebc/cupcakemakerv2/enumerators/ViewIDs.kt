package com.ebc.cupcakemakerv2.enumerators


enum class ViewIDs(val id:String, val tag: String) {
    Splash(id = "Splash", tag = "Splash"),
    Home(id = "Home", tag="Home"),
    Start(id= "Start", tag = "Inicio"),
    Flavors(id = "Flavors", tag = "Sabores"),
    SelectDate(id = "SelectDate", tag = "Fecha de envío"),
    OrderSummary(id ="OrderSummary", tag = "Resumen de compra"),
    FinishOrder(id = "FinishOrder", tag = "Finalizar")
}