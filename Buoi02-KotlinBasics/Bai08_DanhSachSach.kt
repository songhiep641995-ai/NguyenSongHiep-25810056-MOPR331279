// Họ tên: Nguyễn Song Hiệp
// MSSV: 25810056

fun main() {
    val danhSachSach = mutableListOf(
        "Dế Mèn phiêu lưu ký",
        "Tắt đèn",
        "Số đỏ",
        "Nhà giả kim",
        "Đắc nhân tâm"
    )
    println("Danh sách ban đầu: $danhSachSach")

    danhSachSach.add("Cho tôi xin một vé đi tuổi thơ")
    danhSachSach.add("Bố già")
    danhSachSach.remove("Số đỏ")

    danhSachSach.sort()

    println("Danh sách sau khi thêm, xóa, sắp xếp: $danhSachSach")
}
