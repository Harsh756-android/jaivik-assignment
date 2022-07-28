package `coditional assingment`

fun main()
{
    var count=0
    println("Enter a Number: ")
    var num:Int= readLine()!!.toInt()
    while(num!=0)
    {
        num/=10
        count++
    }

    println("count of number is :$count")
}