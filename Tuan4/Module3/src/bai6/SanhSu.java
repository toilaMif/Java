package bai6;

import java.util.Date;
import java.time.temporal.ChronoUnit;

public class SanhSu extends HangHoa {
     String nhaSanXuat;
     Date ngayNhapKho;

     SanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSanXuat, Date ngayNhapKho){
     	super(maHang, tenHang, donGia, soLuongTon);
     	this.nhaSanXuat = nhaSanXuat;
     	this.ngayNhapKho = ngayNhapKho;
     }
    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }


    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    @Override
    public String danhGiaMucDoBanBuon() {
        long soNgayLuuKho = ChronoUnit.DAYS.between(ngayNhapKho, new Date());
        if (getSoLuongTon() > 50 && soNgayLuuKho > 10) {
            return "Bán chậm";
        }
        return "Không đánh giá";
    }

    @Override
    public double tinhVAT() {
        return getDonGia() * 0.1; 
    }
}
