package bai4;

import java.time.LocalDate;

class SachThamKhao extends Sach{
	double thue;
	
	public void sachThamKhao(){
		this.maSach = null;
		this.ngayNhap = LocalDate.now();
		this.donGia = 0.0;
		this.soLuong = 0;
		this.nhaXuatBan = null;
		this.thue =0.0;
	}
	
	SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
	      super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
	      this.thue = thue;
	   }
	public double getthue(){
		return this.thue;
	}
	public void setdonGia(double thue) {
		this.thue = thue;
	}
	
	@Override
	double GetThanhTien() {
		return this.donGia * this.soLuong + this.thue;
	}
	 @Override
	    public String toString() {
	        return super.toString() + "|" + this.thue;
	    }
}
