class Shop(
    private val name:String
) {
    private val list = mutableListOf<Products>()

    fun getName():String{
        return "$name"
    }
    fun addItem(products:Products){
        list.add(products)
        println("Product added ${products.name}")
    }
    fun delItem(products:Products){
        list.remove(products)
        println("Product removed ${products.name}")
    }
    fun sellerinfo(){
        println(list.toString())
    }
}
interface Products{
    val price:Double
    val name:String
    val about:String

}
class Yachmen:Products(val price:Int){
    override val name = "Yachmen"
    override val about = "A genus of plants of the Cereal family, one of the oldest cereals cultivated by man.\n" +
            " The cultivation of ordinary barley is widespread, other species are cultivated occasionally or grow wild.\n"
    val isexist = true
    override fun toString(): String {
        return "\n$name \n$price \n$about \n$isexist"
    }
}

class Pshenica:Products(val price:Int){
    override val name = "Pshenica"
    override val about = "A genus of herbaceous, mostly annual, plants of the Grass family, or Bluegrass (Poaceae),\n" +
            " the leading grain crop in many countries.\n"
    override fun toString(): String {
        return "\n$name \n$price \n$about"
    }
}

class Roz:Products(val price:Int){
    override val name = "Roz"
    override val about = "An annual or biennial herbaceous plant, a species of the genus Rye of the Bluegrass family.\n" +
            " Rye is a cultivated plant, it is grown mainly in the Northern hemisphere.\n" +
            " There are winter and spring forms of rye.\n"
    val isgood= "da"
    override fun toString(): String {
        return "\n$name \n$price \n$about \n$isgood"
    }

}
