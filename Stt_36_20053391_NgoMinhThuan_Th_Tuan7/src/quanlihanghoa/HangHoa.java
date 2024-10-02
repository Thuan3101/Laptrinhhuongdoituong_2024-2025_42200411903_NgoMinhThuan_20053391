package quanlihanghoa;

import java.text.DecimalFormat;

public abstract class HangHoa {
	protected final String maHang;
	protected String tenHang;
	protected int soLuongTon;
	protected double donGia;
	
	
	public HangHoa(String maHang) {
		
		this(maHang, "xxx", 0, 0);
		
	}


	public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia) {
		if (maHang == null || maHang.trim().length() == 0)
			throw new IllegalArgumentException("Mã hàng không được để trống");
		this.maHang = maHang;
		setTenHang(tenHang);
		setSoLuongTon(soLuongTon);
		setDonGia(donGia);
		
	}


	public String getTenHang() {
		return tenHang;
	}


	public void setTenHang(String tenHang) {
		if(tenHang == null || tenHang.trim().length() == 0)
            throw new IllegalArgumentException("Tên hàng không được để trống");
		this.tenHang = tenHang;
	}


	public int getSoLuongTon() {
		return soLuongTon;
	}


	public void setSoLuongTon(int soLuongTon) {
		if(soLuongTon < 0)
            throw new IllegalArgumentException("Số lượng tồn không được nhỏ hơn 0");
		this.soLuongTon = soLuongTon;
	}


	public double getDonGia() {
		return donGia;
	}


	public void setDonGia(double donGia) {
		if(donGia < 0)
            throw new IllegalArgumentException("Đơn giá lon hon 0");
		this.donGia = donGia;
	}


	public String getMaHang() {
		return maHang;
	}

	
	public abstract double getTienVAt();
	public abstract String danhGia();


	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.#");
		return String.format("%-10s %-20s %10s %20s %20s %20s", maHang, tenHang, soLuongTon, df.format(donGia), df.format(getTienVAt()), danhGia());
	}
	
	
	
	


	
	
	
	

}
