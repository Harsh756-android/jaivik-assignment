package `coditional assingment`
fun main()
{
    println("Enter a Number")
    var num= readLine()!!.toInt()
    var reminder:Int
    var result=0
    var originalno:Int
     originalno=num

    while(originalno!=0)
    {
        reminder=originalno%10
        result+= Math.pow(reminder.toDouble(),3.0).toInt()
        originalno/=10
    }
    if(result==num)
        println("$num is a Armstrong Number")
    else
        println("$num is not Armstrong Number")
}