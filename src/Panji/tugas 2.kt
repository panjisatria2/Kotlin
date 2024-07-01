package Panji

fun main() {
    var NilaiADPL : Int = 89
    var NilaiIMK : Int = 88
    var Nilaimatdis :Int = 99
    var rata_rata = (NilaiIMK + Nilaimatdis + NilaiADPL)/3

    if (rata_rata > 70){
        println("$rata_rata = Nilai yang Bagus")
    }else{
        println("$rata_rata = Nilai Tidak Bagus")
    }
}