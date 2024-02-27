package bai2;


class SachGiaoKhoa extends Sach{
	String TinhTrang;
	
	SachGiaoKhoa(String MaSach, String NgayNhap, double DonGia, int SoLuong, String NhaXuatBan, String TinhTrang){
		super(MaSach, NgayNhap, DonGia, SoLuong, NhaXuatBan);
		this.TinhTrang = TinhTrang;
	}
	
	double GetThanhTien() {
		if(this.TinhTrang.equals("mới")) {
			return this.DonGia * this.SoLuong;
		}else{
			return this.DonGia * this.SoLuong * 0.5;
		}
	}
	

}
