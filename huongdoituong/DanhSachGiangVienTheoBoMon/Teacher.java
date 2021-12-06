package self_study.huongdoituong.DanhSachGiangVienTheoBoMon;

public class Teacher {
    private String id,hoten, bomon;

    public Teacher(int id,String hoten, String bomon) {
        this.id = "GV"+String.format("%02d",id);
        this.hoten = hoten;
        this.bomon = bomon;
    }

    public String convertBoMon(){
        String bomon = this.bomon;
        bomon = bomon.trim().toUpperCase();
        bomon = bomon.replaceAll("\\s+", " ");
        String[] words = bomon.split(" ");
        String s = "";
        for (int i = 0; i < words.length; i++) {
            s += String.valueOf(words[i].charAt(0));
        }
        return s;

    }

    @Override
    public String toString() {
        return id+" "+hoten+" "+convertBoMon();
    }
}
