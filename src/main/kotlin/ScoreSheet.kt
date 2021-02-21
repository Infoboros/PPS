enum class Score{
    A(),
    B(),
    C(),
    D(),
    F()
}

class ScoreSheet{
    private val sheet: MutableMap<String, Score> = mutableMapOf()

    fun setScore(studentName: String, score: Score) =
            sheet.put(studentName, score)

    operator fun get(studentName: String) =
            sheet[studentName]

}