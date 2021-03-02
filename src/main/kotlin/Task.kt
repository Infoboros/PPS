class Task(_ask: TaskElement, _answer: TaskElement) {

    val ask = _ask
    val answer = _answer

}

class TaskElement(_text: String) {
    val text = _text

    override fun hashCode(): Int {
        return text.hashCode()
    }

    override fun equals(other: Any?) =
            when (other) {
                is TaskElement -> text == other.text
                else -> false
            }
}