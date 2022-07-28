fun main(){
    var no1=10
    var no2=1000

    for (number in no1 + 1..no2 - 1) {
        if (checkarmstrong(number))
            print("$number ")
    }
}
fun checkarmstrong(num:Int):Boolean{
    var digits=0
    var result=0
    var originalno=num

    while(originalno!=0)
    {
       originalno/=10
       ++digits
    }

    originalno=num

    while (originalno!=0)
    {
        var reminder=originalno%10
        result+=Math.pow(reminder.toDouble(),digits.toDouble()).toInt()
        originalno/=10
    }
    if(result==num)
        return true

    return false
}