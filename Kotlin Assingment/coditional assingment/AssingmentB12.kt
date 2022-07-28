package `coditional assingment`

fun main()
{
    var num1=0
    var num2=1
    var num3:Int
    println("Enter a Number :")
    var number= readLine()!!.toInt()
    for(i in 2..number)
    {
        num3=num1+num2
        println("$num3")

        num1=num2
        num2=num3
    }
}