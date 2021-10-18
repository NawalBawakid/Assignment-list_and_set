import java.io.File

fun main(args: Array<String>) {

    // Q1
    // Create a list of 3 elements of your favourite city's names
    // then add more 2 elements
    // then update last element
    // finally print the whole list with the numbers

    println("Part|")
    var favorateCity = mutableListOf("London", "america", "paris")
    favorateCity.addAll(listOf("jeddah", "riyadh"))
    favorateCity[4] = "makkah"


    favorateCity.forEachIndexed { index, data ->
        println("$index - $data")
    }

    println("")

    // Q2
    // Create a list of integer with 5 elements
    // then update the 3th element to 12
    // then check if the 12 is existing delete the element
    // finally print the list

    println("Part||")
    var num: MutableList<Int> = mutableListOf(9, 1, 5, 11, 10)
    num[2] = 12
    num.remove(12)
    println(num)


    println("")

    println("more practice (Options)")
    println("Q1.1")
    //Create a text file and read it
    var cityInFile = File("data/datafile.txt").readText().split("/n")
    println(cityInFile)

    println("")

    println("Q1.2")
    // Create a list of 10 number then return the maximum number
    var numbers = mutableListOf(4, 10, 2, 19, 1, 6, 9, 3, 5, 8)
    var largest = numbers.maxOrNull() ?: 0
    println(largest)



}