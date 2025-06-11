fun main() {
    // Заранее заданные правильные числа
    val correctNumber1 = 17
    val correctNumber2 = 42

    // Ввод чисел пользователем
    print("Введите первое число от 0 до 42: ")
    val userNumber1 = readLine()?.toIntOrNull()

    print("Введите второе число от 0 до 42: ")
    val userNumber2 = readLine()?.toInt()


    val guessedBoth = (userNumber1 == correctNumber1 && userNumber2 == correctNumber2) ||
            (userNumber1 == correctNumber2 && userNumber2 == correctNumber1)

    val guessedOne = (userNumber1 == correctNumber1 && userNumber1 == correctNumber2 ||
            userNumber2 == correctNumber1 || userNumber2 == correctNumber2)

    when {
        guessedBoth -> println("Поздравляем! Вы выиграли главный приз!")
        guessedOne -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")
    }

    println("Правильные числа были: $correctNumber1 и $correctNumber2")
}