fun main() {
    val discipline = OOP()

    val teacher = Teacher("Сенсей")
    val group = PV_32()

    val exam = Exam(discipline)
    exam.addStudentsGroup(group)
    exam.addTeacher(teacher)

    exam.start()
    return
}