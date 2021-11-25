import java.io.File

enum class NumOfLoggers {FIRST, SECOND}

class Fabric{
    fun chooseLogger(value: NumOfLoggers): Logger{
        return when(value){
            NumOfLoggers.FIRST -> {
                LoggerFirst()
            }
            NumOfLoggers.SECOND -> {
                LoggerSecond()
            }
            else -> {
                throw Exception()
            }
        }
    }
}

interface Logger {
    fun makeLogger(message: String)
}
class LoggerFirst : Logger{
    override fun makeLogger(message: String){
        println(message)
    }
}
class LoggerSecond: Logger{
    override fun makeLogger(message: String){
        File("loggerData.txt").appendText("$message\n")
    }
}