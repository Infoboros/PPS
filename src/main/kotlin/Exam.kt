import java.util.*

class Exam(_discipline: Discipline) {
    private val discipline = _discipline
    private val students = Vector<Student>()
    private val teachers = Vector<Teacher>()

    fun addStudentsGroup(group: StudentGroup){
        group.forEach {
            students.addElement(it)
        }
    }

    fun addStudent(student: Student){
        students.addElement(student)
    }

    fun addTeacher(teacher: Teacher){
        teachers.addElement(teacher)
    }

    private fun examStudent(student: Student, teacher: Teacher){
        println("Начался экзамен у ${student.name}, экзаменует ${teacher.name}")

        val ticket = discipline.getRandomTask()

        val score = teacher.estimateStudent(student, ticket)

        val scoreCard = student.scoreCard
        scoreCard.setScore(discipline.name, teacher.name, score)

    }

    fun start(){
        println("Начался экзамен по ${discipline.name}.\n")
        students.forEach{
            examStudent(it, teachers.random())
        }
    }

}