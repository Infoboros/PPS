fun main(args: Array<String>) {
    val discipline = OOP()

    val teacher = Teacher("Сенсей")
    val group = PV_32()

    teacher.startExam(group, discipline)

    val scoreSheet = teacher.getScoreSheet()
    println("Итоги экзамена:")
    group.forEach{
        println("${it.name} получил оценку ${scoreSheet[it.name]}")
    }
}