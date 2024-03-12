package Bai10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> sinhVienList = new ArrayList<>();

        System.out.println("Nhập số lượng sinh viên:");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.println("Nhập (1 cho SinhVienTrungCap, 2 cho SinhVienCaoDang, 3 cho SinhVienDaiHoc, 4 cho SinhVienLienKet):");
            int type = scanner.nextInt();
            scanner.nextLine(); 

            switch (type) {
                case 1:
                	SinhVienTrungCap sv1 = new SinhVienTrungCap();
                    sv1.nhapThongTin();
                    sinhVienList.add(sv1);
                	
                    
                    break;
                case 2:
                	SinhVienCaoDang sv2 = new SinhVienCaoDang();
                    sv2.nhapThongTin();
                    sinhVienList.add(sv2);
                	
                    break;
                case 3:
                	SinhVienDaiHoc sv3 = new SinhVienDaiHoc();
                    sv3.nhapThongTin();
                    sinhVienList.add(sv3);
                    break;
                case 4:
                	SinhVienLienKet sv4 = new SinhVienLienKet();
                    sv4.nhapThongTin();
                    sinhVienList.add(sv4);
                    break;
                default:
                    System.out.println("Loại sinh viên không hợp lệ. Vui lòng nhập lại.");
                    i--; 
                    break;
            }
        }

        System.out.println("\nThông tin sinh viên:");
        for (SinhVien sv : sinhVienList) {
            sv.hienThiThongTin();
            System.out.println();
        }
    }
}