package bai4;

import java.util.ArrayList;
import java.util.List;

class DanhSachSach {
    private List<Sach> DanhsachSach; // Danh sách các sách
    private int count; // Số lượng sách trong danh sách

    public DanhSachSach(int count) {
        DanhsachSach = new ArrayList<>(); // Khởi tạo danh sách
        this.count = 0; // Ban đầu danh sách rỗng
    }

    public boolean them(Sach sach) {
        if (count < DanhsachSach.size()) {
            DanhsachSach.add(sach);
            count++;
            return true;
        } else {
            System.out.println("Danh sách đã đầy!");
            return false;
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Danh sách các sách có trong danh sách:\n");
        for (Sach sach : DanhsachSach) {
            result.append(sach.toString()).append("\n");
        }
        return result.toString();
    }

    public double tinhTongThanhTienSGK() {
        double tongThanhTien = 0;
        for (Sach sach : DanhsachSach) {
            if (sach instanceof SachGiaoKhoa) {
                tongThanhTien += sach.GetThanhTien();
            }
        }
        return tongThanhTien;
    }

    public double tinhTongThanhTienSTK() {
        double tongThanhTien = 0;
        for (Sach sach : DanhsachSach) {
            if (sach instanceof SachThamKhao) {
                tongThanhTien += sach.GetThanhTien();
            }
        }
        return tongThanhTien;
    }

    public List<Sach> timSachGiaoKhoaTheoNXB(String nhaXuatBan) {
        List<Sach> ketQua = new ArrayList<>();
        for (Sach sach : DanhsachSach) {
            if (sach instanceof SachGiaoKhoa && sach.getnhaXuatBan().equals(nhaXuatBan)) {
                ketQua.add(sach);
            }
        }
        return ketQua;
    }

    public double timThanhTienCaoNhat() {
        double maxThanhTien = 0;
        for (Sach sach : DanhsachSach) {
            double thanhTien = sach.GetThanhTien();
            if (thanhTien > maxThanhTien) {
                maxThanhTien = thanhTien;
            }
        }
        return maxThanhTien;
    }
}
