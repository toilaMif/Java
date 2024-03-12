package Bai10;

import java.util.Scanner;

public class SinhVienCaoDang extends SinhVien{
	private String chuyenNganhCaoDang;
    private double soNamCaoDang;
    private double hocPhiCaoDang;
    
    public SinhVienCaoDang() {
    	super();
    }

    public SinhVienCaoDang (String ten, String maSinhVien,String CapDaoTao, String chuyenNganhCaoDang,double soNamCaoDang, double hocPhiCaoDang) {
        super(ten, maSinhVien, CapDaoTao);
        this.chuyenNganhCaoDang = chuyenNganhCaoDang;
        this.soNamCaoDang =soNamCaoDang;
        this.hocPhiCaoDang =hocPhiCaoDang;
    }

    @Override
    public void nhapThongTin() {
    	Scanner scanner = new Scanner(System.in);
    	super.nhapThongTin();
    	System.out.println("Nhập Chuyen Ngành:");
        this.chuyenNganhCaoDang = scanner.nextLine();

        System.out.println("Nhập Năm Cao đẵng:");
        this.soNamCaoDang = scanner.nextDouble();
        
        System.out.println("Nhập Học Phí Cao đẵng:");
        this.hocPhiCaoDang = scanner.nextDouble();
    }
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chuyên ngành: " + this.chuyenNganhCaoDang);
        System.out.println("Số năm học Cao đẵng: " + this.soNamCaoDang);
        System.out.println("Học Phí Cao đẵng: " + this.hocPhiCaoDang);
    }

}
