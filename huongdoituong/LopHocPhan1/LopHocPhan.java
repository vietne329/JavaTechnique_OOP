package self_study.huongdoituong.LopHocPhan1;

public class LopHocPhan implements Comparable<LopHocPhan>{
    private String ma,ten,nhom,giangvien;

    public LopHocPhan(String ma, String ten, String nhom, String giangvien) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.giangvien = giangvien;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return nhom+" "+giangvien;
    }

    @Override
    public int compareTo(LopHocPhan o) {
        return this.nhom.compareTo(o.nhom);
    }
}
