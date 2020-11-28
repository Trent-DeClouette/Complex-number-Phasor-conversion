import java.text.DecimalFormat
import java.util.*
import kotlin.math.atan
/**
 * @author Trent DeClouette
 * takes a complex number in x + jy form and
 * changes it to a phaser in the form a<b*
 */
fun main()
{
    println("Enter a complex number (x + jy)")
    try
    {
        print("real number, x: ")
        val x : Double = Scanner(System.`in`).nextDouble()
        print("imaginary number, y: ")
        val y : Double = Scanner(System.`in`).nextDouble()
        val sign : String = if (y > 0) "+" else "-"
        println("$x $sign j$y is ${toPhaser(x, y)}\n")
    }
    catch(e : InputMismatchException)
    {
        println("Please enter numbers only")
        main()
    }
}
fun toPhaser(x : Double, y : Double) : String
{
    val a : Double = kotlin.math.sqrt(x * x + y * y)
    val b : Double = atan(y / x) * 180 / Math.PI
    val aStr : String = DecimalFormat("#.####").format(a)
    val bStr : String  = DecimalFormat("#.####").format(b)
    return "$aStr<$bStr*"
}