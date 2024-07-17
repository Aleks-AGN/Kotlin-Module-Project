class CreateNewNote (private val archive: Archive) {
    fun start() {

        val name = ScreenManager.getUserStringInput("Имя заметки")

        val content = ScreenManager.getUserStringInput("Текст заметки")

        while (true) {
            val optionsList = mutableListOf("Сохранить заметку", "Отмена")
            ScreenManager.display(optionsList)

            when (ScreenManager.getUserIntInput()) {
                null -> println("Некорректный ввод. Необходимо ввести цифру.")
                1 -> {
                    archive.notes.add(Note(name, content))
                    println("Заметка \"$name\" создана.")
                    return
                }
                2 -> {
                    println("Создание заметки отменено.")
                    return
                }
                else -> println("Некорректный номер раздела.")
            }
        }
    }
}