package quanlyphonghoc;

public class PhongLyThuyet extends PhongHoc {
    private boolean coMayChieu;

    public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.coMayChieu = coMayChieu;
    }

    // Getter và Setter cho thuộc tính coMayChieu

    public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}

	// Override phương thức kiểm tra chuẩn đoán của phòng lý thuyết
    @Override
    public boolean datChuan() {
        return duAnhSang() && coMayChieu;
    }

    public boolean isCoMayChieu() {
        return coMayChieu;
    }

	@Override
	public String toString() {
		return "PhongLyThuyet ["+super.toString()+", coMayChieu=" + coMayChieu + "]";
	}
    
	
	
    
}
