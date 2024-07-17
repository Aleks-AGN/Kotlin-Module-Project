import java.util.Scanner

object ScreenManager {
    private val input = Scanner(System.`in`)

    fun start(dataBase: ArchivesDB) {
        ArchivesScreen(dataBase).start()
    }
    fun display(optionsList: List<String>) {
        println("------------------------------------------")
        optionsList.forEachIndexed { index, element ->
            println("${index + 1}. $element")
        }
        println("------------------------------------------")
    }

    fun getUserIntInput() : Int? {
        print("Выберите номер раздела: ")

        val userInput = if (input.hasNextLine()) { input.nextLine() } else ""

        if (userInput.isEmpty()) return null

        return userInput.toIntOrNull()
    }

    fun getUserStringInput(str : String) : String {
        while (true) {
            print("Введите ${str.lowercase()}: ")
            val userInput = if (input.hasNextLine()) { input.nextLine() } else ""
            if (userInput.isEmpty()) {
                println("$str не может быть пустым.")
            } else {
                return userInput
            }
        }
    }
}
