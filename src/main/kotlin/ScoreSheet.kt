enum class Score{
    A(),
    B(),
    C(),
    D(),
    F()
}

class ScoreSheet{
    private val sheet: MutableMap<String, Score> = mutableMapOf()

    fun setScore(studentID: String, score: Score) =
            sheet.put(studentID, score)

    operator fun get(studentID: String) =
            sheet[studentID]

}