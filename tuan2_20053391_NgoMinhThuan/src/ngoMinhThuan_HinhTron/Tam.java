package ngoMinhThuan_HinhTron;

public class Tam {
	private String ten;
	private double x;
	private double y;
	
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) throws Exception {
		if (ten != null) {
			this.ten = ten;
		} else {
			throw new Exception("loi");

		}
		this.ten = ten;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public Tam (){}
	public Tam(String ten, double x, double y) throws Exception {
		
		if (ten != null) {
			this.ten = ten;
		} else {
			throw new Exception("loi");

		}
		this.ten = ten;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		String s="";
		s=s+s.format(" %2s(%2s,%2s) ", getTen() , getX() , getY() );
		return s;
	}
	
	
	/*8
//	public static void main(String[] args) throws Exception {
//		Tam t = new Tam("N", 10, 5);
//		System.out.println("Tam" +t);
//		
	}
	**/
	

}
