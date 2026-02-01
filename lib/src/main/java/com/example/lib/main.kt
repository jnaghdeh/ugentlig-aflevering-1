//Aflveringen starter fra linje 177//

package com.example.lib

import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt

/*fun main () {

    val age: Int = 20

    var height: Double = 1.73

    var shoeSize: Double = 42.5

    val name: String = "Jacob"

    val lastName: String = "Naghdeh"

    val fullName: String = name + " " + lastName

    fun areEqualIgnoreCases(a: String, b: String): Boolean{
        return a.lowercase() == b.lowercase()
    }

    fun trueOrFalseChecker () {
        println(areEqualIgnoreCases("hello", "ello"))

        println(areEqualIgnoreCases("bike", "banana"))

        println(areEqualIgnoreCases("name", "naMe"))

        println(areEqualIgnoreCases("yes", "YES"))
    }
trueOrFalseChecker()

}

fun main() {
    var sum: Int = 0

    for (i in 1..50) {
        if (i % 2 == 0) {
            sum = sum + i
        }
    }

println(sum)
}

fun main () {
    val prices = listOf<Int>(530, 720,124,599,5,10,47)

    val pricesDescending = prices.sortedDescending()

    val secondHighest = pricesDescending[1]

    println(secondHighest)
}


fun main () {
    for (i in 1..100){
        println(i)
        val isEven = i % 2 == 0
        val squareRoot = sqrt(i.toDouble())
        val isPerfect = ceil(squareRoot/3) == floor(squareRoot/3)
        if (isEven && isPerfect){
            println(isPerfect)
        }
    }
}

fun main () {

    println("Opgave 1:")

    println(rectangleArea(8.5, 5.5))

    println(rectanglePerimeter(2, 8.5, 5.5))

    println("Opgave 2:")

    println(printStats(10,5))

    println("Opgave 3:")

    println(filter)




    //samme logik i kotlin
    val tal = listOf(1, 2, 3)
    tal.forEach { it * 2 }  // Printer 2, 4, 6 (sidste linje returneres)



    //simpel med en parameter
    val dobbelt = { x: Int -> x * 2 }  // Lambda gemt i 'dobbelt' (som en val)
    println(dobbelt(5))  // Udsiger: 10


    //simpel med to parametre
    val addér = { a: Int, b: Int -> a + b }

    println(addér(5, 3))  // Printer: 8



    //komplekst lambda

    println("komplekst eksempel på lambda")


        // Lambda med logik: tager et tal og checker om det er "godt"
        val vurderTal = { tal: Int ->
            if (tal > 5) {
                "Godt tal: $tal 👍"
            } else {
                "For lille: $tal 👎"
            }
        }

        println(vurderTal(3))  // "For lille: 3 👎"
        println(vurderTal(8))  // "Godt tal: 8 👍"


}


// Opgave 1
fun rectangleArea (height: Double, width: Double): Double {
    return height * width
}

fun rectanglePerimeter (multiplier: Int, height: Double, width: Double): Double {
    return multiplier * (height + width)
}


//Opgave 2
fun printStats(a: Int, b: Int) {

    println("Mit første tal er: " + a)
    println("Mit andet tal er: " + b)

    println("sum: " + a + b)

    println("Difference: " + (a - b))

println("Gange: " + a*b)

    println("Gennemsnit: " + (a+b).toDouble()/2)

println("Distancen: " + abs(a-b))

    println("Det største tal: " + maxOf(a,b))

    println("Det mindste tal: " + minOf(a,b))
}



//Opgave 3

val prices = mutableListOf(3, 6, 87, 99, 100, 101, -6)

val filter = prices.filter { it > 10 }


//opgave 4
 */

fun main () {

    //Opgave 1//
//Funktion starter fra linje: 292//
    println("Opgave 1:")

    println("Please enter your age: ")

    val ageInput = readln()

    val age = ageInput.toInt()

    val eligibleOrNot = eligibleToVote(age)

    println(eligibleOrNot)



    //Opgave 2//
//Funktion starter fra linje: 303//
    println("Opgave 2:")

    val max : Int = getMax(5,19,8);

    val min : Int = getMin(2,16,1);

    println(max);
    println(min);


    //opgave 3//
    //Funktion starter fra linje: 329//

    println("opgave 3:")

val listOfNumbers = listOf<Int>(1,2,3,4,5,6,7)

    val avg = calculateAverage(listOfNumbers)

    println(avg)


    //Opgave 4//
    //Funktion starter fra linje: 345//

    println("Opgave 4:")

val firstCpr = "0804051234"

    val secondCpr = "5808051234"

    val thirdCpr = "0844051234"

    val fourthCpr = "123456789"




    println(validCprChecker(firstCpr))
    println(validCprChecker(secondCpr))
    println(validCprChecker(thirdCpr))
    println(validCprChecker(fourthCpr))


    //opgave 5//
    //Der er ikke lavet noget udenfor main i denne//

    println("Opgave 5:")

    for (i in 1..100) {
        if (i % 3 == 0 && i % 5 == 0)
println("FizzBuzz")
        else if (i % 3 == 0)
            println("Fizz")
        else if (i % 5 == 0)
            println("Buzz")
        else
            println(i)
    }


    //Opgave 6//
    //Funktion starter fra linje: 377//

    println("Opgave 6:")

    val fullName = "Jacob Naghdeh"

    val abbreviatedName = abbreviateName(fullName)

    println(abbreviatedName)


    //Opgave 7//
    //Funktion starter fra linje: 397//

    println("Opgave 7:")

val grade1 = calculateGrade(87)
val grade2 =calculateGrade(98)
val grade3 =calculateGrade(44)

    println(grade1)
    println(grade2)
    println(grade3)



    //Opgave 8//
    //Funktion starter fra linje: 415//

    println("Opgave 8:")

val words = listOf("Jacob", "Benjamin", "Cristiano", "Ronaldo")

    val filtered = filterWordsByLength(words, 6)

    println(filtered)

}

//Opgave 1//
fun eligibleToVote (age: Int): String {

    if (age >= 18)
        return "You are eligible to vote"
    else
        return "You are not eligible to vote"
}



//Opgave 2//


fun getMax (a: Int, b: Int, c: Int): Int {

    var max = a

    if (b > max) { max = b }

    if (c > max) { max = c }

    return max
}

fun getMin (a: Int, b: Int, c: Int): Int {

    var min = a

    if (b < min) { min = b }

    if (c < min) { min = c }

    return min
}


//Opgave 3//

fun calculateAverage (listOfNumbers: List<Int>): Double {

    var sum = 0

    for (eachNumber in listOfNumbers) {
        sum = sum + eachNumber
    }

    val average = sum.toDouble()/listOfNumbers.size.toDouble()

    return average
}


//Opgave 4//

fun validCprChecker(cpr: String): Boolean {

    if (cpr.length != 10) {
        return false
    }

    val stringForDay = cpr.substring(0,2)

    val stringForMonth = cpr.substring(2,4)



    val day = stringForDay.toInt()

    val month =stringForMonth.toInt()

    if (day>31) {
        return false
    }

    if (month > 12) {
        return false
    }

    return true
}


//opgave 5 er lavet fuldstændig i main//

//opgave 6//

fun abbreviateName (fullName: String): String {

    val nameSplitter = fullName.split(" ")

    var result = ""

    for (i in 0 until  nameSplitter.size-1){
        val firstCharacter = nameSplitter[i][0]
        result = result + firstCharacter + "."
    }

    val lastName = nameSplitter[nameSplitter.size-1]
    result = result + " " + lastName

    return result
}


//Opgave 7//

fun calculateGrade (grade: Int): String {
if (grade>=90) {
    return "A"
} else if (grade >= 80) {
    return "B"
} else if (grade >= 70) {
    return "C"
} else if (grade >= 60) {
    return "D"
} else {
    return "F"
}

}


//Opgave 8//

fun filterWordsByLength (words: List<String>, minLength: Int): List<String> {
return words.filter { words -> words.length >= minLength }
}