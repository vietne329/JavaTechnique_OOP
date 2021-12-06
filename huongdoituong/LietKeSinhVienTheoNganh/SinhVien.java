package self_study.huongdoituong.LietKeSinhVienTheoNganh;

public class SinhVien{
    private String id,ten,lop,email;

    public SinhVien(String id, String ten, String lop, String email) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public String getEmail() {
        return email;
    }

    public String getNganh(){
        String ngang = this.id;
        ngang = ngang.substring(5,7);

        if(ngang.equalsIgnoreCase("KT")){
            ngang = "Ke toan";
        }else if(ngang.equalsIgnoreCase("CN")){
            ngang = "Cong nghe thong tin";
        }else if(ngang.equalsIgnoreCase("AT")){
            ngang = "An toan thong tin";
        }else if(ngang.equalsIgnoreCase("VT")){
            ngang = "Vien thong";
        }else if(ngang.equalsIgnoreCase("DT")){
            ngang = "Dien tu";
        }

        return ngang;
    }

    @Override
    public String toString() {
        return id+" "+ten+" "+lop+" "+email;
    }

}
