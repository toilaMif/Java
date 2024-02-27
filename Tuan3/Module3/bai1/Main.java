package bai1;

public class Main {
	  public static void main(String[] args) {
	        ChuyenXe[] danhSachChuyenXe = new ChuyenXe[4];
	        danhSachChuyenXe[0] = new ChuyenXeNoiThanh("Chuyen1", "Nguyen Thanh Trung", "22696701", 100000, "1", 30);
	        danhSachChuyenXe[1] = new ChuyenXeNoiThanh("Chuyen2", "Tran Van B", "12345", 200000, "2", 45);
	        danhSachChuyenXe[2] = new ChuyenXeNgoaiThanh("Chuyen3", "Le Van C", "56789", 300000, "Da Nang", 3);
	        danhSachChuyenXe[3] = new ChuyenXeNgoaiThanh("Chuyen4", "Pham Van D", "98765", 400000, "Nha Trang", 4);

	        double tongDoanhThu = 0;
	        double tongDoanhThuNoiThanh = 0;
	        double tongDoanhThuNgoaiThanh = 0;

	        for (ChuyenXe chuyenXe : danhSachChuyenXe) {
	            tongDoanhThu += chuyenXe.getDoanhThu();
	            if (chuyenXe instanceof ChuyenXeNoiThanh) {
	                tongDoanhThuNoiThanh += chuyenXe.getDoanhThu();
	            } else if (chuyenXe instanceof ChuyenXeNgoaiThanh) {
	                tongDoanhThuNgoaiThanh += chuyenXe.getDoanhThu();
	            }
	        }

	        System.out.println("Tổng doanh thu cho tất cả các chuyến xe: " + tongDoanhThu);
	        System.out.println("Tổng doanh thu cho các chuyến xe nội thành: " + tongDoanhThuNoiThanh);
	        System.out.println("Tổng doanh thu cho các chuyến xe ngoại thành: " + tongDoanhThuNgoaiThanh);
	    }
}
