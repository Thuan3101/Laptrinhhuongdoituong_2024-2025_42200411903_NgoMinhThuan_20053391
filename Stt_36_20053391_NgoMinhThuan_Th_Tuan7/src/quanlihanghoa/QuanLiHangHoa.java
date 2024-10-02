package quanlihanghoa;

public class QuanLiHangHoa {
	private HangHoa[] dsHangHoa;
	private int soLuongHangHoa;
	
	public QuanLiHangHoa(int n) {
		if (n <= 0)
			throw new IllegalArgumentException("Số lượng hàng hóa phải lớn hơn 0");
		dsHangHoa = new HangHoa[n];
		soLuongHangHoa = 0;
	}
	
	//in danh sach hang hoa
	public void inDSHangHoa() {
		for (int i = 0; i < soLuongHangHoa; i++) {
			System.out.println(dsHangHoa[i]);
		}
	}
	
	//in danh sach hang hoa theo loai
	public void inDSHangHoaTheoLoai(String loai) {
		for (int i = 0; i < soLuongHangHoa; i++) {
			if (dsHangHoa[i].getClass().getSimpleName().equals(loai)) {
				System.out.println(dsHangHoa[i]);
			}
		}
	}
	
	// them hang hoa vao danh sach
	public boolean themHangHoa(HangHoa hh) {
		if (soLuongHangHoa == dsHangHoa.length)
			return false;
		dsHangHoa[soLuongHangHoa++] = hh;
		return true;
	}
	
	// xoa hang hoa theo ma hang
	public void xoaHangHoa(String maHang) {
		for (int i = 0; i < soLuongHangHoa; i++) {
			if (dsHangHoa[i].getMaHang().equals(maHang)) {
				for (int j = i; j < soLuongHangHoa - 1; j++)
					dsHangHoa[j] = dsHangHoa[j + 1];
				soLuongHangHoa--;
				break;
			}
		}
	}
	
	// sap xep hang hoa theo ten hang
	public void sapXepTheoTen() {
		for (int i = 0; i < soLuongHangHoa - 1; i++) {
			for (int j = soLuongHangHoa - 1; j > i; j--) {
				if (dsHangHoa[j].getTenHang().compareTo(dsHangHoa[j - 1].getTenHang()) < 0) {
					HangHoa temp = dsHangHoa[j];
					dsHangHoa[j] = dsHangHoa[j - 1];
					dsHangHoa[j - 1] = temp;
				}
			}
		}
	}
	
	//sap  xep hang hoa theo so luong ton giam dan
	public void sapXepTheoSoLuongTon() {
		for (int i = 0; i < soLuongHangHoa - 1; i++) {
			for (int j = soLuongHangHoa - 1; j > i; j--) {
				if (dsHangHoa[j].getSoLuongTon() > dsHangHoa[j - 1].getSoLuongTon()) {
					HangHoa temp = dsHangHoa[j];
					dsHangHoa[j] = dsHangHoa[j - 1];
					dsHangHoa[j - 1] = temp;
				}
			}
		}
	}
	
	//xuat cac hang thuc pham kho ban
	public void inHangThucPhamKhoBan() {
		for (int i = 0; i < soLuongHangHoa; i++) {
			if (dsHangHoa[i] instanceof ThucPham && dsHangHoa[i].getSoLuongTon() < 10) {
				System.out.println(dsHangHoa[i]);
			}
		}
	}

}
