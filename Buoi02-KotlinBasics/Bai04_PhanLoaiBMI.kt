// Họ tên: Nguyễn Song Hiệp
// MSSV: 25810056

fun main() {
    val canNang: Double = 68.0   
    val chieuCao: Double = 1.70  
    val bmi: Double = canNang / (chieuCao * chieuCao)
    val phanLoai: String
    if (bmi < 18.5) {
        phanLoai = "Gầy"
    } else if (bmi < 25.0) {
        phanLoai = "Bình thường"
    } else if (bmi < 30.0) {
        phanLoai = "Thừa cân"
    } else {
        phanLoai = "Béo phì"
    }

    println("Cân nặng: $canNang kg, chiều cao: $chieuCao m")
    println("Chỉ số BMI: ${"%.2f".format(bmi)}")
    println("Phân loại: $phanLoai")
}
