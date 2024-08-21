package thuaKe;

// Tính trừu tượng: lớp HinhHoc là lớp trừu tượng, không thể tạo đối tượng trực tiếp từ lớp này.
public abstract class HinhHoc { 
	// Tính đóng gói: biến `tenHinh` được khai báo là `protected`, chỉ có thể truy cập từ các lớp con hoặc lớp trong cùng package.

	protected String tenHinh; 
	
	public String getTenHinh() {
		// Tính đóng gói: phương thức getter để truy cập biến `tenHinh`.
		return tenHinh; 
	}

	public void setTenHinh(String tenHinh) {
		// Tính đóng gói: phương thức setter để gán giá trị cho biến `tenHinh`.
		this.tenHinh = tenHinh; 
	}
	// Tính trừu tượng và đa hình: phương thức trừu tượng `getDienTich()` buộc các lớp con phải triển khai, mỗi lớp con có thể có cách tính diện tích khác nhau.
	public abstract double getDienTich(); 

	 // Tính đóng gói: Constructor mặc định.
	public HinhHoc() {}
	 // Tính đóng gói: Constructor có tham số.
	public HinhHoc(String tenHinh2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	// Tính đa hình: Phương thức `toString()` được ghi đè từ lớp `Object` để cung cấp cách hiển thị thông tin riêng cho lớp `HinhHoc`.
	public String toString() { 
		return super.toString();
	}
}
