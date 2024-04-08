import java.lang.Math.pow
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    var x = 1.0
    while (x < 4) {
        println(x.pow(2.0).toInt())
        x++
    }
}