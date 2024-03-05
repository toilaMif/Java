package bai4;

import java.time.LocalDate;

class SachGiaoKhoa extends Sach{
	 boolean tinhTrang;
	 
	 public void sachGiaoKhoa(){
			this.maSach = null;
			this.ngayNhap = LocalDate.now();
			this.donGia = 0.0;
			this.soLuong = 0;
			this.nhaXuatBan = null;
			this.tinhTrang = true;
		}
		
	public	SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, boolean tinhTrang) {
		      super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		      this.tinhTrang = tinhTrang;
		   }
		
		public boolean gettinhTrang(){
			return this.tinhTrang;
		}
		public void settinhTrang(boolean tinhTrang) {
			this.tinhTrang = tinhTrang;
		}
	 
		@Override
	 double GetThanhTien() {
			if(this.tinhTrang) {
				return this.donGia * this.soLuong;
			}else{
				return this.donGia * this.soLuong * 0.5;
			}
		}
		@Override
	    public String toString() {
			if(tinhTrang) {
				return super.toString() + "|" + "mới";
			}else {
				return super.toString() + "|" + "cũ";
			}
	    }

}
