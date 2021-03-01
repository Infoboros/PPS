class Teacher(_name: String) {
    val name = _name
    private val scoreSheet = ScoreSheet()

    fun estimateAnswer(student: Student, ticket: ExamTicket): Score{
        val studentAnswer = student.getAnswer(ticket.ask)

        println("На вопрос ${ticket.ask}\n" +
                "Экзаменуемый дал ответ $studentAnswer")

        val score = when (studentAnswer) {
            ticket.answer -> Score.A
            else -> Score.F
        }

        println("И за это получил $score\n")

        scoreSheet.setScore(student.studentID, score)
        return score
    }

}