package app

import Pertemuan3.Manusia

fun main() {
    val panji = Manusia()
    panji.nama = "panji"
    panji.alamat = "Mindaka"
    panji.umur = 18

    panji.sayHello("Satria")
    panji.run()
    panji.getFullname()
}

// Tugas menjalankan function getFullname