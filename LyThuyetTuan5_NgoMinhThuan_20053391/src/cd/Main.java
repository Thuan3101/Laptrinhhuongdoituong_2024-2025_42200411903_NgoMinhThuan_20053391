package cd;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo danh sách CD và khởi tạo một số CD mẫu
		 CDList cdList = new  CDList(10);

		 CD cd1 = new CD(1, "CD1", 10, 9.99);
		 CD cd2 = new CD(2, "CD2", 15, 14.99);
		 CD cd3 = new CD(3, "CD3", 12, 12.99);

		 cdList.themCD(cd1);
		 cdList.themCD(cd2);
		 cdList.themCD(cd3);

		 Scanner scanner = new Scanner(System.in);

		 while (true) {
		     System.out.println("\n				HỆ THỐNG QUẢN LÝ CD");
		     System.out.println("			1. Thêm một CD");
		     System.out.println("			2. Hiển thị tất cả CD");
		     System.out.println("			3. Tổng giá thành của tất cả CD");
		     System.out.println("			4. Sắp xếp theo tựa CD");
		     System.out.println("			5. Sắp xếp theo giá thành giảm dần");
		     System.out.println("			6. Thoát");
		     System.out.print("Nhập lựa chọn của bạn: ");
		            
		            int luaChon = scanner.nextInt();

		            switch (luaChon) {
		                case 1:
		                    System.out.print("Nhập mã CD: ");
		                    int maCD = scanner.nextInt();
		                    scanner.nextLine(); // Đọc ký tự xuống dòng

		                    System.out.print("Nhập tựa CD: ");
		                    String tuaCD = scanner.nextLine();

		                    System.out.print("Nhập số bài hát: ");
		                    int soBaiHat = scanner.nextInt();

		                    System.out.print("Nhập giá thành của CD: ");
		                    double giaThanh = scanner.nextDouble();

		                    CD cd = new CD(maCD, tuaCD, soBaiHat, giaThanh);
		                    
		                    if (cdList.themCD(cd)) {
		                        System.out.println("Thêm CD thành công!");
		                    } else {
		                        System.out.println("Danh sách CD đã đầy. Không thể thêm CD nữa.");
		                    }
		                    break;
		                case 2:
		                    System.out.println("\nDanh sách các CD:");
		                    System.out.println(cdList.hienThiDanhSachCD());
		                    break;
		                case 3:
		                    System.out.println("Tổng giá thành của tất cả CD: $" + cdList.tinhTongGiaThanh());
		                    break;
		                case 4:
		                    cdList.sapXepTangTheoTuaCD();
		                    System.out.println("Danh sách CD sắp xếp theo tựa CD (tăng dần):");
		                    System.out.println(cdList.hienThiDanhSachCD());
		                    break;
		                case 5:
		                    cdList.sapXepGiamTheoGiaThanh();
		                    System.out.println("Danh sách CD sắp xếp theo giá thành giảm dần:");
		                    System.out.println(cdList.hienThiDanhSachCD());
		                    break;
		                case 6:
		                    System.out.println("Đang thoát khỏi Hệ thống Quản lý CD.");
		                    System.exit(0);
		                default:
		                	System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
		                	break;
            }
        }
	}
}
