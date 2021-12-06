package self_study.huongdoituong.BangDiemTuyenSinh;

public class ThiSinh {
    private String mathisinh,hoten;
    private float toan,ly,hoa;

    public ThiSinh(String mathisinh, String hoten, float toan, float ly, float hoa) {
        this.mathisinh = mathisinh;
        this.hoten = hoten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public float getDiemUuTien(){
        if(this.mathisinh.substring(0,3).equals("KV1")){
            return 0.5F;
        }
        else if(this.mathisinh.substring(0,3).equals("KV2")){
            return 1.0F;
        }
        else{
            return 2.5F;
        }

    }

    public float getTongDiem(){
        return toan*2+ly+hoa;
    }

    public String ketQua(){
        if(getDiemUuTien()+getTongDiem() >= 24){
            return "TRUNG TUYEN";
        }else{
            return "TRUOT";
        }
    }

    public boolean isInt(float diem){
        String diem_str = String.valueOf(diem);
        for(int i=0; i < diem_str.length();i++){
            if(diem_str.charAt(i) == '.' && diem_str.charAt(i+1) == '0'){
                return true;
            }
        }
        return false;
    }

    public String printDiem(float diem){
        if(isInt(diem)){
            return String.format("%.0f",diem);
        }
        return String.format("%.1f",diem);
    }


    @Override
    public String toString() {
        return mathisinh+" "+hoten+" "+printDiem(getDiemUuTien())+" "+printDiem(getTongDiem())+" "+ketQua();
    }
}
