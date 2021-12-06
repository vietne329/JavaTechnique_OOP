package self_study.huongdoituong.DanhSachMatHang;

public class MatHang implements Comparable<MatHang> {
    private String ma, ten, donvitinh;
    private int giamua, giaban;

    public MatHang(int ma, String ten, String donvitinh, int giamua, int giaban) {
        this.ma = "MH"+String.format("%03d",ma);
        this.ten = ten;
        this.donvitinh = donvitinh;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+donvitinh+" "+giamua+" "+giaban+" "+loinhuan();
    }

    public int loinhuan(){
        return giaban-giamua;
    }

    @Override
    public int compareTo(MatHang o) {
        if(this.loinhuan() == o.loinhuan()){
            return this.ma.compareTo(o.ma);
        }

        return o.loinhuan() - this.loinhuan();
    }
}
