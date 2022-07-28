package `coditional assingment`
fun main(args: Array<String>) {
    println("Enter a Number: ")
    var num = readLine()!!.toInt()
    var reversed = 0

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }

    println("Reversed Number: $reversed")
}