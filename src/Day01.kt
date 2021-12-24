fun main() {
    fun part1(input: List<String>): Int {
        var aumenta : Int = 0;
        var valAnterior : Int = -1;
        var valActual : Int = 0;

        valActual = input.get(0).toInt();
        input.forEach {
            if(valAnterior < valActual){

            }
        }




        input.forEach {
            valActual = it.toInt();
            if (valAnterior != -1) {

            }
            println(it)
        }
        return 10;
    }

    /*
    fun part1(input: List<String>): Int {
        return input.size
    }*/

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 10)

    /*
    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))

     */
}
