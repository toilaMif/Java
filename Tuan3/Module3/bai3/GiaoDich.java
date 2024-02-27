package bai3;

public abstract class GiaoDich {
	String MaGiaoDich;
	String NgayGiaoDich;
	double DonGia;
	double SoLuong;
	
	GiaoDich(String MaGiaoDich, String NgayGiaoDich, double DonGia, double SoLuong){
		this.MaGiaoDich = MaGiaoDich;
		this.NgayGiaoDich = NgayGiaoDich;
		this.DonGia = DonGia;
		this.SoLuong = SoLuong;
	}
	abstract double GetThanhTien();

}
