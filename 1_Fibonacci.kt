fun fibonacci(input: Int): Long {
    var n = 2
    val list = mutableListOf<Long>(0, 1)
    when (input) {
        0 -> return 0
        1 -> return 1
        else -> while (input + 1 != n) {
            list.add(list[n - 1] + list[n - 2])
            n++
        }
    }
    return list[input]
}
