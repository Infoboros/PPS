import java.util.*

class Student(_name: String, _knowledge: Map<TaskElement, TaskElement>) {
    var name = _name
    val studentID = University.getStudentID()
    val scoreCard = ScoreCard()

    private val knowledge = _knowledge

    fun getAnswer(ask: TaskElement) =
            knowledge.getOrDefault(ask, TaskElement("Я не знаю, не бейте, поставьте три."))
}

object University {
    private var nextStudentID = 0

    fun getStudentID(): String {
        val returnID = nextStudentID
        nextStudentID += 1
        return returnID.toString()
    }
}

class StudentGroup(_name: String) : Iterable<Student> {
    val name = _name

    private val students: Vector<Student> = Vector()


    fun addStudent(student: Student) {
        students.addElement(student)
    }

    override fun iterator(): Iterator<Student> =
            students.iterator()
}

class ScoreCard() {
    private val scores = mutableMapOf<Pair<String, String>, Score>()
    fun setScore(disciplineName: String, teacherName: String, score: Score) {
        scores[Pair(disciplineName, teacherName)] = score
    }
}

interface StudentGroupCreator {
    fun createGroup(): StudentGroup
}

class PV32Creator : StudentGroupCreator {
    override fun createGroup(): StudentGroup {
        val newGroup = StudentGroup("ПВ-32")

        newGroup.addStudent(Student("Петр Петрович", mapOf(
                TaskElement("Что такое Объект") to TaskElement("Это Объект!")
        )))
        newGroup.addStudent(Student("Иван Иванов", mapOf(
                TaskElement("Зло это?") to TaskElement("Зло есть зло, меньшее большее, мне нет разницы.\n")
        )))
        newGroup.addStudent(Student("Василий Васильев", mapOf()))

        return newGroup
    }
}