class CreateNewArchive (private val dataBase: ArchivesDB) {
    fun start() {

        val name = ScreenManager.getUserStringInput("Имя архива")

        while (true) {
            val optionsList = mutableListOf("Сохранить архив", "Отмена")
            ScreenManager.display(optionsList)

            when (ScreenManager.getUserIntInput()) {
                null -> println("Некорректный ввод. Необходимо ввести цифру.")
                1 -> {
                    dataBase.archives.add(Archive(name))
                    println("Архив \"$name\" создан.")
                    return
                }
                2 -> {
                    println("Создание архива отменено.")
                    return
                }
                else -> println("Некорректный номер раздела.")
            }
        }
    }
}
