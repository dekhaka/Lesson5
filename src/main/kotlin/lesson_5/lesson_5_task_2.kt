fun main() {
    println("Введите ваш год рождения:  ")
    val birthYear = readln().toInt()
    val userAge = CURRENT_YEAR - birthYear

    if (userAge >= AGE_OF_MAGORITY) {
        println("Показать экран со скрытым контекстом")
    } else {
        println("Контент недоступен для несовершеннолетних")
    }
}
const val AGE_OF_MAGORITY =18
const val CURRENT_YEAR = 2025