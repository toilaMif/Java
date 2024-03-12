package Bai10;

import java.util.Scanner;

public class SinhVienTrungCap extends SinhVien {
    private String chuyenNganhTrungCap;
    private double soNamTrungCap;
    private double hocPhiTrungCap;
    
    
    public SinhVienTrungCap() {
    	super();
    }
    
    public SinhVienTrungCap(String ten, String maSinhVien,String CapDaoTao, String chuyenNganhTrungCap,double soNamTrungCap, double hocPhiTrungCap) {
        super(ten, maSinhVien, CapDaoTao);
        this.chuyenNganhTrungCap = chuyenNganhTrungCap;
        this.soNamTrungCap =soNamTrungCap;
        this.hocPhiTrungCap =hocPhiTrungCap;
    }

    @Override
    public void nhapThongTin() {
    	Scanner scanner = new Scanner(System.in);
   
    	super.nhapThongTin();
    	System.out.println("Nhập Chuyen Ngành:");
        this.chuyenNganhTrungCap = scanner.nextLine();

        System.out.println("Nhập Năm Trung cấp:");
        this.soNamTrungCap = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Nhập Học Phí Trung Cấp:");
        this.hocPhiTrungCap = Double.parseDouble(scanner.nextLine());
    }
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chuyên ngành: " + this.chuyenNganhTrungCap);
        System.out.println("Số năm học Trung Cấp: " + this.soNamTrungCap);
        System.out.println("Học Phí Trung Cấp: " + this.hocPhiTrungCap);
    }
}