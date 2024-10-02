package giaodichnhadat;

public class GiaoDichDat extends GiaoDich{
	
	private LoaiDat LoaiDat;
	
	/**
	 * @param maGiaoDich
	 * @param ngayGiaoDich
	 * @param donGia
	 * @param dienTich
	 */
	public GiaoDichDat(String maGiaoDich, String ngayGiaoDich, long donGia, float dienTich,LoaiDat LoaiDat) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		// TODO Auto-generated constructor stub
		this.LoaiDat = LoaiDat;
	}

	public LoaiDat getLoaiDat() {
		return LoaiDat;
	}

	public void setLoaiDat(LoaiDat loaiDat) {
		LoaiDat = loaiDat;
	}

	@Override
	public String toString() {
		return super.toString()+ ", loại đất: " +this.LoaiDat;
	}
	
}
