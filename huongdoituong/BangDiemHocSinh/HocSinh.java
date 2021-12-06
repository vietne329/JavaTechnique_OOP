package self_study.huongdoituong.BangDiemHocSinh;

public class HocSinh implements Comparable<HocSinh>{
    private String ma,ten,xeploai;
    private float dtb;

    public HocSinh(int id, String ten, float toan, float tiengviet,float ngoaingu,float vatly,float hoa,float sinh,float lichsu,float dia,float gdcd,float congnghe){
        this.ma = "HS"+String.format("%02d",id);
        this.ten = ten;
        this.dtb = (toan*2 + tiengviet*2 + ngoaingu + vatly + hoa + sinh + lichsu + dia + gdcd + congnghe)/12;
        if(dtb >= 9){
            this.xeploai = "XUAT SAC";
        }
        if(dtb>= 8 && dtb < 9){
            this.xeploai = "GIOI";
        }
        if(dtb >= 7 && dtb < 8){
            this.xeploai = "KHA";
        }
        if(5<= dtb && dtb < 7){
            this.xeploai = "TB";
        }
        if(dtb <  5){
            this.xeploai = "YEU";
        }
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getXeploai() {
        return xeploai;
    }

    public void setXeploai(String xeploai) {
        this.xeploai = xeploai;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+String.format("%.1f",dtb)+" "+xeploai;
    }

    @Override
    public int compareTo(HocSinh o) {
        if(this.dtb < o.dtb){
            return 1 ;

        } else if(this.dtb >o.dtb){
            return -1 ;
        }else{
            return  this.ma.compareTo(o.ma) ;
        }
    }
}
