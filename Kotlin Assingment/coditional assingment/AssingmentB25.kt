package `coditional assingment`
fun main()
{
    println(""" 1)Addition
        |       2)Substraction
        |       3)Multiplication
        |       4)Division
        """.trimMargin())

    println("Enter Num1: ")
    var num1= readLine()!!.toInt()
    println("Enter a Num2: ")
    var num2= readLine()!!.toInt()

    println("Enter a Choice : ")
    var Choice= readLine()!!.toInt()

    when(Choice)
    {
        1-> println("Addition is ${num1+num2}")
        2->println("Substraction is ${num1-num2}")
        3->println("Multiplication is ${num1*num2}")
        4->println("Division is ${num1/num2}")
        else->println("Invalid Choice")
    }
}