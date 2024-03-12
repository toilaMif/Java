package Bai10;

import java.util.Scanner;

public class SinhVienLienKet extends SinhVien{
	private String chuyenNganhLienKet;
    private double soNamLienKet;
    private double hocPhiLienKet;
    private String QuocTich;
    
    public SinhVienLienKet() {
    	super();
    }

    public SinhVienLienKet(String ten, String maSinhVien,String CapDaoTao, String chuyenNganhLienKet,double soNamLienKet, double hocPhiLienKet, String QuocTich) {
        super(ten, maSinhVien, CapDaoTao);
        this.chuyenNganhLienKet = chuyenNganhLienKet;
        this.soNamLienKet =soNamLienKet;
        this.hocPhiLienKet =hocPhiLienKet;
        this.QuocTich =QuocTich;
    }

    @Override
    public void nhapThongTin() {
    	Scanner scanner = new Scanner(System.in);
    	super.nhapThongTin();
    	System.out.println("Nhập Chuyen Ngành:");
        this.chuyenNganhLienKet = scanner.nextLine();

        System.out.println("Nhập Năm học liên kết:");
        this.soNamLienKet = scanner.nextDouble();
        
        System.out.println("Nhập Học Phí sinh viên liên kết:");
        this.hocPhiLienKet= scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("Nhập Quốc tịch:");
        this.QuocTich = scanner.nextLine();
    }
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chuyên ngành: " + this.chuyenNganhLienKet);
        System.out.println("Số năm học liên kết: " + this.soNamLienKet);
        System.out.println("Học Phí liên kết: " + this.hocPhiLienKet);
        System.out.println("Quốc tịch sinh viên liên kết: " + this.QuocTich);
    }

}
