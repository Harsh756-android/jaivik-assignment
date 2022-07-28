package `coditional assingment`

fun main()
{
    println("Enter a Number:")
    var num= readLine()!!.toInt()
    var fact=1

    for(i in 1..num)
    {

        fact *= i
    }
    println("The Factorial is:$fact")
}