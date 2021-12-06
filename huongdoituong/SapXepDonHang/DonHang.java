package self_study.huongdoituong.SapXepDonHang;

public class DonHang implements Comparable<DonHang>{
    private String ten,madonhang;
    private int soluong;
    private float dongia;

    public DonHang(String ten, String madonhang, float dongia ,int soluong) {
        this.ten = ten;
        this.madonhang = madonhang;
        this.dongia = dongia;
        this.soluong = soluong;
    }

    public String getStt(){
        String stt = this.madonhang.trim();
        stt = stt.substring(1,4);
        return stt;
    }

    public float giamGia(){
        int maloai = Integer.parseInt(this.madonhang.substring(4));
        if(maloai==1){
            return (float)((dongia*soluong)/2);
        }
        else{
            return (float)((dongia*soluong)*0.3);
        }
    }

    public float thanhtien(){
        return soluong*dongia - giamGia();
    }

    public String getMaDonHang(){
        String madonhang = this.madonhang;
        return madonhang.substring(1);
    }

    @Override
    public String toString() {
        return ten+" "+madonhang+" "+getStt()+" "+String.format("%.0f",giamGia())+" "+String.format("%.0f",thanhtien());
    }

    @Override
    public int compareTo(DonHang o) {
        return this.getMaDonHang().compareTo(o.getMaDonHang());
    }
}
