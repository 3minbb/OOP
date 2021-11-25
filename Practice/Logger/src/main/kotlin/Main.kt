fun main() {
    val initFabricFirst = Fabric().chooseLogger(NumOfLoggers.FIRST)
    val initFabricSec = Fabric().chooseLogger(NumOfLoggers.SECOND)
    val message: String = "Logger Information"
    initFabricFirst.makeLogger(message)
    initFabricSec.makeLogger(message)
}