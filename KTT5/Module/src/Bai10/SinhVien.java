package Bai10;

import java.util.Scanner;

public class SinhVien {
    protected String ten;
    protected String maSinhVien;
    protected String CapDaoTao;
    
    public SinhVien(){
    	
    }
    
    public SinhVien(String ten, String maSinhVien , String CapDaoTao) {
        this.ten = ten;
        this.maSinhVien = maSinhVien;
        this.CapDaoTao = CapDaoTao;
    }

    public void nhapThongTin() {
    	Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên sinh viên:");
        this.ten = scanner.nextLine();

        System.out.println("Nhập mã sinh viên:");
        this.maSinhVien = scanner.nextLine();
        
        System.out.println("Nhập cấp đào tạo:");
        this.CapDaoTao = scanner.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + this.ten);
        System.out.println("Mã sinh viên: " + this.maSinhVien);
        System.out.println("Nhập cấp đào tạo: " + this.CapDaoTao);
    }
}
