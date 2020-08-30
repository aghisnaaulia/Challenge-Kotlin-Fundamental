package Challenge

import java.util.*
import Challenge.VBalok.main

fun main() {

    val input = Scanner(System.`in`)

    print("Nama : ")
    input.nextLine()

    print("Kelas : ")
    input.nextLine()

    print("No. Absen : ")
    input.nextInt()
    println("===========================")
    println("Kamu Ingin Menghitung Apa?")
    println("1. Volume Balok")
    println("2. Volume Bola")
    println("0. Batal")
    println("===========================")
    print("Pilihanmu : ")

    when (input.nextInt()) {
        1 -> {
            main()
        }
        2 -> {
            Challenge.VBola.main()
        }
        0 -> {
        }
    }

}