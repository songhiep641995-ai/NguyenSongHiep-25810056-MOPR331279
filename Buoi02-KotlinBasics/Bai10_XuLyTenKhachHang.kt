// Họ tên: Nguyễn Song Hiệp
// MSSV: 25810056

// Hàm nhận vào tên khách hàng có thể null (kiểu String?)
fun xuLyTenKhachHang(tenKhachHang: String?) {
    // 1. Safe call (?.): nếu tên là null thì trả về null, không gây lỗi
    val doDai: Int? = tenKhachHang?.length
    println("Độ dài tên (safe call): $doDai")

    // 2. Toán tử Elvis (?:): nếu vế trái là null thì dùng giá trị mặc định
    val tenHienThi: String = tenKhachHang ?: "Khách vãng lai"
    println("Tên hiển thị (Elvis): $tenHienThi")
}

fun main() {
    println("--- Trường hợp có tên ---")
    xuLyTenKhachHang("Nguyễn Văn An")

    println("--- Trường hợp tên null ---")
    xuLyTenKhachHang(null)

    // 3. Toán tử !! (not-null assertion)
    // CHÚ Ý: !! ép Kotlin coi biến là chắc chắn khác null. Nếu biến thực sự là null,
    // chương trình sẽ dừng đột ngột với lỗi NullPointerException khi chạy.
    // Chỉ dùng !! khi chắc chắn tuyệt đối biến không null; bình thường nên dùng ?. hoặc ?:.
    println("--- Minh họa toán tử !! ---")
    val tenChacChan: String? = "Trần Thị Bình"
    println("Độ dài tên (!!): ${tenChacChan!!.length}")

    val tenRong: String? = null
    try {
        println(tenRong!!.length)
    } catch (e: NullPointerException) {
        println("Lỗi khi dùng !! với biến null: NullPointerException")
    }
}
