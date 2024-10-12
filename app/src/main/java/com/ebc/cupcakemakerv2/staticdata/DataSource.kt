package com.ebc.cupcakemakerv2.staticdata


import com.ebc.cupcakemakerv2.R

object DataSource {
    val flavorsKeys = listOf(
        R.string.vanilla,
        R.string.chocolate,
        R.string.red_velvet,
        R.string.salted_caramel,
        R.string.coffee,
        R.string.carrot
    )

    val quantityOptions = listOf(
        Pair(R.string.cupcake_tag, 1),
        Pair(R.string.cupcake_tag, 6),
        Pair(R.string.cupcake_tag, 12)
    )
}