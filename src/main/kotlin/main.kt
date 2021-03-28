//بسم اللّه الرحمن الرحیم
import kotlin.math.pow

fun sqrt(a:Int):Double {
    return a.toDouble().pow(1/2.toDouble())
}

fun main() {
    println("aX^2+bX+c")
    print("a: ")
    val a = readLine()!!.toInt()
    print("b: ")
    val b = readLine()!!.toInt()
    print("c: ")
    val c = readLine()!!.toInt()

    print("$a"+"X^2")

    if(b<0)
    {
        print("$b"+"X")
    }
    else
    {
        print("+$b"+"X")
    }

    if(c<0)
    {
        print("$c")
    }
    else
    {
        print("+$c")
    }

    var delta : Int = b*b - (4 * a * c)
    println("\ndelta : $delta")



    var x1 : Double
    var x2 : Double

    x1 = (-1 * b + sqrt(delta))/(2*a)
    x2 = (-1 * b - sqrt(delta))/(2*a)

    if (delta>0)
    {

        println("So, there are two roots.")
        println("X1 = $x1 and X2 = $x2")
    }
    else if (delta == 0)
    {
        println("So, there is one root.")
        println("X = $x1")

    }
    else
    {
        println("So, there is no root (there are two complex roots).")
    }

}