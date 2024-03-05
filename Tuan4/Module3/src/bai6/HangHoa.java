package bai6;

public abstract class HangHoa {
    String maHang;
    String tenHang;
    double donGia;
    int soLuongTon;

    HangHoa(String maHang, String tenHang, double donGia, int soLuongTon){
    	this.maHang = maHang;
    	this.tenHang = tenHang;
    	this.donGia = donGia;
    	this.soLuongTon = soLuongTon;
    }
    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public abstract String danhGiaMucDoBanBuon();

    public double tinhVAT() {
        return donGia * 0.1; 
    }
}
