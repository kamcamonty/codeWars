//Task description: https://www.codewars.com/kata/550f22f4d758534c1100025a
package solution

object DirReduction {
    fun dirReduc(arr: Array<String>): Array<String> {
        val toReduce = arrayOf("NORTH,SOUTH", "SOUTH,NORTH", "EAST,WEST", "WEST,EAST")
        var s = arr.joinToString(",")
        
        do {
            var keep: List<Boolean> = toReduce.map{
                var contains = it in s
                if (contains) s = s.replace(it, "").replace(",,", ",")
                return@map contains
            }
        } while (keep.contains(true))
        
        return s.trim(',').split(',').toTypedArray()
    } 
}