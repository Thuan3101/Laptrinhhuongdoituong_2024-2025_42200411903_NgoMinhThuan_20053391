package thuaKe;

// Tính thừa kế: Lớp `HinhVuong` kế thừa từ lớp `HinhHoc`.
public class HinhVuong extends HinhHoc {
	// Tính đóng gói: thuộc tính `canh` được khai báo là `private`.
	private double canh;

	public double getCanh() {
		// Tính đóng gói: phương thức getter để truy cập biến `canh`.
		return canh;
	}

	public void setCanh(double canh) {
		// Ràng buộc điều kiện: Cạnh phải lớn hơn 0.
		if (canh <= 0) {
			throw new IllegalArgumentException("Cạnh của hình vuông phải lớn hơn 0.");
		}
		// Tính đóng gói: phương thức setter để gán giá trị cho biến `canh`.
		this.canh = canh;
	}

	public HinhVuong() {
		// Constructor mặc định
	}

	public HinhVuong(String tenHinh) {
		// Tính thừa kế: gọi constructor của lớp cha `HinhHoc` để khởi tạo thuộc tính `tenHinh`.
		super(tenHinh);
	}

	public HinhVuong(String tenHinh, double canh) {
		// Tính thừa kế: gọi constructor của lớp cha `HinhHoc`.
		super(tenHinh);
		// Ràng buộc điều kiện: Cạnh phải lớn hơn 0.
		if (canh <= 0) {
			throw new IllegalArgumentException("Cạnh của hình vuông phải lớn hơn 0.");
		}
		this.canh = canh;
	}

	@Override
	public double getDienTich() {
		// Tính đa hình: Ghi đè phương thức `getDienTich()` từ lớp `HinhHoc`.
		// Tính đa hình: Phương thức này thể hiện cách tính diện tích riêng của `HinhVuong`.
		return getCanh() * getCanh();
	}
}
