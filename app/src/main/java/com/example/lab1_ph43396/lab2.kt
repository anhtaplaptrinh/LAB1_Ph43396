package com.example.lab1_ph43396

fun main() {
    //khai bao va su dung ki thuat null safety
    do {
        println("Nhap mssv:")
        val mssv: String? = readLine()
        // var tenSv :String = null
        val tenSv = getTenSv(mssv!!)
        println("Ten sv voi ma $mssv la : $tenSv")

        print("Tiếp không?(c/k):")
        val s = readLine()
        if (s == "k")
            break;
    } while (true)
    println("ket thuc chuong trinh")
}


val danhsachSv: Map<String, String> =
    mutableMapOf("PH2222" to "Tran van anh", "Ph43222" to "asd adfew", "OH383" to " sedfbhwrub")

fun getTenSv(mssv: String): String? {
    val tenSv = danhsachSv.get(mssv)

    if (tenSv == null)
        return ("ko tim thay")
    return tenSv;
}