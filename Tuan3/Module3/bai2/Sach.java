package bai2;


abstract class Sach {
	String MaSach;
	String NgayNhap;
	double DonGia;
	int SoLuong;
	String NhaXuatBan;
	
	Sach(String MaSach, String NgayNhap, double DonGia, int SoLuong, String NhaXuatBan){
		this.MaSach = MaSach;
		this.NgayNhap = NgayNhap;
		this.DonGia = DonGia;
		this.SoLuong = SoLuong;
		this.NhaXuatBan = NhaXuatBan;
		
	}
	
	abstract double GetThanhTien();
}
