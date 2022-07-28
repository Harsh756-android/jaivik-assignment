package `coditional assingment`

fun main()
{
    println("Enter a Number :")
    var num= readLine()!!.toInt()

    println("Factor of $num :")

    for(i in 1..num)
    {
        if(num%i==0)
        {
            println("$i")
        }
    }
}