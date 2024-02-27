package bai2;


public class SachThamKhao extends Sach{
	double Thue;
	
	SachThamKhao(String MaSach, String NgayNhap, double DonGia, int SoLuong, String NhaXuatBan, double Thue){
		super(MaSach, NgayNhap, DonGia, SoLuong, NhaXuatBan);
		this.Thue = Thue;
	}
	double GetThanhTien() {
		return this.DonGia * this.SoLuong + this.Thue;
	}
}
