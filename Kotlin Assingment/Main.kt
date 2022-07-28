package null_safety

/*
    Not null assertion : !! Operator
    The not null assertion (!!) operator converts any value to a non-null type and throws an exception if the value is null.

    Safe Call operator(?.)
    It allows us to combine a null-check and a method call in a single expression.

    Elvis Operator(?:)
The Elvis operator is used to return a non-null value or a default value when the original variable is null.
*/

fun main()
{
    var name:String? = null     // nullable variable

    println("length : ${name?.length}")         // safe call operator

    if(name!=null)
        println("substring : ${name!!.substring(1..5)}")  // non-null assertion*/

    var str = name?:"Not Assign"      // ?: elvish operator
    println("str : $str")
}