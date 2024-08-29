package sinhvien;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv1 = new SinhVien(20053391, "Ngô Minh Thuận", 8.5, 9.0 );
		
		SinhVien sv2= new SinhVien();
		sv2.setMaSV(20064431);
		sv2.setHoTen("Võ Thị Kiều My");
		sv2.setDiemLT(8.0);
		sv2.setDiemTH(8.0);
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập thông tin sinh viên 3: ");
		System.out.print("Mã sinh viên: ");
		int maSv3 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Họ tên: ");
		String hoTenSv3 =scanner.nextLine();
		System.out.print("Điểm LT: ");
		double diemLTSv3 =scanner.nextDouble();
		System.out.print("Điểm TH: ");
		double diemTHSv3 = scanner.nextDouble();
		
		SinhVien sv3 = new SinhVien(maSv3, hoTenSv3, diemLTSv3, diemTHSv3 );
		
		scanner.close();
		
		System.out.println("Danh sách sinh viên: ");
		System.out.println("MSSV\tHọ tên\tĐiểm LT\tĐiểm TH\tĐiểm TB");
		System.out.println(sv1.toString());
		System.out.println(sv2.toString());
		System.out.println(sv3.toString());
	}
	

}
