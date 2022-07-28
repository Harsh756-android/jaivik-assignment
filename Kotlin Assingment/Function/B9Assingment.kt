fun main()
{


    println("Enter two positive integers: ")

    var n1:Int= readLine()!!.toInt()
    var n2:Int= readLine()!!.toInt()

    println( "$n1, $n2, ${gcd(n1, n2)}")
    return
}
fun gcd(num1:Int,num2:Int):Int{
    if (num2 != 0)
        return gcd(num2, num1 % num2);
    else
        return num1
}