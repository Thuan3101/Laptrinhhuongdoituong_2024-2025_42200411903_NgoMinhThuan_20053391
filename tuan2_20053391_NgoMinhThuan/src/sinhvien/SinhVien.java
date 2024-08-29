package sinhvien;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private double diemLT;
	private double diemTH;
	private double diemTB;
	
	public SinhVien (){
		this.maSV = 0;
		this.hoTen = "Chưa xác định";
		this.diemLT = 0.0;
		this.diemTH = 0.0;
		this.diemTB = 0.0;
	}

	public SinhVien(int maSV, String hoTen, double diemLT, double diemTH) {
		setMaSV  (maSV);
		setHoTen  (hoTen);
		setDiemLT(diemLT);
		setDiemTH (diemTH);
		getDiemTB();
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		if(maSV >0) {
			this.maSV = maSV;
	}else {
			this.maSV = 0 ;
		}
	}
	
	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		if (!hoTen.isEmpty()) {
			this.hoTen = hoTen;
		}else {
			this.hoTen = "Chưa xác định";
		}
	}

	public double getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(double diemLT) {
		if(diemLT >=0.0 && diemLT <=10) {
			this.diemLT = diemLT;
		}else {
			this.diemLT =0.0;
		}
	}

	public double getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(double diemTH) {
		if(diemTH >=0.0 && diemTH <=10) {
			this.diemTH = diemTH;
		}else {
			this.diemTH =0.0;
		}
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = (diemLT+diemTH) /2;
	}

	@Override
	public String toString() {
		return "maSV "+"\t" + hoTen + "\t" + diemLT + "\t" + diemTH + "\t" + diemTB
				;
	}

	
	
	

}
