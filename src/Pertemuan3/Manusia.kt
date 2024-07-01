package Pertemuan3

class Manusia{
    var nama : String = "Panji"
    var umur : Int = 18
    var alamat : String = "Desa Mindaka"


//    Membuat Sebuah Function
    fun sayHello(name:String){
        println("Hallo $name myname is $nama")
    }

    fun run(){
        println("I'am run")
    }
    fun getFullname() :String{
        return "$nama $umur $alamat"
    }
}