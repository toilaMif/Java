package bai6;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        QuanLyHangHoa quanLy = new QuanLyHangHoa(100);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {
            System.out.println("1. Thêm hàng hóa");
            System.out.println("2. Hiển thị danh sách hàng hóa");
            System.out.println("3. Tìm kiếm hàng hóa");
            System.out.println("4. Sắp xếp hàng hóa theo tên");
            System.out.println("5. Sắp xếp hàng hóa theo số lượng tồn");
            System.out.println("6. Hiển thị hàng thực phẩm khó bán");
            System.out.println("7. Xóa hàng hóa");
            System.out.println("8. Sửa đơn giá của hàng hóa");
            System.out.println("9. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over

            switch (choice) {
                case 1:
                    System.out.println("Chọn loại hàng hóa (1: Thực phẩm, 2: Điện máy, 3: Sành sứ): ");
                    int loaiHang = scanner.nextInt();
                    scanner.nextLine(); // consume newline left-over

                    System.out.print("Nhập mã hàng: ");
                    String maHang = scanner.nextLine();

                    System.out.print("Nhập tên hàng: ");
                    String tenHang = scanner.nextLine();

                    System.out.print("Nhập đơn giá: ");
                    double donGia = scanner.nextDouble();

                    System.out.print("Nhập số lượng tồn: ");
                    int soLuongTon = scanner.nextInt();
                    scanner.nextLine(); // consume newline left-over

                    HangHoa hangHoa = null;

                    switch (loaiHang) {
                        case 1: // Thực phẩm
                            System.out.print("Nhập nhà cung cấp: ");
                            String nhaCungCap = scanner.nextLine();

                            System.out.print("Nhập ngày sản xuất (dd/MM/yyyy): ");
                            Date ngaySanXuat = sdf.parse(scanner.nextLine());

                            System.out.print("Nhập ngày hết hạn (dd/MM/yyyy): ");
                            Date ngayHetHan = sdf.parse(scanner.nextLine());

                            hangHoa = new ThucPham(maHang, tenHang, donGia, soLuongTon, nhaCungCap, ngaySanXuat, ngayHetHan);
                            break;
                        case 2: // Điện máy
                            System.out.print("Nhập thời gian bảo hành (tháng): ");
                            int thoiGianBaoHanh = scanner.nextInt();

                            System.out.print("Nhập công suất (KW): ");
                            double congSuat = scanner.nextDouble();

                            hangHoa = new DienMay(maHang, tenHang, donGia, soLuongTon, thoiGianBaoHanh, congSuat);
                            break;
                        case 3: // Sành sứ
                            System.out.print("Nhập nhà sản xuất: ");
                            String nhaSanXuat = scanner.nextLine();

                            System.out.print("Nhập ngày nhập kho (dd/MM/yyyy): ");
                            Date ngayNhapKho = sdf.parse(scanner.nextLine());

                            hangHoa = new SanhSu(maHang, tenHang, donGia, soLuongTon, nhaSanXuat, ngayNhapKho);
                            break;
                        default:
                            System.out.println("Loại hàng không hợp lệ.");
                            break;
                    }

                    if (hangHoa != null && quanLy.themHangHoa(hangHoa)) {
                        System.out.println("Đã thêm hàng hóa.");
                    } else {
                        System.out.println("Không thể thêm hàng hóa.");
                    }
                    break;
                case 2:
                    HangHoa[] danhSach = quanLy.getDanhSachHangHoa();
                    for (HangHoa hangHoa1 : danhSach) {
                        System.out.println(hangHoa1);
                    }
                    break;
                case 3:
                    System.out.print("Nhập mã hàng: ");
                    String maHang1 = scanner.nextLine();
                    HangHoa hangHoa2 = quanLy.timKiemHangHoa(maHang1);
                    if (hangHoa2 != null) {
                        System.out.println(hangHoa2);
                    } else {
                        System.out.println("Không tìm thấy hàng hóa.");
                    }
                    break;
                case 4:
                    quanLy.sapXepTheoTen();
                    break;
                case 5:
                    quanLy.sapXepTheoSoLuongTon();
                    break;
                case 6:
                    HangHoa[] hangKhoBan = quanLy.getHangThucPhamKhoBan();
                    for (HangHoa hang : hangKhoBan) {
                        System.out.println(hang);
                    }
                    break;
                case 7:
                    System.out.print("Nhập mã hàng: ");
                    String maHangXoa = scanner.nextLine();
                    if (quanLy.xoaHangHoa(maHangXoa)) {
                        System.out.println("Đã xóa hàng hóa.");
                    } else {
                        System.out.println("Không tìm thấy hàng hóa.");
                    }
                    break;
                case 8:
                    System.out.print("Nhập mã hàng: ");
                    String maHangSua = scanner.nextLine();
                    System.out.print("Nhập đơn giá mới: ");
                    double donGiaMoi = scanner.nextDouble();
                    if (quanLy.suaDonGia(maHangSua, donGiaMoi)) {
                        System.out.println("Đã cập nhật đơn giá.");
                    } else {
                        System.out.println("Không tìm thấy hàng hóa.");
                    }
                    break;
                case 9:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
