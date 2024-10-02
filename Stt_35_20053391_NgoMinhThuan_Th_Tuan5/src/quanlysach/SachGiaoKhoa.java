package quanlysach;

public class SachGiaoKhoa extends Sach {
	private boolean tinhTrang;

	/**
	 * 
	 */
	public SachGiaoKhoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param maSach
	 * @param ngayNhap
	 * @param donGia
	 * @param soLuong
	 * @param nhaXuatBan
	 */
	public SachGiaoKhoa(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, boolean tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		// TODO Auto-generated constructor stub
		this.tinhTrang= tinhTrang;
	}
	
	
	
	

}
