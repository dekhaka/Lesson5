import kotlin.math.pow

fun main() {

    println("Введите ваш вес в киллограммах: ")
    val userWeight = readln().toFloat()

    println("Введите ваш рост в сантиметрах")
    val userHigh = readln().toFloat()

    val heighMeters = userHigh/CM_IN_METERS

    val imt = userWeight / heighMeters.pow(2)

    val category = when {
        (imt < FIRST_VALUE) -> ("Недостаточная масса тела.")
        (imt >= FIRST_VALUE && imt < SECOND_VALUE) -> ("Нормальная масса тела")
        (imt>= SECOND_VALUE && imt < THIRD_VALUE) -> ("Избыточная масса тела")
        (imt >= THIRD_VALUE) -> ("Ожирение")
     else -> "Ошибка при определении категории"
    }
    println(category)
    println("Ваш ИМТ: %.2f".format(imt))

}
const val FIRST_VALUE = 18.5
const val SECOND_VALUE = 25
const val THIRD_VALUE = 30
const val CM_IN_METERS = 100

