fun main() {
    val solution = SolutionVP()
    val str = readln()
    println(solution.isPalindrome(str))
}

class SolutionVP {
    fun isPalindrome(s: String): Boolean {
        val charList = s.split(" ")
            .map { it.lowercase() }
            .filter { it.all { l -> l.isLetter() } }
        var writeIndex = charList.size - 1
        var readIndex = 0

        while (writeIndex > readIndex) {
            if (charList[writeIndex] != charList[readIndex])
                return false
            writeIndex--
            readIndex++
        }
        return true
    }
}