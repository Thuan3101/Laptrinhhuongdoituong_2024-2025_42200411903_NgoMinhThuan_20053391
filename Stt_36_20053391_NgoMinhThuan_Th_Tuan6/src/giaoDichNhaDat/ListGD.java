package giaoDichNhaDat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListGD {
	List<GiaoDich> ls;
	public ListGD() {
		ls = new ArrayList<GiaoDich>(2);
	}
	
	public boolean themGD(GiaoDich g ) {
		if (!ls.contains(g)) {
			return false;
		} else {
			return  ls.add(g);

		}
	}
	
	//Xuat
	public List<GiaoDich> getAll(){
		return ls;
	}
	//Tim giao dich
	public GiaoDich tim(String ma) {
		for(GiaoDich giaoDich :ls) {
			if(giaoDich.getMaGiaoDich().equalsIgnoreCase(ma))
				return giaoDich;
		}
		return null;
	}
	
	//Xoa
	public boolean xoaGD(GiaoDich g) {
		if (tim(g.maGiaoDich)!=null) 
			ls.remove(g);
		
			return false;
	}
	
}
