fun main() {
    val solution = SolutionVP()
    val str = readln()
    println(solution.isPalindrome(str))
}

class SolutionVP {
    fun isPalindrome(s: String): Boolean {
        val charList = s.replace(" ", "")
            .filter { it.isLetter() || it.isDigit() }.map { it.lowercase() }
        var writeIndex = charList.size - 1
        var readIndex = 0

        if (charList.size <= 1) return true

        while (writeIndex > readIndex) {
            if (charList[writeIndex] != charList[readIndex])
                return false
            writeIndex--
            readIndex++
        }
        return true
    }
}