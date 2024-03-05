package bai6;



public class DienMay extends HangHoa {
     int thoiGianBaoHanh; 
     double congSuat; 

    DienMay(String maHang, String tenHang, double donGia, int soLuongTon,int thoiGianBaoHanh, double congSuat){
    	super(maHang, tenHang, donGia, soLuongTon);
    	this.thoiGianBaoHanh = thoiGianBaoHanh;
    	this.congSuat = congSuat;
    }
    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public double getCongSuat() {
        return congSuat;
    }

    
    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String danhGiaMucDoBanBuon() {
        if (getSoLuongTon() < 3) {
            return "Bán được";
        }
        return "Không đánh giá";
    }

    @Override
    public double tinhVAT() {
        return getDonGia() * 0.1; 
    }
}
