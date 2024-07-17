class ArchivesScreen (private val dataBase: ArchivesDB) {

    fun start() {
        while (true) {
            val optionsList: MutableList<String> = mutableListOf()

            optionsList.add("Создать архив")
            optionsList.addAll(dataBase.archives.map { it.name })
            optionsList.add("Выход")

            ScreenManager.display(optionsList)

            when (val input = ScreenManager.getUserIntInput()) {
                null -> println("Некорректный ввод. Необходимо ввести цифру.")
                1 -> CreateNewArchive(dataBase).start()
                in 2..dataBase.archives.size + 1 -> NotesScreen(dataBase.archives[input - 2]).start()
                dataBase.archives.size + 2 -> return
                else -> println("Некорректный номер раздела.")
            }
        }
    }
}
