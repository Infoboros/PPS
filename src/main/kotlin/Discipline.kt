import java.util.*

class ExamTicket(_ask: String, _answer: String ) {

    val ask = _ask
    val answer = _answer

}

open class Discipline(_name: String) {
    val name = _name

    private val tickets = Vector<ExamTicket>()

    fun addTicket(ticket: ExamTicket){
        tickets.addElement(ticket)
    }

    fun getRandomTicket(): ExamTicket =
            tickets.random()
}

class OOP : Discipline("Объектно Ориентированное Программирование"){
    init {
        addTicket(ExamTicket("Что такое Объект", "Это Объект!"))
    }
}