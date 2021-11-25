fun main() {
    val viewInit = View()
    while(true){
        val command = readLine()!!.toString()
        viewInit.actionProcessing(command)
    }
}