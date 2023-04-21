fun main() {
    oddNums()
    println(listOfNames(arrayOf("Jemima","Wanjiru","Dre","Gichuki")))
    drinks(6)
    nums()
    selectContainer(4)

}
//Create a function that prints out all the odd numbers between 1 and 100 (2pts)

fun oddNums(){
    for (num in 1..100){
        if(num % 2 != 0){
            println(num)
        }
    }

}
//2. Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)

fun listOfNames(names:Array<String>): Int{
    var sum = 0
    for(name in names){
        if(name.length>5){
            sum++
        }
    }
    return sum

}
//3. You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
fun drinks(age: Int){
    if(age in 0..5){
        println("milk")
    }
    else if (age in 7..14)
        println("fanta orange")
    else{
        println("coca cola")
    }

}
//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)

fun nums() {
    for (num in 1..100) {
        if(num % 3 == 0 && num % 5 == 0){
            println("FizzBuzz")
        }
        else if (num % 5 == 0){
            println("Buzz")
        }
        else if(num % 3 == 0){
            println("Fizz")
        }
        else{
            println(num)
        }
    }
}
fun selectContainer(litres: Int){
    when(litres){
        1,2,3-> println("Pour the water into a bottle")
        4,5,6,7-> println("Pour the water into a bucket")
        8,9 -> println("Pour the water into a big bucket")
        else-> println("Pour the water into a jerrycan")
    }
}
