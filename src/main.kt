fun main() {
    val shop = Shop("Ukraine")
    shop.getName()
    val init_obj = Yachmen(3)
    val init_obj2 = Pshenica(5)
    val init_obj3 = Roz(9)
    shop.addItem(init_obj3)
    shop.sellerinfo()
}
