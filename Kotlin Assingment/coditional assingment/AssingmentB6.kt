package `coditional assingment`

fun main()
{
    println("Enter a Year: ")
    var Year= readLine()!!.toInt()

    if(Year%4==0)
    {
        println("$Year is a Leapyear")
    }
    else
    {
        println("$Year is a not Leapyear")
    }
}