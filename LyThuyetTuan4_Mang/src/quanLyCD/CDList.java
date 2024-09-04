package quanLyCD;

public class CDList {
    private CD[] danhSachCD;
    private int soLuong;

    public CDList(int n) {
        danhSachCD = new CD[n];
        soLuong = 0;
    }

    public boolean themCD(CD cd) {
        if (soLuong < danhSachCD.length) {
            danhSachCD[soLuong] = cd;
            soLuong++;
            return true;
        }
        return false;
    }

    public int tinhSoLuongCD() {
        return soLuong;
    }

    public double tinhTongGiaThanh() {
        double tongGiaThanh = 0;
        for (int i = 0; i < soLuong; i++) {
            tongGiaThanh += danhSachCD[i].getGiaThanh();
        }
        return tongGiaThanh;
    }

    public String hienThiDanhSachCD() {
        StringBuilder danhSach = new StringBuilder();
        for (int i = 0; i < soLuong; i++) {
            danhSach.append(danhSachCD[i].toString()).append("\n");
        }
        return danhSach.toString();
    }

    public CD timCDTheoMa(int maCD) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSachCD[i].getMaCD() == maCD) {
                return danhSachCD[i];
            }
        }
        return null;
    }

    public void sapXepGiamTheoGiaThanh() {
        for (int i = 0; i < soLuong - 1; i++) {
            for (int j = i + 1; j < soLuong; j++) {
                if (danhSachCD[i].getGiaThanh() < danhSachCD[j].getGiaThanh()) {
                    CD temp = danhSachCD[i];
                    danhSachCD[i] = danhSachCD[j];
                    danhSachCD[j] = temp;
                }
            }
        }
    }

    public void sapXepTangTheoTuaCD() {
        for (int i = 0; i < soLuong - 1; i++) {
            for (int j = i + 1; j < soLuong; j++) {
                if (danhSachCD[i].getTuaCD().compareTo(danhSachCD[j].getTuaCD()) > 0) {
                    CD temp = danhSachCD[i];
                    danhSachCD[i] = danhSachCD[j];
                    danhSachCD[j] = temp;
                }
            }
        }
    }
}

