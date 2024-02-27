package bai1;

class ChuyenXeNgoaiThanh extends ChuyenXe{
	String noiDen;
    int soNgayDiDuoc;

    ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen, int soNgayDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    double getDoanhThu() {
        return this.doanhThu;
    }
}
