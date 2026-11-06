// Họ tên: Nguyễn Song Hiệp
// MSSV: 25810056

fun main() {
    val gioiHan = 100
    var soTruoc = 0
    var soSau = 1

    println("Các số Fibonacci nhỏ hơn $gioiHan:")
    for (viTri in 0 until gioiHan) {
        if (soTruoc >= gioiHan) break
        println("Vị trí $viTri: $soTruoc")

        val soTiepTheo = soTruoc + soSau
        soTruoc = soSau
        soSau = soTiepTheo
    }
}
