package giaoDichNhaDat;

import java.time.LocalDate;

public abstract class GiaoDich {
	public abstract double getThanhTien();
	
	protected String maGiaoDich;
	protected LocalDate ngayGiaoDich;
	protected double  donGia;
	protected double dienTich;
	
	
	public String getMaGiaoDich() {
		return maGiaoDich;
	}
	public void setMaGiaoDich(String ma) throws Exception {
		if (ma!= null) {
			this.maGiaoDich = ma;
		} else {
			throw new Exception("Loi ma");
		}
		
	}
	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}
	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	
	public GiaoDich() throws Exception {
		this("", LocalDate.now(),0,0);
	}
	public GiaoDich(String ma, LocalDate ngayGiaoDich, double donGia, double dienTich) throws Exception {
		if (ma!= null) {
			this.maGiaoDich = ma;
		} else {
			throw new Exception("Loi ma");
		}
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	@Override
	public String toString() {
		String s="";
		s+=s.format("|10%||10%||10%||10%||10%|", getMaGiaoDich(),getThanhTien(),getDienTich(),getDonGia());
		return s;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
