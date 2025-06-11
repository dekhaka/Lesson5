fun main() {

    val numberOne = 5
    val numberTwo = 7
    val correctAnswer = numberOne * numberTwo

    println("Решите простой прирмер, для того чтобы доказать, что вы не бот!: $numberOne x $numberTwo = ?")
    println("Ваш ответ: ")
    val answerExample = readln().toInt()

    val accesMessage = if (answerExample == correctAnswer) {
        "Добро пожаловать!"
    } else{
        "Доступ запрещен."
    }
    println(accesMessage)
}