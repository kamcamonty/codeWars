// Task description: https://www.codewars.com/kata/5282b48bb70058e4c4000fa7
// you have preloaded 
// data class RGB(val r: Int, val g: Int, val b: Int)
fun hexStringToRGB(hexString: String): RGB {
  val rgbArray = hexString.drop(1).chunked(2).map{it.toInt(radix = 16)}
  return RGB(rgbArray[0], rgbArray[1], rgbArray[2])
}