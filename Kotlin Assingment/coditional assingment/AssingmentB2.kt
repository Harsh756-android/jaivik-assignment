package `coditional assingment`

fun main()
{
    println(""" 
            1)EN
            2)FR
            3)IT
    """.trimIndent())

    println("Enter a Choice")
    var choice = readLine()!!.toInt()

    when(choice)
    {
        1-> println("Hello")
        2->println("Salute")
        3-> println("Ciao")

        else->println("Invalid Choice")
    }

}