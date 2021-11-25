sealed class Actions{
    class GetList(): Actions()
    class GetRandom(): Actions()
}

class Controller {
    private val modelInit = Model()
    fun makeAction(command: Actions): String{
        return when(command){
            is Actions.GetList -> {
                modelInit.getList().toString()
            }
            is Actions.GetRandom -> {
                modelInit.getRandomItem().toString()
            }
        }
    }
}