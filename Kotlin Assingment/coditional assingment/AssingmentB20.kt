package `coditional assingment`
fun main()
{
    println("Enter a Number: ")
    var num= readLine()!!.toInt()
    var flag=false

    var i:Int
        for(i in 2.. num/2)
        {
          if(num%i==0)
          {
              flag=true
              break
          }
        }
    if(!flag)
        println("$num number is prime")
    else
        println("$num number is not prime")
}