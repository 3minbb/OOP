fun main() {
    val shop = Shop("Ukraine")
    shop.getName()
    val init_obj = Yachmen()
    val init_obj2 = Pshenica()
    val init_obj3 = Roz()
    shop.addItem(init_obj3)
    shop.sellerinfo()
}
