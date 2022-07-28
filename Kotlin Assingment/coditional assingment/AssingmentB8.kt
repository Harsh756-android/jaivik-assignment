package `coditional assingment`

fun main()
{
    println("Enter a Character: ")

    var ch= readLine().toString()[0]

    if(ch>='a'&&ch<='z' ||ch>='A'&&ch<='Z')
    {
        println("$ch is a Alphabet")
    }
    else
    {
        println("$ch is a Not Alphabet")
    }
}