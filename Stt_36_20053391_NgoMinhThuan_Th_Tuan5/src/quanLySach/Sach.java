package quanLySach;

import java.time.LocalDate;

public abstract class Sach {
	public abstract double getThanhTien();
	protected String maSach;
	protected String nhaXuatBan;
	protected LocalDate ngayNhap;
	protected double donGia;
	protected int soLuong;
	
	
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	public LocalDate getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(LocalDate ngayNhap) {
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
	
	public Sach(String maSach, String nhaXuatBan, LocalDate ngayNhap, double donGia, int soLuong) {
		super();
		this.maSach = maSach;
		this.nhaXuatBan = nhaXuatBan;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}	
	
	public Sach() {
		
	}
	@Override
	public String toString() {
		String s="";
		s+=s.format("%-10s | %-20s | %-15s | %-10.2f | %-10d |", getMaSach(), getNhaXuatBan(), getNgayNhap(), getDonGia(), getSoLuong());
		return s;
	}
	
	
	
	
	
	
	
	

}
