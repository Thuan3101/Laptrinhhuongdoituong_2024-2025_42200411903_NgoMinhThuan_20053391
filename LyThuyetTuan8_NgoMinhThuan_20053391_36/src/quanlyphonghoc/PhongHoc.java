package quanlyphonghoc;

public abstract class PhongHoc {
	protected String maPhong;
    protected String dayNha;
    protected double dienTich;
    protected int soBongDen;

    public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    
    
    public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}

	// Phương thức trừu tượng để kiểm tra chuẩn đoán của phòng học
    public abstract boolean datChuan();
    
    public boolean duAnhSang() {
		return dienTich / 10 <= soBongDen;
	}

    // Các phương thức thông tin chi tiết của phòng học
    public String getMaPhong() {
        return maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public double getDienTich() {
        return dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }



	@Override
	public String toString() {
		return "PhongHoc [maPhong=" + maPhong + ", dayNha=" + dayNha + ", dienTich=" + dienTich + ", soBongDen="
				+ soBongDen + ", datChuan()=" + (datChuan() ? "Dat chuan" : "Khong dat chuan") + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maPhong == null) ? 0 : maPhong.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		PhongHoc other = (PhongHoc) obj;
		if (maPhong == null) {
			if (other.maPhong != null)
				return false;
		} else if (!maPhong.equalsIgnoreCase(other.maPhong))
			return false;
		return true;
	}
	
	
    
    
}
