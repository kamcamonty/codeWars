//Task description: https://www.codewars.com/kata/5df754981f177f0032259090

package floatrepresent

import java.math.BigDecimal
import kotlin.math.log10
import kotlin.math.floor
import java.math.RoundingMode

fun mantExp(aNumber: BigDecimal, digitsNumber: Int): String {
    val newValue = aNumber.toString()
        .trimEnd('0')
        .replace(".", "")
        .trimStart('0')
        .take(digitsNumber)
        .padEnd(digitsNumber, '0')

    val exp = log10(newValue.toBigDecimal().divide(aNumber, 100, RoundingMode.CEILING).toDouble()) * -1
    
    return newValue.replace(".", "")
        .trimStart('0')
        .take(digitsNumber)
        .padEnd(digitsNumber, '0')
        .plus('P')
        .plus(floor(exp))
        .replace(".0", "")
        .replace("-0", "0")
}