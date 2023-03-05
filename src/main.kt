//create simple calculator

fun main() {
    var number1 = 0
    var number2 = 0
    var operation: Char = '+'

    println("Pleas Enter the first number:")

    number1 = readLine()!!.toInt()

    println("Pleas Enter the second number:")

    number2 = readLine()!!.toInt()

    println("Pleas Enter the operation like + - * / : ")

    operation = readLine()!!.single()

    when(operation){
        '+' -> add(number1,number2)
        '-' -> sub(number1,number2)
        '*' -> mult(number1,number2)
        '/' -> div(number1,number2)
    }
}

fun add(num1 : Int, num2 : Int){
    println("$num1 + $num2 = ${num1+num2}")
}

fun sub(num1 : Int, num2 : Int){
    println("$num1 - $num2 = ${num1 - num2}")
}

fun mult(num1 : Int, num2 : Int){
    println("$num1 * $num2 = ${num1 * num2}")
}

fun div(num1 : Int, num2 : Int){
    try {
        println("$num1 / $num2 = ${num1 / num2}")
    } catch (exception : Exception){
        println("cant divide by zero")
    }

}