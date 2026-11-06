// Họ tên: Nguyễn Song Hiệp
// MSSV: 25810056

fun main() {
    val soDuBanDau: Long = 5_000_000
    var soDuHienTai: Long = soDuBanDau
    println("Số dư ban đầu: $soDuBanDau VNĐ")
    val soTienGui: Long = 2_000_000
    soDuHienTai += soTienGui
    println("Gửi thêm $soTienGui VNĐ -> Số dư: $soDuHienTai VNĐ")

    // Giao dịch 2: rút 1 triệu rưỡi
    val soTienRut: Long = 1_500_000
    soDuHienTai -= soTienRut
    println("Rút $soTienRut VNĐ -> Số dư: $soDuHienTai VNĐ")

    println("Chênh lệch so với ban đầu: ${soDuHienTai - soDuBanDau} VNĐ")
}
