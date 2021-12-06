package self_study.huongdoituong.DiemDanh1;

public class SinhVien {
    private String ma,hoten,lop,diemdanh;
    private int diem;

    public SinhVien(String ma, String hoten, String lop) {
        this.ma = ma;
        this.hoten = hoten;
        this.lop = lop;
    }

    public void setDiemdanh(String diemdanh) {
        this.diemdanh = diemdanh;
    }

    public String getMa() {
        return ma;
    }

    public int tinhdiemChuyenCan(){

        int diemcc = 10;

        for(int i =0 ; i < this.diemdanh.length();i++){
            if(diemdanh.charAt(i) == 'm'){
                diemcc = diemcc-1;
            }
            if(diemdanh.charAt(i) == 'v'){
                diemcc = diemcc-2;
            }
        }

        this.diem = diemcc;

        if(diem <= 0){
            this.diem =0;
        }

        return diem;
    }

    public String getGhiChu(){
        if(this.diem <= 0){
            return " KDDK";
        }
        return "";
    }



    @Override
    public String toString() {
        return ma+" "+hoten+" "+lop+" "+tinhdiemChuyenCan()+""+getGhiChu();
    }
}
