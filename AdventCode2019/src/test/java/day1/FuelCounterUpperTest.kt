package day1

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class FuelCounterUpperTest {

    private val fuelCounterUpper = FuelCounterUpper()

    @Test
    fun `fuel required is 2 for module mass of 12`() {
        val moduleMass = 12
        val result = fuelCounterUpper.calculateFuelRequired(moduleMass)

        assertThat(result).isEqualTo(2)
    }

    @Test
    fun `fuel required is 2 for module mass of 14`() {
        val moduleMass = 14
        val result = fuelCounterUpper.calculateFuelRequired(moduleMass)

        assertThat(result).isEqualTo(2)
    }

    @Test
    fun `fuel required is 654 for module mass of 1969`() {
        val moduleMass = 1969
        val result = fuelCounterUpper.calculateFuelRequired(moduleMass)

        assertThat(result).isEqualTo(654)
    }

    @Test
    fun `fuel required is 33583 for module mass of 100756`() {
        val moduleMass = 100756
        val result = fuelCounterUpper.calculateFuelRequired(moduleMass)

        assertThat(result).isEqualTo(33583)
    }
}