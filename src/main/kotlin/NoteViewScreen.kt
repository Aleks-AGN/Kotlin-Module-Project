class NoteViewScreen (private val note: Note) {
    fun start() {
        while (true) {
            val optionsList: MutableList<String> = mutableListOf()

            optionsList.add("Выход")

            println("*************************\n" +
                    "Имя заметки: ${note.name}\n" +
                    "Содержание заметки: ${note.content}\n" +
                    "*************************")

            ScreenManager.display(optionsList)

            when (val input = ScreenManager.getUserIntInput()) {
                null -> println("Некорректный ввод. Необходимо ввести цифру.")
                1 -> return
                else -> println("Некорректный номер раздела.")
            }
        }
    }
}