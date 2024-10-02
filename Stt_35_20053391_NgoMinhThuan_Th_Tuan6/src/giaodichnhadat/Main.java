package giaodichnhadat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		GiaoDichDat d=new GiaoDichDat("311", "29/09/2023", 100, 100, LoaiDat.B);
		System.out.println(d);
		GiaoDichNha n=new GiaoDichNha("141", "28/09/2023" , 300,300, LoaiNha.CaoCap,"2276/2/10 Quốc lộ 1A");
		System.out.println(n);
	}

}
