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
		// Tính đóng gói: phương thức setter để gán giá trị cho biến `chieuDai`.
		this.chieuDai = chieuDai; 
	}
	
	public double getChieiRong() {
		// Tính đóng gói: phương thức getter để truy cập biến `chieiRong`.
		return chieiRong; 
	}
	
	public void setChieiRong(double chieiRong) { 
		// Tính đóng gói: phương thức setter để gán giá trị cho biến `chieiRong`.
		this.chieiRong = chieiRong; 
	}
	
	public HinhChuNhat(String tenHinh, double d, double r) { 
		// Tính thừa kế: gọi constructor của lớp cha `HinhHoc` để khởi tạo thuộc tính `tenHinh`.
		super(tenHinh); 
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
