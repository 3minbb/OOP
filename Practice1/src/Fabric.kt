import java.io.File

class Fabric{
    companion object{
        fun getLoger(loger: Int): ILogers {
            var obj: ILogers
            if (loger == 1){
                obj = FirstLog()
                return obj
            }
            else{
                obj = SecondLog()
                return obj
            }
        }
    }
}
interface ILogers {
    fun makeLoger(message: String)
}

class FirstLog:ILogers{
    override fun makeLoger(message: String){
        println(message)
    }
}
class SecondLog:ILogers{
    override fun makeLoger(message: String){
        if(message.isNotEmpty()){
            File("FileLogs.txt").appendText("$message\n")
        }
    }
}