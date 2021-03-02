class Teacher(_name: String) {
    val name = _name
    private val scoreSheet = ScoreSheet()

    fun estimateStudent(student: Student, task: Task): Score{
        val studentAnswer = student.getAnswer(task.ask)

        println("На вопрос ${task.ask.text}\n" +
                "Экзаменуемый дал ответ ${studentAnswer.text}")

        val score = when (studentAnswer) {
            task.answer -> Score.A
            else -> Score.F
        }

        println("И за это получил $score\n")

        scoreSheet.setScore(student.studentID, score)
        return score
    }

}