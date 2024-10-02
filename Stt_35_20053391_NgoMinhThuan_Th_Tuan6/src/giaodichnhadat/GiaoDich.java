package giaodichnhadat;

public class GiaoDich {
	private String maGiaoDich;
	private String ngayGiaoDich;
	private long donGia;
	private float dienTich;
	
	/**
	 * 
	 */
	public GiaoDich() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param maGiaoDich
	 * @param ngayGiaoDich
	 * @param donGia
	 * @param dienTich
	 */
	public GiaoDich(String maGiaoDich, String ngayGiaoDich, long donGia, float dienTich) {
		super();
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}

	public String getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public String getNgayGiaoDich() {
		return ngayGiaoDich;
	}

	public void setNgayGiaoDich(String ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}

	public long getDonGia() {
		return donGia;
	}

	public void setDonGia(long donGia) {
		this.donGia = donGia;
	}

	public float getDienTich() {
		return dienTich;
	}

	public void setDienTich(float dienTich) {
		this.dienTich = dienTich;
	}

	@Override
	public String toString() {
		return "Mã giao dịch: " +this.maGiaoDich +", ngày giao dich: " +this.ngayGiaoDich
				+", đơn giá: " +this.donGia +", diện tích: " +this.dienTich;
	}
	
	
	
	
	
	
		

}
