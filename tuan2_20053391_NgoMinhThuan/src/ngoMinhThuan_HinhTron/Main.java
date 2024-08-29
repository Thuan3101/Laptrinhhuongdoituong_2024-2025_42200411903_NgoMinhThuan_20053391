package ngoMinhThuan_HinhTron;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Tam t = new Tam("N", 10, 20);
		HinhTron h = new HinhTron(15, t);
		System.out.println("Hinh tron tam: " + t.toString()+h.toString());
	}

}
