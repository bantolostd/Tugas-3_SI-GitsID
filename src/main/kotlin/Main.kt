/*
 ini adalah multiple-line comment
 Nama   : Bantolo Setiadi
 Prodi  : Informatika
 Kampus : Universitas Kristen Duta Wacana
 */

// impor agar input bisa berbagai tipe data
import java.util.Scanner

fun main(args: Array<String>) {
    // membuat scanner
    val input = Scanner(System.`in`)

    // membuat input
    print("Masukkan nama Anda: ")
    var nama: String = input.nextLine()
    val panjangNama: Int = nama.length
    print("Masukkan batas karakter: ")
    var karakter: Char = input.nextLine().single()

    // inisialisasi nilai i untuk loop, total untuk jumlah huruf vokal, dan ditemukanKarakter untuk tanda adanya karakter
    var i = 0
    var total: Int = 0
    var ditemukanKarakter: Int = 0
    while(i < panjangNama-1) {
        // jika loop sudah mencapai karakter
        if(nama[i].lowercase() == karakter.lowercase()) {
            ditemukanKarakter += 1
            break
        }
        i += 1
        // jika ditemukan huruf vokal maka total akan +1, jika tidak -> continue
        when(nama[i].lowercase().toString()) {
            "a", "i", "u", "e", "o" -> total += 1
            else -> continue
        }
        // jika ditemukan huruf vokal maka akan ada print di bawah
        println("Yey! Ditemukan 1 huruf vokal! (${nama[i]})")
    }
    // jika ada karakter yang diinputkan dalam nama
    if(ditemukanKarakter != 0) {
        println("Total huruf vokal sebelum huruf $karakter adalah $total.")
    } else { // jika tidak ada
        println("Huruf $karakter tidak ditemukan dalam nama Anda! Total semua huruf vokal dalam nama Anda adalah $total.")
    }
}
