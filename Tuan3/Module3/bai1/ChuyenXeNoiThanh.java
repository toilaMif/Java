package bai1;

 class ChuyenXeNoiThanh extends ChuyenXe {
	 String soTuyen;
	    double soKmDiDuoc;

	    ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String soTuyen, double soKmDiDuoc) {
	        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
	        this.soTuyen = soTuyen;
	        this.soKmDiDuoc = soKmDiDuoc;
	    }

	    @Override
	    double getDoanhThu() {
	        return this.doanhThu;
	    }
}
