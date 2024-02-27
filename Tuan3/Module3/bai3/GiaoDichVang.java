package bai3;

public class GiaoDichVang extends GiaoDich{
	String LoaiVang;
		
	GiaoDichVang(String MaGiaoDich, String NgayGiaoDich, double DonGia, double SoLuong, String LoaiVang){
		super(MaGiaoDich, NgayGiaoDich, DonGia, SoLuong);
		this.LoaiVang = LoaiVang;
	}
	
	double GetThanhTien() {
		return this.SoLuong * this.DonGia;
	}
}
