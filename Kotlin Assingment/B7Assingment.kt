fun main()
{
    println("enter the Divided Number:")
    var Dividedno:Int= readLine()!!.toInt()

    println("enter the Diviser Number:")
    var Diviserno:Int= readLine()!!.toInt()

    var quotient : Int = Dividedno/Diviserno
    var Remainder:Int=Dividedno%Diviserno

    println("quotient is $quotient")
    println("Reminder is $Remainder")
}