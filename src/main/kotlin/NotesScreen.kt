class NotesScreen (private val archive: Archive) {

    fun start() {
        while (true) {
            val optionsList: MutableList<String> = mutableListOf()

            optionsList.add("Создать заметку")
            optionsList.addAll(archive.notes.map { it.name })
            optionsList.add("Выход")

            ScreenManager.display(optionsList)

            when (val input = ScreenManager.getUserIntInput()) {
                null -> println("Некорректный ввод. Необходимо ввести цифру.")
                1 -> CreateNewNote(archive).start()
                in 2..archive.notes.size + 1 -> NoteViewScreen(archive.notes[input - 2]).start()
                archive.notes.size + 2 -> return
                else -> println("Некорректный номер раздела.")
            }
        }
    }
}
