package giaoDichNhaDat;

import java.time.LocalDate;

public class GiaoDichNhaDat extends GiaoDich {

	
	public GiaoDichNhaDat(String ma, LocalDate ngayGiaoDich, double donGia, double dienTich) throws Exception {
		super(ma, ngayGiaoDich, donGia, dienTich);
		// TODO Auto-generated constructor stub
	}

	private String LoaiDat;

	
	
	public String getLoaiDat() {
		return LoaiDat;
	}



	public void setLoaiDat(String loaiDat) {
		LoaiDat = loaiDat;
	}


	
	@Override
	public double getThanhTien() {
		if (getLoaiDat() =="A") {
			return getDienTich()*getDonGia()*1.5;
		} else {
			return getDienTich()*getDonGia();
		}
		
	}


	public GiaoDichNhaDat() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichNhaDat(String ma, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiDat)
				throws Exception {
			super(ma, ngayGiaoDich, donGia, dienTich);
			LoaiDat = loaiDat;
		}

	@Override
	public String toString() {
		String s="";
		s+=s.format("|10%||10%|", getLoaiDat() ,getThanhTien() );
		return super.toString();
	}
	
	
	
	
	

}
