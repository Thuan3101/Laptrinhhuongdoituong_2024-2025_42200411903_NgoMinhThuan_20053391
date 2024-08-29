package ngoMinhThuan_HinhTron;

public class HinhTron {
	
	private double banKinh;
	private static final double PI=3.14;
	private Tam t;
	
	public Tam getT() {
		return t;
	}
	public void setT(Tam t) throws Exception {
		if (t != null) {
			this.t = t;
				
			
		} else {
			throw new Exception("loi");

		}
		this.t = t;
	}
	
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(Double banKinh) throws Exception {
		if (banKinh > 0) {
			this.banKinh = banKinh;
		} else {
			throw new Exception("loi");
		}
	}
	
	public HinhTron() {}
	public HinhTron(double banKinh, Tam t) {
		
		this.banKinh = banKinh;
		this.t = t;
	}
	public Double getChuVi() {
		return getBanKinh()*2*PI;
	}
	public Double getDienTich(){
		return getBanKinh()*getBanKinh()*PI;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String m ="";
		m+=m.format("%-3s, %10s, %10s, ", "Ban kinh hinh tron: " +getBanKinh() ,"Chu vi hinh tron: " +getChuVi() ,"Dien tich hinh tron "+getDienTich());
		return m;
	}
	
	

}
