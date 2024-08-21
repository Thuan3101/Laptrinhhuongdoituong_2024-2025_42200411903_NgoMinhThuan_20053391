package thuaKe;

public class Test {
	public static void main(String[] args) {
		//Khơi tạo đối tượng h1 có kiểu dữ liệu là HinhHoc
		HinhHoc h1 = new HinhVuong("Hinh vuong", 10);
		System.out.println("Dien tich hinh vuong: " + h1.getDienTich());
		//Khơi tạo đối tượng h2 có kiểu dữ liệu là HinhHoc
		HinhHoc h2 = new HinhChuNhat("Hinh chu nhat", 20, 10);
		//Tính đa hình
		//h1,h2 có cùng kiểu dữ liệu là HinhHoc nhưng thể hiện khác nhau
		System.out.println("Dien tich hinh chu nhat: " + h2.getDienTich());
		
	}

}
