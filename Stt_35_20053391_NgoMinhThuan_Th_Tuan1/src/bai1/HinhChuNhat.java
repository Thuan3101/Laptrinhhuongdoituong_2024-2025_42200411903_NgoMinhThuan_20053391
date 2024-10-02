package bai1;

public class HinhChuNhat {
	private double chieuDai;
	private double chieiRong;
	
	

	
	public double getChieuDai() {
		return chieuDai;
	}


	public void setChieuDai(double d) {
		if(d>0) {
			this.chieuDai= d;
		}else {
			
		System.out.println("loi d");
	
		}
	}

	public double getChieiRong() {
		return chieiRong;
	}


	public void setChieiRong(double r) {
		if(r<=0) {
			System.out.println("loi r");
			
		}else {
			
			this.chieiRong= r;
	
		}
	}
	public HinhChuNhat() {}
	public HinhChuNhat(Double d, Double r) {	
		if(d>0) {
			this.chieuDai= d;
		}else {
			
		System.out.println("loi d");
	
		}
		if(r<=0) {
			System.out.println("loi r");
		}else {
			this.chieiRong = r;
		
	
		}
	}
	
	
	public double getCV() {
		return(getChieuDai()+getChieiRong())*2;
	}
	
	public double getdienTich() {
		return(getChieuDai()*getChieiRong());
	}
	@Override
	public String toString() {
		String s="";
		s=s+s.format("|%10s|%10s|%10s|%10s|", getChieuDai(), getChieiRong(), getCV(), getdienTich());
		return s;
	}
	
	
	
	

}
