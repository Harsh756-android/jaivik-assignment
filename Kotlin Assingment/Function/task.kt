package Function

fun main()
{
    var list = mutableListOf<String>()
    var isContinue=true

    while(isContinue)
    {
        var message="""
                        1. add item
                        2. remove item
                        3. update item
                        4. show list


                        Enter choice :
        """.trimIndent()

        print(message)
        var choice = readLine()!!.toInt()

        when(choice)
        {
            1->{
                println("Enter a Item :")
                var item=readLine()!!.toString()
                list.add(item)

                println("Enter your Item Succesfully")

                println("Are you wants to Continue?Y/N:")
                var value= readLine()!!.toString()[0]
                if(value=='y' || value=='Y') {
                    println(message)
                }
                else {
                    println("Thank You")
                }
            }
            2->
            {
                println(list)
                println("Which value u wants to Delete :")
                var value= readLine()!!.toString()
                if(list.remove(value)) {
                    println("Remove Item Successfully")
                }
                else{
                    println("Invalid value:")
                }
            }
            3->
            {
                println(list)
                println("Which value u Update :")
                var value= readLine()!!.toString()
                if(isContains(list, value))
                {
                    print("enter new value : ")
                    var nValue = readLine()!!.toString()


                    list[getSelectedIndex(list, value)] = nValue
                    println("Item updated successfully")

                } else {
                    println("list does not contains $value")
                }
                }
            
            4->
            {
                println(list)
            }
            else->
            {
                println("Invalid value:")
            }
        }
    }
}