package day1

import kotlin.math.roundToInt

class FuelCounterUpper {
    fun calculateFuelRequired(module: Int) =
            ((module / 3).toDouble().roundToInt()) - 2
}