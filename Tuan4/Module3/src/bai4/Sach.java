package bai4;

import java.util.Date;

abstract class Sach {
	String maSach;
	Date ngayNhap;
	double donGia;
	int soLuong;
	String nhaXuatBan;
	
	public void sach(){
		this.maSach = null;
		this.ngayNhap = new Date;
		this.donGia = 0.0;
		this.soLuong = 0;
		this.nhaXuatBan = null;
	}
	
	Sach(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
	      this.maSach = maSach;
	      this.ngayNhap = ngayNhap;
	      this.donGia = donGia;
	      this.soLuong = soLuong;
	      this.nhaXuatBan = nhaXuatBan;
	   }
	
	public String getmaSach(){
		return this.maSach;
	}
	public void setmaSach(String maSach) {
		this.maSach = maSach;
	}
	
	public LocalDate getngayNhap(){
		return this.ngayNhap;
	}
	public void setngayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	
	public double getdonGia(){
		return this.donGia;
	}
	public void setdonGia(double donGia) {
		this.donGia = donGia;
	}
	
	public int getsoLuong(){
		return this.soLuong;
	}
	public void setsoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	public String getnhaXuatBan(){
		return this.nhaXuatBan;
	}
	public void setnhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	
	abstract double GetThanhTien();
	
	 @Override
	 public String toString() {
	        return this.maSach + "|" + this.ngayNhap + "|" + this.donGia + "|" + this.soLuong + "|" + this.nhaXuatBan;
	 }
	
}
