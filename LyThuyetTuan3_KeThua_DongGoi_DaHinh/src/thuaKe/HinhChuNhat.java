package thuaKe;
//Tính thừa kế: Lớp `HinhChuNhat` kế thừa từ lớp `HinhHoc`.
public class HinhChuNhat extends HinhHoc { 
	// Tính đóng gói: thuộc tính `chieuDai` được khai báo là `private`.
	private double chieuDai; 
	// Tính đóng gói: thuộc tính `chieiRong` được khai báo là `private`.
	private double chieiRong; 
	
	public double getChieuDai() { 
		 // Tính đóng gói: phương thức getter để truy cập biến `chieuDai`.
		return chieuDai;
	}
	
	public void setChieuDai(double chieuDai) {
		if (chieuDai <= 0) { // Ràng buộc điều kiện: Chiều dài phải lớn hơn 0.
			throw new IllegalArgumentException("Chiều dài phải lớn hơn 0.");
		}
		this.chieuDai = chieuDai;
	}
	
	public double getChieiRong() {
		// Tính đóng gói: phương thức getter để truy cập biến `chieiRong`.
		return chieiRong; 
	}
	
	public void setChieiRong(double chieiRong) {
		if (chieiRong <= 0) { // Ràng buộc điều kiện: Chiều rộng phải lớn hơn 0.
			throw new IllegalArgumentException("Chiều rộng phải lớn hơn 0.");
		}
		this.chieiRong = chieiRong;
	}
	
	public HinhChuNhat(String tenHinh, double d, double r) {
		super(tenHinh);
		if (d <= 0 || r <= 0) { // Ràng buộc điều kiện: Chiều dài và chiều rộng phải lớn hơn 0.
			throw new IllegalArgumentException("Chiều dài và chiều rộng phải lớn hơn 0.");
		}
		this.chieuDai = d;
		this.chieiRong = r;
	}
	
	@Override
	// Tính đa hình: Ghi đè phương thức `getDienTich()` từ lớp `HinhHoc`.
	public double getDienTich() { 
		// Tính đa hình: Phương thức này thể hiện cách tính diện tích riêng của `HinhChuNhat`.
		return (getChieuDai() * getChieiRong()); 
	}
}
