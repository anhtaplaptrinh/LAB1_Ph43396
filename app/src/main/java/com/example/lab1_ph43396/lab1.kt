package com.example.lab1_ph43396
//------------------BAI2-----------------------
//fun main(){
//    print("Nguyễn Văn Anh - PS123456\n")
//    print("=========================\n")
//    println("Quanh năm buôn bán ở mom sông")
//    println("Nuôi đủ năm con với một chồng")
//    println("\tlặn lội thân cờ khi quãng vắng")
//    println("\teo sèo mặt nước buổi đò đồng")
//    println("Một duyên hai nợ âu đành phận")
//    println("Năm nắng mười mưa há chẳng công")
//    println("\tCha mẹ thói đời \"ăn ở bạc\"")
//    println("\tCó chồng hờ hững cũng như không")
//}

//-----------------------BAI3----------------------
fun main() {
    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    println("Tổng: " + (a + b))
    println("Hiệu: " + (a - b))
    println("Tích: " + (a * b))
    println("Thương: " + (a / b))
}