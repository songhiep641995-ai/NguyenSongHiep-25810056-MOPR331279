// Họ tên: Nguyễn Song Hiệp
// MSSV: 25810056
fun main() {
    val soLuong: Int = 5
    val donGia: Double = 20000.0

    val tienHang: Double = soLuong.toDouble() * donGia

    val tienThue: Double = tienHang * 0.08

    val tongTien: Double = tienHang + tienThue

    println("Số lượng sản phẩm: $soLuong")
    println("Đơn giá: $donGia VNĐ")
    println("Tiền hàng: $tienHang VNĐ")
    println("Tiền thuế 8%: $tienThue VNĐ")
    println("Tổng tiền phải trả: $tongTien VNĐ")
}
