package bai3;

public class Main {
	public static void main(String[] args) {
		GiaoDich danhsachgiaodich[] = new GiaoDich[6];
		
		danhsachgiaodich[0] = new GiaoDichVang("GDV1", "22-10-2023", 100000, 10, "9999");
		danhsachgiaodich[1] = new GiaoDichVang("GDV2", "12-11-2023", 200000, 20, "SCJ");
		danhsachgiaodich[2] = new GiaoDichVang("GDV3", "19-12-2023", 300000, 30, "Vang Rong");
		danhsachgiaodich[3] = new GiaoDichTienTe("GDTT1", "02-07-2023", 10, 100, 23000, "USD");
		danhsachgiaodich[4] = new GiaoDichTienTe("GDTT2", "12-08-2023", 20, 200, 25000,"Euro");
		danhsachgiaodich[5] = new GiaoDichTienTe("GDTT3", "22-09-2023", 1000, 300, 0, "VN");
		
		double TongSoLuongGiaoDichVang = 0;
		double TongSoLuongGiaoDichTienTe = 0;
		double ThanhTienGiaoDichTienTe = 0;
		double TrungBinhThanhTienGiaoDichTienTe = 0;
		double ty = 1;
		
		
		for(GiaoDich GiaoDich : danhsachgiaodich) {
			if(GiaoDich instanceof GiaoDichVang) {
				TongSoLuongGiaoDichVang += GiaoDich.SoLuong;
			}else if(GiaoDich instanceof GiaoDichTienTe) {
				TongSoLuongGiaoDichTienTe += GiaoDich.SoLuong;
				ThanhTienGiaoDichTienTe += GiaoDich.GetThanhTien();
			}
		}
		TrungBinhThanhTienGiaoDichTienTe = ThanhTienGiaoDichTienTe/TongSoLuongGiaoDichTienTe;
		
		System.out.println("Tổng số lượng cho loại giao dịch vàng là: " + TongSoLuongGiaoDichVang);
		System.out.println("Tổng số lượng cho loại giao dịch Tiền tệ là: " + TongSoLuongGiaoDichTienTe);
		System.out.println("Thành tiền giao dịch tiền tệ: " + ThanhTienGiaoDichTienTe);
		System.out.println("Trung bình thành tiền của giao dịch tiền tệ là: " + TrungBinhThanhTienGiaoDichTienTe);
		
		for(GiaoDich GiaoDich : danhsachgiaodich) {
			if(GiaoDich.DonGia > 1000000000) {
				System.out.println(GiaoDich.MaGiaoDich + " " + GiaoDich.NgayGiaoDich + " " + GiaoDich.DonGia + " " + GiaoDich.SoLuong);
			}else {
				ty=0;
			}
		}
		if(ty==0)
		{
			System.out.println("Không có giao dịch nào trên 1 tỷ");
		}
		
	}
}
