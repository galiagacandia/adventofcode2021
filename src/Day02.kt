fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    val testInput = readInput("Day01_test")
    val input = readInput("Day01")

    println("Test: part1")
    check(part1(testInput) == 1)

    println("Test: part2")
    check(part2(testInput) == 1)

    println("Corrida part1: " + part1(input))
    println("Corrida part2: " + part2(input))
}
