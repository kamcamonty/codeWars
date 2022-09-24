//Task description: https://www.codewars.com/kata/52e88b39ffb6ac53a400022e
fun longToIP(ip: UInt): String =
    ip.toString(2).padStart(32, '0').chunked(8).map{ it.toInt(2) }.joinToString(".")