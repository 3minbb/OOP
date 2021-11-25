fun main() {
    val workingWithItems = WorkingWithItems()
    val pshenicaInit = Pshenica("Pshenica", 20F, "About Pshenica")
    val yachmenInit = Yachmen("Yachmen", 10F, "About Yachmen")
    val rozInit = Roz("Roz", 50F, "About Roz")

    val list = mutableListOf<Products>()
    list.add(pshenicaInit)
    list.add(yachmenInit)
    list.add(rozInit)
    workingWithItems.writeObjList(list)
    println(workingWithItems.getReadingList())
}
