import kotlinx.serialization.*

@Serializable
sealed class Products {
    abstract val prodName: String
    abstract val price: Float
    abstract val prodAbout: String
}

@Serializable
@SerialName("Roz")
data class Roz(
    override val prodName: String,
    override val price: Float,
    override val prodAbout: String,
) : Products()

@Serializable
@SerialName("Pshenica")
data class Pshenica(
    override val prodName: String,
    override val price: Float,
    override val prodAbout: String,
) : Products()

@Serializable
@SerialName("Yachmen")
data class Yachmen(
    override val prodName: String,
    override val price: Float,
    override val prodAbout: String,
) : Products()
