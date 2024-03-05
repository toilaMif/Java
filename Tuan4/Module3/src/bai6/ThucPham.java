package bai6;

import java.util.Date;


public class ThucPham extends HangHoa {
     String nhaCungCap;
     Date ngaySanXuat;
     Date ngayHetHan;

    ThucPham(String maHang, String tenHang, double donGia, int soLuongTon,String nhaCungCap, Date ngaySanXuat, Date ngayHetHan){
    	super(maHang, tenHang, donGia, soLuongTon);
    	this.nhaCungCap = nhaCungCap;
    	this.ngaySanXuat = ngaySanXuat;
    	this.ngayHetHan = ngayHetHan;
    }
    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    @Override
    public String danhGiaMucDoBanBuon() {
    
        Date currentDate = new Date();

     
        if (getSoLuongTon() > 0 && ngayHetHan.before(currentDate)) {
            return "Khó bán";
        }


        return "Không đánh giá";
    }

    @Override
    public double tinhVAT() {
        return getDonGia() * 0.05; 
    }
}
