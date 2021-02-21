class Teacher(_name: String) {
    private val name = _name
    private val scoreSheet = ScoreSheet()


    fun startExam(group: StudentGroup, discipline: Discipline){
        println("Начался экзамен по ${discipline.name} у группы ${group.name}\n")

        group.forEach{
            examStudent(it, discipline)
        }
    }

    fun examStudent(student: Student, discipline: Discipline){
        println("Начался экзамен у ${student.name}, экзаменует $name")

        val ticket = discipline.getRandomTicket()
        val answer = student.getAnswer(ticket.ask)

        println("На вопрос ${ticket.ask}\n" +
                "Экзаменуемы дал ответ $answer")

        val score = estimateAnswer(ticket.answer, answer)
        println("И за это получил $score")

        scoreSheet.setScore(student.name, score)
        println("$name выставил оценку в ведомость\n")
    }

    private fun estimateAnswer(true_answer: String, answer: String): Score =
            when(answer){
                true_answer -> Score.A
                else -> Score.F
            }

    fun getScoreSheet(): ScoreSheet = scoreSheet

}