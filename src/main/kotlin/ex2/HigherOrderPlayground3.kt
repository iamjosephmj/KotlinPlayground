package ex2

fun main() {
    /* See Dwarves below. I want them organized like this:
      - Grouped by which names come before or after M in the alphabet.
      - Sorted by name length.
      - No dwarves with names less than four letters long.
      - Turn dwarves before M into a map, grouped by the first letters in their names
     */

    val lotsOfDwarves = listOf(
        listOf("Sleepy", "Grumpy", "Doc", "Bashful", "Sneezy"),
        listOf("Thorin", "Nori", "Bombur")
    )

    val (beforeM, afterM) = lotsOfDwarves
        .flatMap {
            it
                // Filtering function.
                .filter { dwarf ->
                    dwarf.length > 4
                }
        }
        //For sorting
        .sortedBy { -it.length }
        // Splitter
        .partition {
            it < "M"
        }

    // map creator
    val grouped = beforeM.groupBy {
        it[0]
    }
    println(grouped)


}