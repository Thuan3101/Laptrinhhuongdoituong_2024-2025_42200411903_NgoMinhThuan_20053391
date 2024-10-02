package congNhan;

public class CongNhan {
	private int maCN;
	private String mHo;
	private String mTen;
	private double mSoSP;
	
	public int getMaCN() {
		return maCN;
	}
	public void setMaCN(int maCN) {
		if(maCN <= 0)
            throw new IllegalArgumentException("Mã công nhân phải lớn hơn 0");
		this.maCN = maCN;
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) {
		if(mHo == null || mHo.trim().equals(""))
            throw new IllegalArgumentException("Họ không được để trong");
		this.mHo = mHo;
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		if(mTen == null || mTen.trim().equals(""))
            throw new IllegalArgumentException("Tên không được để trong)");
		this.mTen = mTen;
	}
	public double getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(int mSoSP) {
		if(mSoSP <= 0)
            throw new IllegalArgumentException("Số sản phẩm phải lớn hơn 0");
		this.mSoSP = mSoSP;
	}
	
	public CongNhan() {
		super();
	}
	
	public CongNhan(int maCN, String mHo, String mTen, Double mSoSP) {
		super();
		this.maCN = maCN;
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
	}
	
	public CongNhan(int maCN, String mHo, String mTen) {
		super();
		this.maCN = 0;
		this.mHo = " ";
		this.mTen = " ";
		this.mSoSP = 0;
	}
	
	public double tinhLuong() {
		/* double luong = 0; */
		if (mSoSP < 199)
			return mSoSP * 0.5;
		else if (mSoSP < 399)
			return mSoSP * 0.55;
		else if (mSoSP < 599)
			return mSoSP * 0.6;
		else
			return mSoSP * 0.65;
	}
	
	// phương thức toString
	@Override
	public String toString() {
		return "Công nhân [Mã công nhân=" + maCN + ", Họ tên=" + mHo + " " + mTen + ", Số sản phẩm=" + mSoSP + ", Lương=" + tinhLuong() + "]";
	}
	
	
	
	
	
}
