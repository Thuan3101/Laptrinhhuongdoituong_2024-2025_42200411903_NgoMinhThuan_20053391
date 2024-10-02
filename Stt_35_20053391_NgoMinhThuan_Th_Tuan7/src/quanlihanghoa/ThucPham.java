package quanlihanghoa;

import java.time.LocalDate;

public class ThucPham extends HangHoa {
	
	
	
	private String nhaCungCap;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	
	
	
	public ThucPham(String maHang) {
		super(maHang);
		this.nhaCungCap = "";
		this.ngaySanXuat = LocalDate.now();
		this.ngayHetHan = ngaySanXuat;
	}
	
	
	
	
	public ThucPham(String maHang, String tenHang, int soLuongTon, double donGia, String nhaCungCap,
			LocalDate ngaySanXuat, LocalDate ngayHetHan) {
		super(maHang, tenHang, soLuongTon, donGia);
		setNhaCungCap ( nhaCungCap);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}
	
	




	public String getNhaCungCap() {
		return nhaCungCap;
	}




	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}




	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}




	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat.isAfter(LocalDate.now()))
			throw new IllegalArgumentException("Ngày sản xuất không được sau ngày hiện tại");
		this.ngaySanXuat = ngaySanXuat;
	}




	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}




	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan.isBefore(ngaySanXuat))
			throw new IllegalArgumentException("Ngày hết hạn không được trước ngày sản xuất");
		this.ngayHetHan = ngayHetHan;
	}




	@Override
	public double getTienVAt() {
		// TODO Auto-generated method stub
		return donGia * 0.05;
	}
	@Override
	public String danhGia() {
		// TODO Auto-generated method stub
		LocalDate now = LocalDate.now();
		
		return (soLuongTon >0 && ngayHetHan.isBefore(now)) ? "Kho ban" : "";
	}
	
	
	

}
