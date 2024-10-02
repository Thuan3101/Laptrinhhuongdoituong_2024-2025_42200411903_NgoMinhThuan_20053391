package quanlihanghoa;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuanLiHangHoa qlhh = new QuanLiHangHoa(10);
		Scanner sc = new Scanner(System.in);
		
		
		
//Tao du lieu
		qlhh.themHangHoa(new ThucPham("TP001", "Thịt heo", 100, 100000, "Cty TNHH Thực phẩm", LocalDate.of(2021, 12, 1),
				  LocalDate.of(2022, 02, 01)));
				qlhh.themHangHoa(new ThucPham("TP002", "Thịt bò", 100, 200000, "Cty TNHH Thực phẩm", LocalDate.of(2021, 12, 1),
				  LocalDate.of(2022, 02, 01)));
				qlhh.themHangHoa(new ThucPham("TP003", "Thịt gà", 100, 300000, "Cty TNHH Thực phẩm", LocalDate.of(2021, 12, 1),
				  LocalDate.of(2022, 02, 01)));
		qlhh.themHangHoa(new DienMay("DM001", "Tivi", 100, 10000000, 12, 100));
		qlhh.themHangHoa(new DienMay("DM002", "Tủ lạnh", 100, 20000000, 24, 200));
		qlhh.themHangHoa(new DienMay("DM003", "Máy giặt", 100, 30000000, 36, 300));
		qlhh.themHangHoa(new SanhSu("SS001 ", "Bàn", 100, 100000, "Cty TNHH Sản xuất", LocalDate.of(2023, 12, 1)));
		qlhh.themHangHoa(new SanhSu("SS002 ", "Ghế", 100, 200000, "Cty TNHH Sản xuất", LocalDate.of(2023, 12, 1)));
		qlhh.themHangHoa(new SanhSu("SS003 ", "Tủ", 100, 300000, "Cty TNHH Sản xuất", LocalDate.of(2023, 12, 1)));
		
		while (true) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Menu: ");
			System.out.println("1. In danh sách hàng hóa");
			System.out.println("2. In danh sách hàng hóa theo loại");
			System.out.println("3. Thêm hàng hóa");
			System.out.println("4. Xóa hàng hóa");
			System.out.println("5. Sắp xếp hàng hóa theo tên");
			System.out.println("6. Sắp xếp hàng hóa theo số lượng tồn");
			System.out.println("7. Thoát");
			
			System.out.print("Chọn chức năng: ");
			int chon = sc.nextInt();
			sc.nextLine();
			
			
			switch(chon) {
			case 1:
				qlhh.inDSHangHoa();
				break;
			case 2:
				System.out.print("Nhập loại hàng hóa cần in: ");
				String loai = sc.nextLine();
				qlhh.inDSHangHoaTheoLoai(loai);
				break;
			case 3:
				System.out.print("Nhập mã hàng: ");
                String maHang = sc.nextLine();
                System.out.print("Nhập tên hàng: ");
                String tenHang = sc.nextLine();
                System.out.print("Nhập số lượng tồn: ");
                int soLuongTon = sc.nextInt();
                System.out.print("Nhập đơn giá: ");
                double donGia = sc.nextDouble();
                sc.nextLine();
                System.out.print("Nhập loại hàng hóa (Thực phẩm, Điện máy, Sành sứ): ");
                String loaiHang = sc.nextLine();
                if (loaiHang.equals("Thực phẩm")) {
                    System.out.print("Nhập nhà sản xuất: ");
                    String nhaSanXuat = sc.nextLine();
                    System.out.print("Nhập ngày sản xuất (yyyy-MM-dd): ");
                    String ngaySanXuat = sc.nextLine();
                    System.out.print("Nhập ngày hết hạn (yyyy-MM-dd): ");
                    String ngayHetHan = sc.nextLine();
                    qlhh.themHangHoa(new ThucPham(maHang, tenHang, soLuongTon, donGia, nhaSanXuat, LocalDate.parse(ngaySanXuat), LocalDate.parse(ngayHetHan)));
                } else if (loaiHang.equals("Điện máy")) {
                    System.out.print("Nhập thời gian bảo hành: ");
                    int thoiGianBaoHanh = sc.nextInt();
                    System.out.print("Nhập công suất: ");
                    double congSuat = sc.nextDouble();
                    qlhh.themHangHoa(new DienMay(maHang, tenHang, soLuongTon, donGia, thoiGianBaoHanh, congSuat));
                } else if (loaiHang.equals("Sành sứ")) {
                    System.out.print("Nhập nhà sản xuất: ");
                    String nhaSanXuat = sc.nextLine();
                    System.out.print("Nhập ngày nhập kho (yyyy-MM-dd): ");
                    String ngayNhapKho = sc.nextLine();
                    qlhh.themHangHoa(new SanhSu(maHang, tenHang, soLuongTon, donGia, nhaSanXuat, LocalDate.parse(ngayNhapKho)));
                    
                    
                    } else {
                    	System.out.println("Loại hàng hóa không hợp lệ");
                    	
                    }
                    break;
                case 4:
					System.out.print("Nhập mã hàng cần xóa: ");
					String maHangXoa = sc.nextLine();
					qlhh.xoaHangHoa(maHangXoa);
					break;
				case 5:
					qlhh.sapXepTheoTen();
					qlhh.inDSHangHoa();
					break;
				case 6:
					qlhh.sapXepTheoSoLuongTon();
					qlhh.inDSHangHoa();
					break;
				case 7:
					System.out.println("Kết thúc chương trình");
					System.exit(0);
					break;
					default:
						System.out.println("Chức năng không hợp lệ");
						break;
						
						
			}
			
		}
		

	}

}
