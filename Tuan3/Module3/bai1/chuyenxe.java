package bai1;

 abstract class ChuyenXe {
    String maSoChuyen;
    String hoTenTaiXe;
    String soXe;
    double doanhThu;

    ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    abstract double getDoanhThu();
}

