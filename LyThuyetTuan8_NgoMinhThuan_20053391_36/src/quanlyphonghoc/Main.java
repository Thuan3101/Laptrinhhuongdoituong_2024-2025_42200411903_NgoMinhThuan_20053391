package quanlyphonghoc;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DanhSachPhongHoc quanLyPhongHoc = new DanhSachPhongHoc();
        Scanner scanner = new Scanner(System.in);
        quanLyPhongHoc.themPhongHoc(new PhongLyThuyet("LT101", "A1", 100, 10, true));
        quanLyPhongHoc.themPhongHoc(new PhongMayTinh("MT201", "B2", 80, 12, 30));
        quanLyPhongHoc.themPhongHoc(new PhongThiNghiem("TN301", "C3", 120, 15, "Hóa học", 20, true));
        quanLyPhongHoc.themPhongHoc(new PhongLyThuyet("LT102", "A1", 110, 9, false));
        quanLyPhongHoc.themPhongHoc(new PhongMayTinh("MT202", "B2", 90, 10, 40));
        quanLyPhongHoc.themPhongHoc(new PhongThiNghiem("TN302", "C3", 130, 20, "Vật lý", 25, true));
        int choice;

        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Thêm phòng học");
            System.out.println("2. Tìm phòng học theo mã");
            System.out.println("3. Hiển thị danh sách phòng học");
            System.out.println("4. Hiển thị danh sách phòng học đạt chuẩn");
            System.out.println("5. Sắp xếp theo dãy nhà");
            System.out.println("6. Sắp xếp theo diện tích giảm dần");
            System.out.println("7. Sắp xếp theo số bóng đèn tăng dần");
            System.out.println("8. Cập nhật số máy tính cho phòng máy tính");
            System.out.println("9. Xóa phòng học theo mã");
            System.out.println("10. Tổng số phòng học");
            System.out.println("11. Hiển thị phòng máy có 60 máy");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Thêm phòng học
                    // Cần thêm mã phòng, dãy nhà, diện tích, số bóng đèn và các thông tin khác tùy loại phòng
                    // Sau đó sử dụng quanLyPhongHoc.themPhongHoc() để thêm vào danh sách
                    break;
                case 2:
                    // Tìm phòng học theo mã
                    System.out.print("Nhập mã phòng: ");
                    scanner.nextLine();
                    String maPhong = scanner.nextLine();
                    PhongHoc foundPhong = quanLyPhongHoc.timPhongHocTheoMa(maPhong);
                    if (foundPhong != null) {
                        System.out.println("Phòng học được tìm thấy: " + foundPhong);
                    } else {
                        System.out.println("Không tìm thấy phòng học với mã " + maPhong);
                    }
                    break;
                case 3:
                    // Hiển thị danh sách phòng học
                    List<PhongHoc> danhSachPhongHoc = quanLyPhongHoc.layDanhSachPhongHoc();
                    for (PhongHoc phongHoc : danhSachPhongHoc) {
                        System.out.println(phongHoc);
                    }
                    break;
                case 4:
                    // Hiển thị danh sách phòng học đạt chuẩn
                    List<PhongHoc> phongDatChuan = quanLyPhongHoc.layPhongHocDatChuan();
                    for (PhongHoc phongHoc : phongDatChuan) {
                        System.out.println(phongHoc);
                    }
                    break;
                case 5:
                    // Sắp xếp theo dãy nhà
                    quanLyPhongHoc.sapXepTangDanTheoDayNha();
                    break;
                case 6:
                    // Sắp xếp theo diện tích giảm dần
                    quanLyPhongHoc.sapXepGiamDanTheoDienTich();
                    break;
                case 7:
                    // Sắp xếp theo số bóng đèn tăng dần
                    quanLyPhongHoc.sapXepTangDanTheoSoBongDen();
                    break;
                case 8:
                    // Cập nhật số máy tính cho phòng máy tính
                    System.out.print("Nhập mã phòng máy tính: ");
                    scanner.nextLine();
                    String maPhongMayTinh = scanner.nextLine();
                    System.out.print("Nhập số máy tính mới: ");
                    int soMayTinhMoi = scanner.nextInt();
                    quanLyPhongHoc.capNhatSoMayTinh(maPhongMayTinh, soMayTinhMoi);
                    break;
                case 9:
                    // Xóa phòng học theo mã
                    System.out.print("Nhập mã phòng cần xóa: ");
                    scanner.nextLine();
                    String maPhongXoa = scanner.nextLine();
                    quanLyPhongHoc.xoaPhongHocTheoMa(maPhongXoa);
                    break;
                case 10:
                    // Tổng số phòng học
                    int tongSoPhongHoc = quanLyPhongHoc.tinhTongSoPhongHoc();
                    System.out.println("Tổng số phòng học: " + tongSoPhongHoc);
                    break;
                case 11:
                    // Hiển thị phòng máy có 60 máy
                    List<PhongMayTinh> phongMayTinhCo60May = quanLyPhongHoc.layPhongMayTinhCo60May();
                    for (PhongMayTinh phongMay : phongMayTinhCo60May) {
                        System.out.println(phongMay);
                    }
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 0);
    }
}
