// Task description: https://www.codewars.com/kata/54a91a4883a7de5d7800009c
fun incrementString(str: String) : String {
    val (digits, letters) = str.partition { it.isDigit() }
    if(digits.length == 0 ) return letters.plus(1)
    val newInt = if (digits.toInt() == 0) 1 else digits.trimStart('0').toInt() + 1
  return letters.plus(String.format("%0${digits.length}d", newInt))
}