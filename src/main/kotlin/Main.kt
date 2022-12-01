
import java.util.Scanner



fun main(args: Array<String>) {
    val apartment = Apartment("Farid House", 30, 36.5, "Blue", 200000.50, mapOf(1 to "Nur Farid") )

    val apartment2 = Apartment("Chou House", 7, 6.5, "Green", 200000.50, mapOf(1 to "Chou") )


//    apartment.buildingPrompt()

    val input = Scanner(System.`in`)

    println()
    print("Cek No Apartment : ")

    val pilih = input.nextInt()

    if (pilih == 1) {
        apartment.ownerPrompt()
        apartment.printTenant(1)
    }
    if (pilih == 2) {
        apartment2.ownerPrompt()
        apartment2.printTenant(1)
    }

    fun daftar(nama: String?, alamat: String?, KTP: String?, ubah: (String)-> String): String {
        val namaUbah = nama?.let { ubah(it) }
        val alamatUbah = alamat?.let { ubah(it) }
        val KTPUbah = KTP?.let { ubah(it) }
        return "Bokingan Anda berhasil \n\t Nama     : $namaUbah \n\t Alamat   : $alamatUbah \n\t No. KTP  : $KTPUbah"
    }

    println()
    print("Apakah anda ingin BOKING (y/n) : ")

    val pilih1 = input.next()

    if (pilih1 =="y") {
        println()
        println("Isi untuk Daftar Booking")
        print("Masukkan Nama   : ")
        val nama = readLine();
        print("Masukkan Alamat : ")
        val alamat = readLine()
        print("Masukkan No KTP : ")
        val KTP = readLine()

        println()

        // Higher-Order function (Lambda mengubah huruf inputan menjadi huruf Kecil)
        val lambdaUpper = {value: String -> value.toLowerCase()}
        println(daftar(nama, alamat, KTP, lambdaUpper))
    } else {
        println("Terimakasi Telah Berkunjung")
    }


}