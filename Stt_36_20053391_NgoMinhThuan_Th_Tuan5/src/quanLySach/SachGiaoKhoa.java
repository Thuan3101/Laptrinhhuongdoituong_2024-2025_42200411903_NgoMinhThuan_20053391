package quanLySach;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach {
    private boolean tinhTrang;
  
    @Override
	public double getThanhTien() {
		
		if (isTinhTrang() == true) {
            return getSoLuong() * getDonGia();
        } else {
            return getSoLuong() * getDonGia() * 0.5;
			
		} 
	}

	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	public SachGiaoKhoa(String maSach, String nhaXuatBan, LocalDate ngayNhap, double donGia, int soLuong,
			boolean tinhTrang) {
		super(maSach, nhaXuatBan, ngayNhap, donGia, soLuong);
		this.tinhTrang = tinhTrang;
	}
	
	public SachGiaoKhoa() {

	}
	
	public String getTinhTrang() {
		if (isTinhTrang() == true) {
			return "Mới";
		} else {
			return "Cũ";
		}
	}
	
	@Override
	public String toString() {
		String s1 = "";
		s1 += s1.format("%-10s | %-20s ", getTinhTrang(), getThanhTien());
		return s1;
	}

	
	
		
		


	
	

}
