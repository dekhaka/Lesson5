import kotlin.random.Random

fun main() {

    val numberRageStart = 0
    val numberRangeEnd = 42
    val numberToGuess = 3
    val winnigNumbers = List(numberToGuess) { Random.nextInt(numberRageStart,numberRangeEnd) }.distinct().take(numberToGuess)
    val userNumbers = mutableListOf<Int>()

    println("Угадайте числа от 0 до 42.")

    repeat(numberToGuess) { index ->
        println("Введите число ${index + 1}: ")
        val input = readLine()?.toIntOrNull()

        if (input == null || input !in numberRageStart..numberRangeEnd) {
            println("Ошибка введите корректное число в диапазоне от 0 до 42!")
            return
        }

        userNumbers.add(input)
    }

    val matches = userNumbers.intersect(winnigNumbers.toSet())
    val matchCount = matches.size

    when (matchCount) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли ДЖЕКПОТ!")
        2 -> println("Поздравляем! Вы угадали 2 числа вы достойны КРУПНОГО ПРИЗА!")
        1 -> println("Поздравляем! Вы угадали одно число получите утешительный приз!")
        else -> println("К сожалению, вы не угадали ни одного числа.")
    }

    println("Выигрышные числа: ${winnigNumbers.joinToString(", ")}")
}