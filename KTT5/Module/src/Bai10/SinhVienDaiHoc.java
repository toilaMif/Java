package Bai10;

import java.util.Scanner;

public class SinhVienDaiHoc extends SinhVien{
	 private String chuyenNganhDaiHoc;
	    private double soNamDaiHoc;
	    private double hocPhiDaiHoc;
	    
	    public SinhVienDaiHoc() {
	    	super();
	    }

	    public SinhVienDaiHoc(String ten, String maSinhVien,String CapDaoTao, String chuyenNganhDaiHoc,double soNamDaiHoc, double hocPhiDaiHoc) {
	        super(ten, maSinhVien, CapDaoTao);
	        this.chuyenNganhDaiHoc = chuyenNganhDaiHoc;
	        this.soNamDaiHoc =soNamDaiHoc;
	        this.hocPhiDaiHoc =hocPhiDaiHoc;
	    }

	    @Override
	    public void nhapThongTin() {
	    	Scanner scanner = new Scanner(System.in);
	    	super.nhapThongTin();
	    	System.out.println("Nhập Chuyen Ngành:");
	        this.chuyenNganhDaiHoc = scanner.nextLine();

	        System.out.println("Nhập Năm Đại Học:");
	        this.soNamDaiHoc = scanner.nextDouble();
	        
	        System.out.println("Nhập Học Phí Đại Học:");
	        this.hocPhiDaiHoc= scanner.nextDouble();
	    }
	    public void hienThiThongTin() {
	        super.hienThiThongTin();
	        System.out.println("Chuyên ngành: " + this.chuyenNganhDaiHoc);
	        System.out.println("Số năm học Đại Học: " + this.soNamDaiHoc);
	        System.out.println("Học Phí Đại Học: " + this.hocPhiDaiHoc);
	    }

}
