package quanlyphonghoc;

public class PhongThiNghiem extends PhongHoc {
    private String chuyenNganh;
    private int sucChua;
    private boolean coBonRua;

    public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua, boolean coBonRua) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.coBonRua = coBonRua;
    }

    // Getter và Setter cho các thuộc tính

    public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}

	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}

	// Override phương thức kiểm tra chuẩn đoán của phòng thí nghiệm
    @Override
    public boolean datChuan() {
        return duAnhSang() && coBonRua;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public boolean isCoBonRua() {
        return coBonRua;
    }

	@Override
	public String toString() {
		return "PhongThiNghiem [" + super.toString() +", chuyenNganh=" + chuyenNganh + ", sucChua=" + sucChua + ", coBonRua=" + coBonRua + "]";
	}
    
    
}