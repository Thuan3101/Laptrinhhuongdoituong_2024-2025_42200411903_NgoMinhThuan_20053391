package quanlysach;

public class Sach {
	protected String maSach;
	protected String ngayNhap;
	protected double donGia;
	protected int soLuong;
	protected String nhaXuatBan;
	/**
	 * 
	 */
	public Sach() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Sach(String maSach, String ngayNhap,double donGia, int soLuong, String nhaXuatBan) {
		super();
		// TODO Auto-generated constructor stub
		this.maSach= maSach;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXuatBan = nhaXuatBan;
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public String getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	
	
	@Override
	public String toString() {
		return "Mã sách: " +this.maSach +
				", Ngày nhập: " +this.ngayNhap +
				", Đơn giá: " +this.donGia +
				", Số lượng: " +this.soLuong+
				", Nhà xuất bản:"+ this.nhaXuatBan;
	}
	
}
