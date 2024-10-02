package bai1;

public class Test {
	public static void inTD() {
		
		for(int i =0;i< 50;i++) {
			System.out.printf("-");
		}
		
		System.out.println("");
		System.out.printf("|%10s|%10s|%10s|%10s|", "Chieu dai","Chieu rong","Chu vi","Dien tich");
		System.out.println("");
		for(int i =0;i< 50;i++) {
			System.out.printf("-");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhChuNhat h1 = new HinhChuNhat();
		h1.setChieuDai(9);
		h1.setChieiRong(5);
		inTD();
		System.out.println(h1.toString());
		for(int i =0;i< 50;i++) {
			System.out.printf("-");
		}
		//HinhChuNhat h2 = new HinhChuNhat(10, 5);
		
	}

}
