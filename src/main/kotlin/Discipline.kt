import java.util.*

class Discipline(_name: String) {
    val name = _name

    private val tasks = Vector<Task>()

    fun addTask(task: Task) {
        tasks.addElement(task)
    }

    fun getRandomTask(): Task =
            tasks.random()
}

interface DisciplineCreator {
    fun createDiscipline(): Discipline
}

class OOPCreator : DisciplineCreator {
    override fun createDiscipline(): Discipline {
        val newDiscipline = Discipline("Объектно Ориентированное Программирование")

        val ask = TaskElement("Что такое Объект")
        val answer = TaskElement("Это Объект!")
        newDiscipline.addTask(Task(ask, answer))

        return newDiscipline
    }
}


