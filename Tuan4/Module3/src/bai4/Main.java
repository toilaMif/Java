package bai4;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
 
    	List<Sach> danhSach = new ArrayList<>();
        danhSach.add(new SachGiaoKhoa("SGK1", LocalDate.of(2017, 05, 15), 100000.0, 1, "Kim ĐỒng", true));
        danhSach.add(new SachGiaoKhoa("SGK2", LocalDate.of(2018, 06, 16), 200000, 2, "Kim ĐỒng", false));
        danhSach.add(new SachThamKhao("STK1", LocalDate.of(2019, 07, 17), 300000, 3, "IUH", 10000));
        danhSach.add(new SachThamKhao("STK2", LocalDate.of(2020, 9, 18), 400000, 4, "IUH", 20000));
		
        Scanner sc = new Scanner(System.in);
        
        int choice;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị DS sách");
            System.out.println("3. Tính tổng thành tiền sách giáo khoa");
            System.out.println("4. Tính tổng thành tiền sách tham khao");
            System.out.println("5. Tìm sách giáo khoa theo NXB");
            System.out.println("6. Tìm thành tiền cao nhất");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                	Scanner sca = new Scanner(System.in);
                	String choicesach;
                	System.out.println("SGK. Sách giáo Khoa");
                    System.out.println("STK. Sách Tham khảo");
                    choicesach = sca.nextLine();
                	switch (choicesach) {
                	case "SGK":
                		Scanner scb = new Scanner(System.in);
                		
                		System.out.println("Nhập mã sách");
                		String maSach1 = scb.nextLine();
                		
                		System.out.println("Nhập ngày nhập");
                		int dd = scb.nextInt();
                		System.out.println("Nhập tháng nhập");
                		int mm = scb.nextInt();
                		System.out.println("Nhập năm nhập");
                		int yy = scb.nextInt();
                		
                		System.out.println("Nhập đơn giá");
                		double donGia1 = scb.nextDouble();
                		
                		System.out.println("Nhập Số Lượng");
                		int soLuong1 = scb.nextInt();
                		
                		scb.nextLine();
                		System.out.println("Nhập NXB");
                		String nhaXuatBan1 = scb.nextLine();
                		
//                		System.out.println("Nhập tình trạng");
//                		boolean tinhTrang1 = scb.nextBoolean();
                		
                		Sach sachnew = new SachGiaoKhoa(maSach1, LocalDate.of(yy, mm, dd), donGia1, soLuong1, nhaXuatBan1, true);
                		danhSach.add(sachnew);
                		
                		break;
                	case "STK":
						Scanner scd = new Scanner(System.in);
                		
                		System.out.println("Nhập mã sách");
                		String maSach2 = scd.nextLine();
                		
                		System.out.println("Nhập ngày nhập");
                		int dd1 = scd.nextInt();
                		System.out.println("Nhập tháng nhập");
                		int mm1 = scd.nextInt();
                		System.out.println("Nhập năm nhập");
                		int yy1 = scd.nextInt();
                		
                		System.out.println("Nhập đơn giá");
                		double donGia2 = scd.nextDouble();
                		
                		System.out.println("Nhập Số Lượng");
                		int soLuong2 = scd.nextInt();
                		
                		scd.nextLine();
                		System.out.println("Nhập NXB");
                		String nhaXuatBan2 = scd.nextLine();
                		
                		System.out.println("Nhập thuế");
                		double thue2 = scd.nextDouble();
                		
                		Sach sachnew1 = new SachThamKhao(maSach2, LocalDate.of(yy1, mm1, dd1), donGia2, soLuong2, nhaXuatBan2, thue2);
                		danhSach.add(sachnew1);
                		break;
                	}
                    
                    break;
                case 2:
                	for (Sach sach : danhSach) {
                	    System.out.println(sach.toString());
                	}
                    break;
                case 3:
                	double tongthanhtienSGK =0;
                	for(Sach  Sach : danhSach) {
            			if(Sach instanceof SachGiaoKhoa) {
            				tongthanhtienSGK += Sach.GetThanhTien();
            			}
                	}
                	System.out.println("Tính tổng thành tiền sách giáo khoa: " + tongthanhtienSGK);
                    break;
                case 4:
                	double tongthanhtienSTK =0;
                	for(Sach  Sach : danhSach) {
            			if(Sach instanceof SachThamKhao) {
            				tongthanhtienSTK += Sach.GetThanhTien();
            			}
                	}
                	System.out.println("Tính tổng thành tiền sách giáo khoa: " + tongthanhtienSTK);
                    break;
                case 5:
                	Scanner scc = new Scanner(System.in);
                	String TimNXB;
                	System.out.println("Nhập NXB :");
                	Boolean kysach = true;
            		TimNXB = scc.nextLine();
                	for(Sach Sach : danhSach) {
                		if(Sach.nhaXuatBan.equals(TimNXB)) {
            				System.out.println(Sach.maSach + " " + Sach.ngayNhap + " " + Sach.donGia + " " + Sach.soLuong + " " + Sach.nhaXuatBan);
            				kysach=false;
                		}
            		}
                	
                	sc.close();
                	if(kysach) {
                		System.out.println("Không tìm thấy sách của NXB: " + TimNXB);
                	}
                    break;
				case 6:
					double MaxThanhTien = 0;
					for(Sach  Sach : danhSach) {
						if(MaxThanhTien<Sach.GetThanhTien()) {
							MaxThanhTien = Sach.GetThanhTien();
						}
					}
					System.out.println("Thành Tiền cao Nhất là: " + MaxThanhTien);
					 break;
                case 0:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 0);
    }
}
