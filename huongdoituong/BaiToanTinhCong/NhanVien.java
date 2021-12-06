package self_study.huongdoituong.BaiToanTinhCong;

public class NhanVien {
    private String manv,hoten,chucvu;
    private float luongcoban;
    private int ngaycong;

    public NhanVien(String hoten, float luongcoban, int ngaycong, String chucvu) {
        this.manv = "NV01";
        this.hoten = hoten;
        this.luongcoban = luongcoban;
        this.ngaycong = ngaycong;
        this.chucvu = chucvu;
    }

    public float getLuong(){
        return (float)luongcoban*ngaycong;
    }

    public float getTienThuong(){
        if(this.ngaycong >=22 && this.ngaycong < 25){
            return (float) (getLuong()*0.1);
        }
        else if(this.ngaycong >=25){
            return (float) (getLuong()*0.2);
        }else{
            return 0;
        }
    }

    public float getPhuCap(){
        if(this.chucvu.equals("GD")){
            return 250000;
        }
        else if(this.chucvu.equals("PGD")){
            return 200000;
        }
        else if(this.chucvu.equals("TP")){
            return 180000;
        }else {
            return 150000;
        }
    }

    @Override
    public String toString() {
        return manv+" "+hoten+" "+String.format("%.0f",getLuong())+" "+String.format("%.0f",getTienThuong())+" "+String.format("%.0f",getPhuCap())+" "+
                String.format("%.0f",getTienThuong()+getLuong()+getPhuCap());
    }
}
