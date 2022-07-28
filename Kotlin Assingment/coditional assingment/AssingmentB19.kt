package `coditional assingment`

fun main()
{
    println("Enter a Number : ")
    var num= readLine()!!.toInt()
    var reminder:Int
    var reverseino=0
    var originalno:Int

    originalno=num

    while(num!=0)
    {
        reminder=num%10
        reverseino=reverseino*10+reminder
        num/=10
    }

    if(originalno==reverseino)
        println("This no is palindrom")
    else
        println("This no is not palindrom")

}