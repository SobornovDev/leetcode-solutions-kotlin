fun main() {
    val countVertex = readln().toInt()
    val graph = mutableMapOf<Int, IntArray>()

    for (i in  0 until countVertex) {
        val line = readln()
        if (line.isBlank() || line.isEmpty()) {
            graph[i] = intArrayOf()
            continue
        }
        graph[i] = line.split(" ").map { it.toInt() }.toIntArray()
    }
    println("enter start")
    val start = readln().toInt()
    println("enter end")
    val end = readln().toInt()

    val visited = mutableSetOf<Int>()

    println("Путь из $start в $end существует: ${dfs(graph, start, end, visited)}")
}

private fun dfs(
    graph: MutableMap<Int, IntArray>,
    vertex: Int,
    end: Int,
    visited: MutableSet<Int>
): Boolean {
    if (vertex in visited) {
        println("Вершина $vertex уже посещена")
        return false
    }

    if (vertex == end) {
        println("Нашли конец $vertex")
        return true
    }

    println("Посетили вершину $vertex")
    visited.add(vertex)

    graph[vertex]?.forEach{
        if(dfs(graph, it, end, visited)) return true
    } ?: intArrayOf()
    return false
}