package `coditional assingment`

fun main()
{
    var line="i love my India proud to be an Indian"
    var vowel=0
    var constant=0
    line=line.toLowerCase()

    for(i in 0..line.length-1)
    {
        var ch=line[i]
        if (ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u') {
            ++vowel
        }
        else if(ch in 'a'..'z')
        {
            ++constant
        }
    }
        println("Vowel :$vowel")
        println("Constant :$constant")
}