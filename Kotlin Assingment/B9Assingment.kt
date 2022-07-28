fun main()
{
    println("Enter a number:")
     var num1=readLine()!!.toInt()

    if(num1%2==0) {
        println("$num1 is Even")
    }
    else {
        println("$num1 is odd")
    }
}