package bai6;

import java.util.Arrays;
import java.util.Comparator;

public class QuanLyHangHoa {
    private HangHoa[] danhSachHangHoa;
    private int soLuongHangHoa = 0; // keep track of the number of items in the list

    public QuanLyHangHoa(int n) {
        danhSachHangHoa = new HangHoa[n];
    }

    public boolean themHangHoa(HangHoa hangHoa) {
        // Check if the list is full
        if (soLuongHangHoa >= danhSachHangHoa.length) {
            return false;
        }

        // Check if the product code already exists
        for (int i = 0; i < soLuongHangHoa; i++) {
            if (danhSachHangHoa[i].getMaHang().equals(hangHoa.getMaHang())) {
                return false; // product code already exists
            }
        }

        // Add the product to the list
        danhSachHangHoa[soLuongHangHoa] = hangHoa;
        soLuongHangHoa++;
        return true;
    }

    public HangHoa[] getDanhSachHangHoa() {
        return Arrays.copyOf(danhSachHangHoa, soLuongHangHoa);
    }

    public HangHoa timKiemHangHoa(String maHang) {
        for (HangHoa hangHoa : danhSachHangHoa) {
            if (hangHoa.getMaHang().equals(maHang)) {
                return hangHoa;
            }
        }
        return null;
    }

    public void sapXepTheoTen() {
        Arrays.sort(danhSachHangHoa, Comparator.comparing(HangHoa::getTenHang));
    }

    public void sapXepTheoSoLuongTon() {
        Arrays.sort(danhSachHangHoa, Comparator.comparing(HangHoa::getSoLuongTon).reversed());
    }

    public HangHoa[] getHangThucPhamKhoBan() {
        return Arrays.stream(danhSachHangHoa)
                .filter(hangHoa -> hangHoa instanceof ThucPham && "Khó bán".equals(hangHoa.danhGiaMucDoBanBuon()))
                .toArray(HangHoa[]::new);
    }

    public boolean xoaHangHoa(String maHang) {
        for (int i = 0; i < soLuongHangHoa; i++) {
            if (danhSachHangHoa[i].getMaHang().equals(maHang)) {
                System.arraycopy(danhSachHangHoa, i + 1, danhSachHangHoa, i, soLuongHangHoa - i - 1);
                soLuongHangHoa--;
                return true;
            }
        }
        return false;
    }

    public boolean suaDonGia(String maHang, double donGiaMoi) {
        HangHoa hangHoa = timKiemHangHoa(maHang);
        if (hangHoa != null) {
            hangHoa.setDonGia(donGiaMoi);
            return true;
        }
        return false;
    }
}
