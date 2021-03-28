//بسم اللّه الرحمن الرحیم
import kotlin.math.sqrt

//Square Roots Calculator Function
fun sqrt(a:Int):Double {
    return sqrt(a.toDouble())
}

fun main() {

    //Showing quadratic equation in parametric coefficients form
    println("\n(a)X^2 + (b)X + (c)")

    //Getting Coefficients
    println("Enter the coefficients:")
    print("a: ")
    val a = readLine()!!.toInt()
    print("b: ")
    val b = readLine()!!.toInt()
    print("c: ")
    val c = readLine()!!.toInt()

    //Replacing parameters with numbers

    //Replace a
        print("\nQuadratic Equation : \n$a" + "X^2 ")


    //Replace b
    if (b < 0){
        //Print a minus sign for negative inputs
        print("- ")
        print(b * -1)
        print("X ")
    } else {
        //Print a plus sign for positive inputs
        print("+ $b" + "X ")
    }

    //Replace c
    if (c < 0) {
        //Print a minus sign for negative inputs
        print("- ")
        print(c * -1)
    } else {
        //Print a plus sign for positive inputs
        print("+ $c")
    }

    //Calculating Delta
    val delta: Int = b * b - (4 * a * c)
    println("\n\ndelta : $delta")

    //Calculating Roots
    val x1: Double = (-1 * b + sqrt(delta)) / (2 * a)
    val x2: Double = (-1 * b - sqrt(delta)) / (2 * a)

    //Check number of roots
    when {
        delta > 0 -> {

            println("So, there are two roots.")
            println("\nX1 = $x1 and X2 = $x2")
        }
        delta == 0 -> {
            println("So, there is one root.")
            println("\nX = $x1")

        }
        else -> {
            println("So, there is no root (there are two complex roots).")
        }
    }
}