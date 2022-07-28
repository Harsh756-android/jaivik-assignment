package `coditional assingment`

fun main()
{
    println("Enter a choice : ")

   var choice = readLine().toString()[0]

    when(choice)
    {
        'a','i','o','u','p'->println("$choice is Vowel")

        else->println("$choice is consonant")
    }

}