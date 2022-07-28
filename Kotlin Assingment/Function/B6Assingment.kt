fun main()
{
    var number=34
    var flag=false

    for (i in 2..number / 2) {

        if (checkPrime(i)) {

            if (checkPrime(number - i)) {

                print("$number = $i + " + (number-i) + "\n")
                flag = true
            }

        }
    }

    if (!flag)
        println("$number cannot be expressed as the sum of two prime numbers.")

}
fun checkPrime(num:Int):Boolean{
    var flag=true

    for(i in 2..num/2)
    {
        if(num%i==0)
        {
            flag=false
            break
        }
    }
    return flag
}