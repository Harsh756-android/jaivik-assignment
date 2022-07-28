package `coditional assingment`

fun main()
{
    println("Enter a Number : ")

    var num:Double= readLine()!!.toDouble()

    if(num>0)
    {
        println("$num is Positive Number")
    }
    else
    {
        println("$num is a Negetive Number")
    }
}