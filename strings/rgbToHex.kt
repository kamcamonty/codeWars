//Task description: https://www.codewars.com/kata/513e08acc600c94f01000001
fun rgb(r: Int, g: Int, b: Int): String = convert(r) + convert(g) + convert(b)

fun convert(_x: Int): String  {
    var x = _x
    if (x > 255) x = 255
    if (x < 0) x = 0
    var hex = Integer.toHexString(x).toUpperCase()
    if(hex.length == 1) hex = "0".plus(hex)
    return hex
}