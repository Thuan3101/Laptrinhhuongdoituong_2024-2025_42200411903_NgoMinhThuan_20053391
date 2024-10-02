package giaodichnhadat;

public class GiaoDichNha extends GiaoDich {
	
	private LoaiNha LoaiNha;
	private String diaChi;
	/**
	 * 
	 */
	public GiaoDichNha() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param maGiaoDich
	 * @param ngayGiaoDich
	 * @param donGia
	 * @param dienTich
	 */
	public GiaoDichNha(String maGiaoDich, String ngayGiaoDich, long donGia, float dienTich, LoaiNha LoaiNha,String diaChi) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		// TODO Auto-generated constructor stub
		this.LoaiNha =LoaiNha;
		this.diaChi =diaChi;
	}

	public LoaiNha getLoaiNha() {
		return LoaiNha;
	}

	public void setLoaiNha(LoaiNha loaiNha) {
		LoaiNha = loaiNha;
	}
	
	
	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		if(LoaiNha == LoaiNha.CaoCap)
			return super.toString()+ ", loại nhà: Cao Cấp: " +", địa chỉ: " +this.diaChi;
		else
			return super.toString()+ ", loại nhà: thường" + ", địa chỉ:"+this.diaChi;
	}


	
	
	
	
}
