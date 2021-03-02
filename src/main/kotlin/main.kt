fun main() {
    val discipline = OOPCreator().createDiscipline()

    val teacher = Teacher("Сенсей")
    val group = PV32Creator().createGroup()

    val exam = Exam(discipline)
    exam.addStudentsGroup(group)
    exam.addTeacher(teacher)

    exam.start()
    return
}