package cd;

public class CD {
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private Double giaThanh;
	
	public CD() {
		super();
		// TODO Auto-generated constructor stub
		this.maCD =  999999;
		this.tuaCD = "Chưa xác định";
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}

	public CD(int maCD, String tuaCD, int soBaiHat, Double giaThanh) {
		super();
		this.maCD =  maCD;
		this.tuaCD = tuaCD;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}

	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		if (maCD >0) {
			this.maCD = maCD;
		}
	}

	public String getTuaCD() {
		return tuaCD;
	}

	public void setTuaCD(String tuaCD) {
		if(tuaCD.isEmpty()) {
		this.tuaCD = tuaCD;
		}
	}

	public int getSoBaiHat() {
		return soBaiHat;
	}

	public void setSoBaiHat(int soBaiHat) {
		if(soBaiHat >0) {
		this.soBaiHat = soBaiHat;
		}
	}

	public Double getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(Double giaThanh) {
		if(giaThanh>0) {
		this.giaThanh = giaThanh;
		}
		
	}

	@Override
	public String toString() {
		return "Ma CD: " + this.maCD + ". Tua CD: " + this.tuaCD + ". So bai hat: " + this.soBaiHat + ". Gia thanh: " + this.giaThanh;
	}
	
	
	
	
	

}
