// Họ tên: Nguyễn Song Hiệp
// MSSV: 25810056

fun main() {
    // Mảng điểm của 10 sinh viên
    val diem = arrayOf(7.5, 8.0, 6.5, 9.0, 5.5, 7.0, 8.5, 4.5, 9.5, 6.0)

    var tong = 0.0
    // Gán giá trị ban đầu là phần tử đầu tiên để so sánh
    var diemCaoNhat = diem[0]
    var diemThapNhat = diem[0]

    // Tự viết vòng lặp so sánh, không dùng max() / min() có sẵn
    for (d in diem) {
        tong += d
        if (d > diemCaoNhat) {
            diemCaoNhat = d
        }
        if (d < diemThapNhat) {
            diemThapNhat = d
        }
    }

    val diemTrungBinh = tong / diem.size

    println("Điểm của lớp: ${diem.joinToString(", ")}")
    println("Điểm trung bình: ${"%.2f".format(diemTrungBinh)}")
    println("Điểm cao nhất: $diemCaoNhat")
    println("Điểm thấp nhất: $diemThapNhat")
}
