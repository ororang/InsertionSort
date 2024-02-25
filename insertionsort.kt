package sorts

fun main() {

    val arrays = arrayOf(67, 44, 82, 17, 20)
    val sizeofarray = arrays.size
    for (i in 1 until sizeofarray) {
        var key: Int = arrays[i]
        var j: Int = i
        while (j > 0 && arrays[j - 1]> key) {
            arrays[j] = arrays[j - 1]
            j--
        }
        arrays[j] = key
        println(arrays.contentToString())
    }

}

