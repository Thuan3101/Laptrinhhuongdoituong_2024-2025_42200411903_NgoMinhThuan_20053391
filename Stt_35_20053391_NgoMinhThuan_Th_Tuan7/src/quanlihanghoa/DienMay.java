package quanlihanghoa;

public class DienMay extends HangHoa {
	private int thoiGianBaoHanh;
	private double congSuat;
	
	
	public DienMay(String maHang) {
		super(maHang);
		this.thoiGianBaoHanh = 0;
		this.congSuat = 0;
	}
	
	


	public DienMay(String maHang, String tenHang, int soLuongTon, double donGia, int thoiGianBaoHanh, double congSuat) {
		super(maHang, tenHang, soLuongTon, donGia);
		setThoiGianBaoHanh(thoiGianBaoHanh);
		setCongSuat(congSuat);
	}




	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}



	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		if(thoiGianBaoHanh < 0)
            throw new IllegalArgumentException("Thời gian bảo hành không được nhỏ hơn 0");
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}



	public double getCongSuat() {
		return congSuat;
	}



	public void setCongSuat(double congSuat) {
		if(congSuat < 0)
            throw new IllegalArgumentException("Công suất không được nhỏ hơn 0" );
		this.congSuat = congSuat;
	}



	@Override
	public double getTienVAt() {
		// TODO Auto-generated method stub
		return donGia * 0.1;
	}


	@Override
	public String danhGia() {
		// TODO Auto-generated method stub
		return soLuongTon <3? "Ban chay" :"";
	}
	
	

}
