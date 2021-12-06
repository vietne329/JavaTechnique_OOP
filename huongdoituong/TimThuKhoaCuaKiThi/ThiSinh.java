package self_study.huongdoituong.TimThuKhoaCuaKiThi;

public class ThiSinh implements Comparable<ThiSinh>{
    private String ten,ngaysinh;
    private int ma;
    private float diem1,diem2,diem3;

    public ThiSinh(int ma, String ten, String ngaysinh, float diem1, float diem2, float diem3) {
        this.ma = ma;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public float getTongDiem(){
        return diem1+diem2+diem3;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+ngaysinh+" "+String.format("%.1f",getTongDiem());
    }

    @Override
    public int compareTo(ThiSinh o) {
        return this.ma - o.ma;
    }
}
