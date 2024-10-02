package quanlyphonghoc;
import java.util.ArrayList;
import java.util.List;

public class DanhSachPhongHoc {
    private List<PhongHoc> danhSachPhongHoc;

    public DanhSachPhongHoc() {
        danhSachPhongHoc = new ArrayList<>();
    }

    // Phương thức thêm một phòng học vào danh sách (thêm được nếu không trùng mã phòng).
    public void themPhongHoc(PhongHoc phongHoc) {
    	
        if (!danhSachPhongHoc.contains(phongHoc)) {
            danhSachPhongHoc.add(phongHoc);
        }
    }

    // Phương thức tìm kiếm một phòng học theo mã phòng.
    public PhongHoc timPhongHocTheoMa(String maPhong) {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc.getMaPhong().equals(maPhong)) {
                return phongHoc;
            }
        }
        return null; // Không tìm thấy
    }

    // Phương thức lấy thông tin toàn bộ danh sách các phòng học.
    public List<PhongHoc> layDanhSachPhongHoc() {
        return danhSachPhongHoc;
    }

    // Phương thức để lấy thông tin các phòng học đạt chuẩn.
    public List<PhongHoc> layPhongHocDatChuan() {
        List<PhongHoc> phongHocDatChuan = new ArrayList<>();
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc.datChuan()) {
                phongHocDatChuan.add(phongHoc);
            }
        }
        return phongHocDatChuan;
    }

    // Phương thức để sắp xếp danh sách tăng dần theo dãy nhà.
    public void sapXepTangDanTheoDayNha() {
        danhSachPhongHoc.sort((ph1, ph2) -> ph1.getDayNha().compareTo(ph2.getDayNha()));
    }

    // Phương thức để sắp xếp danh sách giảm dần theo diện tích.
    public void sapXepGiamDanTheoDienTich() {
        danhSachPhongHoc.sort((ph1, ph2) -> Double.compare(ph2.getDienTich(), ph1.getDienTich()));
    }

    // Phương thức để sắp xếp danh sách tăng dần theo số bóng đèn.
    public void sapXepTangDanTheoSoBongDen() {
        danhSachPhongHoc.sort((ph1, ph2) -> Integer.compare(ph1.getSoBongDen(), ph2.getSoBongDen()));
    }

    // Phương thức để cập nhật số máy tính cho phòng máy tính khi biết mã phòng.
    public void capNhatSoMayTinh(String maPhongMayTinh, int soMayTinhMoi) {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc instanceof PhongMayTinh && phongHoc.getMaPhong().equals(maPhongMayTinh)) {
                ((PhongMayTinh) phongHoc).setSoMayTinh(soMayTinhMoi);
                break;
            }
        }
    }

    // Phương thức để xóa phòng học theo mã phòng.
    public boolean xoaPhongHocTheoMa(String maPhong) {
        return danhSachPhongHoc.removeIf(phongHoc -> phongHoc.getMaPhong().equals(maPhong));
    }

    // Phương thức để tính tổng số phòng học.
    public int tinhTongSoPhongHoc() {
        return danhSachPhongHoc.size();
    }

    // Phương thức để lấy danh sách phòng máy có 60 máy.
    public List<PhongMayTinh> layPhongMayTinhCo60May() {
        List<PhongMayTinh> phongMayTinhCo60May = new ArrayList<>();
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc instanceof PhongMayTinh && ((PhongMayTinh) phongHoc).getSoMayTinh() == 60) {
                phongMayTinhCo60May.add((PhongMayTinh) phongHoc);
            }
        }
        return phongMayTinhCo60May;
    }
    
    public List<PhongHoc> getDanhSachPhongHoc() {
		return danhSachPhongHoc;
	}
}