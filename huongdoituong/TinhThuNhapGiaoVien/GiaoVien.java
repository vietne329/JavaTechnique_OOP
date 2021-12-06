package self_study.huongdoituong.TinhThuNhapGiaoVien;

public class GiaoVien {
    private String ma, ten;
    private int heso;
    private float phucap, luongcoban, thunhap;

    public GiaoVien(String ma, String ten, float luongcoban) {
        this.ma = ma;
        this.heso = Integer.parseInt(ma.substring(2));
        this.ten = ten;
        String cv = ma.substring(0,2);
        if(cv.equalsIgnoreCase("HT")){
            this.phucap = 2000000;
        }
        if(cv.equalsIgnoreCase("HP")){
            this.phucap = 900000;
        }
        if(cv.equalsIgnoreCase("GV")){
            this.phucap = 500000;
        }

        this.thunhap = luongcoban*heso+phucap;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+heso+" "+String.format("%.0f",phucap)+" "+String.format("%.0f",thunhap);
    }
}
