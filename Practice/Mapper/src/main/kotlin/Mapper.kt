interface Mapper<I,O> {
    fun map(Input:I):O
}

class CatalogMapper: Mapper<Product, ProductInfo> {
    override fun map(Input: Product): ProductInfo {
        return ProductInfo(
            Input.prodName,
            Input.prodAbout,
        )
    }
}

class DiscountMapper: Mapper<Product, ProductDiscount>{
    override fun map(Input: Product): ProductDiscount {
        return ProductDiscount(
            Input.prodName,
            Input.price,
            Input.sale
        )
    }
}