package bai3;

public class GiaoDichTienTe extends GiaoDich{
	double TiGia;
	String LoaiTien;
	
	GiaoDichTienTe(String MaGiaoDich, String NgayGiaoDich, double DonGia, double SoLuong, double TiGia, String LoaiTien) {
		super(MaGiaoDich, NgayGiaoDich, DonGia, SoLuong);
		this.TiGia = TiGia;
		this.LoaiTien = LoaiTien;
	}
	
	double GetThanhTien() {
		if(this.LoaiTien.equals("VN")) {
			return this.SoLuong * this.DonGia;
		}else {
			return this.SoLuong * this.DonGia * this.TiGia;
		}
	}
}
