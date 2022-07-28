fun main()
{
    val str="i love my india"
    val ch='i'
    var frequency=0

    for(i in 0..str.length-1)
    {
        if(ch==str[i])
        {
            ++frequency
        }
    }

    println("Frequency of $ch = $frequency")
}