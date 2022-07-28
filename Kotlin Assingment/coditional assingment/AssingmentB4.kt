package `coditional assingment`

fun main()
{
    println("Enter a Num1: ")

    var num1= readLine()!!.toInt()

    println("Enter a Num2: ")

    var num2= readLine()!!.toInt()

    println("Enter a Num3: ")

    var num3= readLine()!!.toInt()

    while(num1>num2 && num1>num3)
    {
        println("This no is larger $num1")
        break
    }

    while(num2>num1 && num2>num3)
    {
        println("This no is larger $num2")
        break
    }

    while(num3>num1 && num3>num3)
    {
        println("This no is larger $num3")
        break
    }


}