package quanlihanghoa;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;



public class SanhSu extends HangHoa {
	
	

	private String nhaSanXuat;
	private LocalDate ngayNhapKho;
	
	public SanhSu(String maHang) {
		super(maHang);
		this.nhaSanXuat = "xxx";
		this.ngayNhapKho = LocalDate.now();
	}
	
		
	
	public SanhSu(String maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat,
			LocalDate ngayNhapKho) {
		super(maHang, tenHang, soLuongTon, donGia);
		setNhaSanXuat(nhaSanXuat);
		setNgayNhapKho(ngayNhapKho);
	}
	
	



	public String getNhaSanXuat() {
		return nhaSanXuat;
	}



	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}



	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}



	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		if(ngayNhapKho.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("Ngày nhập kho không được sau ngày hiện tại" );
		this.ngayNhapKho = ngayNhapKho;
	}



	@Override
	public double getTienVAt() {
		// TODO Auto-generated method stub
		return donGia * 0.1;
	}

	@Override
	public String danhGia() {
		// TODO Auto-generated method stub
		LocalDate now = LocalDate.now();
		long ngayLuuKho = Math.abs(ChronoUnit.DAYS.between(ngayNhapKho, now));
		return soLuongTon > 50 && ngayLuuKho < 10 ? "Ban cham" : "";
	}
	

}
