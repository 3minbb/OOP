fun main(){
    val init = Shop(
        "EN"
    )

    init.addItem(Roz(
        35,
        true,
    ))

    init.addItem(Roz(
        11,
        false,
    ))
    println(init.listNEW)
}
