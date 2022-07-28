fun main()
{
    var no1=10
    var no2=100

    while(no1<no2)
    {
        if (primecheck(no1))
            println(no1.toString() + " ")

        ++no1
    }

}
fun primecheck(num:Int): Boolean {
    var flag=true

    for(i in 2..num/2) {
        if (num % i == 0) {
            flag = false
            break
        }

    }
    return flag
}

