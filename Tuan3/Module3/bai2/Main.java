package bai2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Sach danhsach[] = new Sach[4];
		danhsach[0] = new SachGiaoKhoa("SGK1", "27/02/2024", 100000, 1, "Kim ĐỒng", "mới");
		danhsach[1] = new SachGiaoKhoa("SGK2", "20/10/2020", 200000, 2, "Kim ĐỒng", "cũ");
		danhsach[2] = new SachThamKhao("STK1", "01/01/2023", 300000, 3, "IUH", 10000);
		danhsach[3] = new SachThamKhao("STK2", "14/01/2023", 400000, 4, "IUH", 20000);
		
		double ThanhTienSGK = 0;
		double ThanhTienSTK = 0;
		double TNSB1 = 1;
		double MaxThanhTien = 0;
		String TimNXB; 
		
		for(Sach  Sach : danhsach) {
			if(Sach instanceof SachGiaoKhoa) {
				ThanhTienSGK += Sach.GetThanhTien();
			}else if (Sach instanceof SachThamKhao){
				ThanhTienSTK += Sach.GetThanhTien();
			}
		}
		System.out.println("Tổng thành tiền sách giáo khoa là: " + ThanhTienSGK);
		System.out.println("Tổng thành tiền sách tham khảo là: " + ThanhTienSTK);
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nhập NXB :");
		TimNXB = sc.nextLine();

		for(Sach Sach : danhsach) {
			if(Sach.NhaXuatBan.equals(TimNXB)) {
				System.out.println(Sach.MaSach + " " + Sach.NgayNhap + " " + Sach.DonGia + " " + Sach.SoLuong + " " + Sach.NhaXuatBan);
				TNSB1=0;
			}
		}
		sc.close();
		if(TNSB1==1) {
			System.out.println("Không tìm thấy sách của NXB: " + TimNXB);
		}
		
		for(Sach  Sach : danhsach) {
			if(MaxThanhTien<Sach.GetThanhTien()) {
				MaxThanhTien = Sach.GetThanhTien();
			}
		}
		System.out.println("Thành Tiền cao Nhất là: " + MaxThanhTien);
	}

}





