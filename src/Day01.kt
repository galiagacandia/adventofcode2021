fun main() {
    fun part1(input: List<String>): Int {
        var aumenta : Int = 0;

        var valAnterior : Int;
        var valActual = input.get(0).toInt();

        input.forEachIndexed { index, element ->
            valAnterior = valActual;
            valActual = element.toInt();
            if (valAnterior < valActual){
                aumenta++;
            }
        }
        return aumenta;
    }

    fun part2(input: List<String>): Int {
        var suma: Int
        var medidas: MutableList<String> = mutableListOf()
        input.forEachIndexed { index, element ->
            if (index < input.size-2){
                suma = input.get(index).toInt() + input.get(index+1).toInt() + input.get(index+2).toInt()
                medidas.add(suma.toString())
            }
        }
        return part1(medidas)
    }

    val testInput = readInput("Day01_test")
    val input = readInput("Day01")

    // test if implementation meets criteria from the description, like:
    println("Test: part1 - Hay 7 incrementos")
    check(part1(testInput) == 7)

    println("Corrida part1: " + part1(input))

    println("Test: part2 - Suma de medidas de prueba")
    check(part2(testInput) == 5)

    println("Corrida part2: " + part2(input))
}
