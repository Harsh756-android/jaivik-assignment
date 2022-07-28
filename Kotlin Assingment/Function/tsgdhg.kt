package Function
fun main() {

    var list = mutableListOf<String>()
    var isContinue = true

    while (isContinue) {

        var message = """
        1. add item 
        2. delete item
        3. update item
        4. show list
        
        enter your choice : 
        
    """.trimIndent()

        print(message)

        var choice = readLine()!!.toInt()

        when (choice) {
            1 -> {
                print("Enter item : ")
                var item = readLine()!!.toString()
                list.add(item)

                println("Item added successfully")

            }
            2 -> {
                println(list)
                print("Enter value you want delete : ")
                var value = readLine()!!.toString()

                if (isContains(list, value)) {

                    list.removeAt(getSelectedIndex(list, value))

                    println("item removed successfully")
                } else {
                    println("list does not contains $value")
                }

            }
            3 -> {
                println(list)
                print("Enter value you want update : ")
                var value = readLine()!!.toString()

                if (isContains(list, value)) {

                    print("enter new value : ")
                    var nValue = readLine()!!.toString()


                    list[getSelectedIndex(list, value)] = nValue
                    println("Item updated successfully")

                } else {
                    println("list does not contains $value")
                }
            }

            4 -> {
                println(list)
            }
            else -> {
                println("invalid input : ")
            }
        }

        println("Are you want to continue? Y/N")
        var selection = readLine()!!.toString()[0]
        isContinue = selection == 'Y' || selection == 'y'

    }

    println("Thank You")


}

fun getSelectedIndex(list: MutableList<String>, value: String): Int {
    list.forEach {
        if (it.equals(value, ignoreCase = true))
            return list.indexOf(it)
    }
    return -1
}

fun isContains(list: MutableList<String>, value: String): Boolean {

    list.forEach {

        if (it.equals(value, ignoreCase = true))
            return true
    }

    return false
}