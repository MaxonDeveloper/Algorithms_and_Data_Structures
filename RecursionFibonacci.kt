fun recursionFibonacci(input: Int): Long {
    if(input <= 1)
        return input.toLong()
    return recursionFibonacci(input - 1) + recursionFibonacci(input - 2)
}
