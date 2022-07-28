package Function

fun main()
{
    var m= max(100,87)
    println("$m")
}
fun max(num1:Int,num2:Int) {
    if(num1>num2)
        println("$num1 is Max")
    else
        println("$num2 is Max")
}