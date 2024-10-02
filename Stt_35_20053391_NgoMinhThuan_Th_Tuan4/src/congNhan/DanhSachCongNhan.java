package congNhan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DanhSachCongNhan {
	private List<CongNhan> danhSach;
	private int maxSize;
	
	public DanhSachCongNhan(int maxSize) {
        this.maxSize = maxSize;
        this.danhSach = new ArrayList<>();
	}
		
	public boolean them(CongNhan cn) {
		if (danhSach.size() >= maxSize) {
			danhSach.add(cn);
			return true;
		}
			return false;
		}
	public void xuatThongTin() {
		for (CongNhan cn : danhSach) {
            System.out.println(cn);
        }
    }
	//Tinh so luong
	public int soLuongCongNhan() {
		return danhSach.size();
	}
	
	// xuât danh sách công nhân có số sản phẩm trên 200
	
	public void xuatDanhSachCongNhan200SP() {
		for (CongNhan cn : danhSach) {
			if (cn.getmSoSP() > 200)
				System.out.println(cn);
		}
	}
	
	// Sắp xếp danh sách công nhân theo số sản phẩm giảm dần
	public void sapXepCongNhan() {
		danhSach.sort(Comparator.comparing(CongNhan::getmSoSP).reversed());
	}
}
