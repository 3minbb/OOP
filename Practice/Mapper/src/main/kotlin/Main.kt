fun main() {
    val productInit = Product(
        "30 griven",
        "Yachmen",
        "About Yachmen",
        "10 griven"
    )
    val productDiscount = CatalogMapper()
    val discountMapper = DiscountMapper()
    println(productDiscount.map(productInit))
    println(discountMapper.map(productInit))
}