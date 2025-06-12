fun main() {

    println("Расстояние поездки (в километрах):")
    val userTravelDistance = readln().toFloat()

    println("Расход топлива на 100км. (в литрах):")
    val userFuelConsumption = readln().toFloat()

    println("Текущая стоимость топлива:")
    val userFuelCost = readln().toFloat()

    val fuel = (userTravelDistance * userFuelConsumption) / KILLOMETRS
    val cost = fuel * userFuelCost

    println("Общее количество необходимого топлива: $fuel")
    println("Стоимость поездки: %.2f".format(cost))

}
const val KILLOMETRS = 100