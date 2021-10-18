class Shop(
    private val name: String
) {
    private val list = mutableListOf<Products>()
    val SendList: List<Products> = list

    fun getName(): String{
        return "$name"
    }
    fun addItem(products: Products){
        list.add(products)
        println("Product added ${products.name}")
    }
    fun delItem(products: Products){
        list.remove(products)
        println("Product removed ${products.name}")
    }
    fun sellerinfo(){
        println(list.toString())
    }
}
interface Products{
    val name: String
    val about: String

}
class Yachmen(val price: Int, val isexist: Boolean): Products{
    override val name = "Yachmen"
    override val about = "A genus of plants of the Cereal family, one of the oldest cereals cultivated by man.\n" +
            " The cultivation of ordinary barley is widespread, other species are cultivated occasionally or grow wild.\n"
    override fun toString(): String {
        return "\n$name \n$price \n$about \n$isexist"
    }
}

class Pshenica(val price: Int): Products{
    override val name = "Pshenica"
    override val about = "A genus of herbaceous, mostly annual, plants of the Grass family, or Bluegrass (Poaceae),\n" +
            " the leading grain crop in many countries.\n"
    override fun toString(): String {
        return "\n$name \n$price \n$about"
    }
}

class Roz(val price: Int, val isgood: Boolean): Products{
    override val name = "Roz"
    override val about = "An annual or biennial herbaceous plant, a species of the genus Rye of the Bluegrass family.\n" +
            " Rye is a cultivated plant, it is grown mainly in the Northern hemisphere.\n" +
            " There are winter and spring forms of rye.\n"
    override fun toString(): String {
        return "\n$name \n$price \n$about \n$isgood"
    }

}
