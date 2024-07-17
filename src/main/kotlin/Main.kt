fun main(args: Array<String>) {
    println("Добро пожаловать в консольное приложение \"Заметки\"")

    val archives = ArchivesDB("База данных архивов")

    ScreenManager.start(archives)

    println("Работа приложения завершена")
}
