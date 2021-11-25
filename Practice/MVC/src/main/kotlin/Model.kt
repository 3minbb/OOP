import kotlin.random.Random
import kotlin.random.nextInt

class Model {
    private val list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    fun getRandomItem() : Int{
        val randomInt = Random.nextInt(1..list.size)
        return list.elementAt(randomInt)
    }
    fun getList() : MutableList<Int>{
        return list
    }
}