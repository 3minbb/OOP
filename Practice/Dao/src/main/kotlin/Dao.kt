
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import java.io.File
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass

    val serializerCustom = SerializersModule {
        polymorphic(Products::class) {
            subclass(Pshenica::class)
            subclass(Roz::class)
            subclass(Yachmen::class)
        }
    }
    val format = Json { serializersModule = serializerCustom }

interface Dao {
        fun writeObjList(prod: MutableList<Products>)
        fun getReadingList(): MutableList<Products>
    }

class WorkingWithItems : Dao{
    override fun writeObjList(obj: MutableList<Products>) {
        File("dao.txt").bufferedWriter().use{out -> out.write("")}
            obj.forEach {
                File("dao.txt").appendText("${format.encodeToString(it)}\n")
            }
        }

    override fun getReadingList(): MutableList<Products> {
            val list = mutableListOf<Products>()
            File("dao.txt").forEachLine {
                list.add(format.decodeFromString(it))
            }
            return list
    }
}
