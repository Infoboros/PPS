import java.util.*

open class StudentGroup(_name: String) : Iterable<Student>{
    val name = _name

    private val students: Vector<Student> = Vector()


    fun addStudent(student: Student) {
        students.addElement(student)
    }

    override fun iterator(): Iterator<Student> =
            students.iterator()
}

class Student(_name: String, _knowledge: Map<String, String>){
    var name = _name
    val knowledge = _knowledge

    fun getAnswer(ask: String) =
            knowledge.getOrDefault(ask, "Я не знаю, не бейте, поставьте три.")
}

class PV_32: StudentGroup("ПВ-32") {
    init {
        addStudent(Student("Петр Петрович", mapOf(
                "Что такое Объект" to "Это Объект!"
        )))
        addStudent(Student("Иван Иванов", mapOf(
                "Зло это?" to "Зло есть зло, меньшее большее, мне нет разницы.\nИ если мне придется выбирать, я не буду делать выбор вовсе"
        )))
        addStudent(Student("Василий Васильев", mapOf()))
    }
}