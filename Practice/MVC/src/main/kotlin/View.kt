enum class Commands{GETLIST, GETRANDOM}

class View {
    private val initController = Controller()
    fun actionProcessing(command: String){
        when (command.uppercase()){
            Commands.GETLIST.name -> {
                println(initController.makeAction(Actions.GetList()))
            }
            Commands.GETRANDOM.name -> {
                println(initController.makeAction(Actions.GetRandom()))
            }
            else -> {
                throw Exception()
            }
        }
    }
}