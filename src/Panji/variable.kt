package Panji

fun main() {
// Variable Mutable
    var warna : String = "Hijau"
    warna = "Pink"

    println(warna)

////    Variable Imutable
//    val hewan : String = "Burung"
//    hewan = "Harimau"

//    Nulable
    var firstName : String? = "Panji"
    firstName = null

    println(firstName?.length)

}