package `coditional assingment`

fun main()
{
    println("Enter a Number :")
    var num= readLine()!!.toInt()
    var Ans:Int=0
    var i:Int=1

    for(i in 1..10) {
        Ans = num * i

        println("$num * $i = $Ans")
    }
 // println("Table is $num * i =$Ans")

}