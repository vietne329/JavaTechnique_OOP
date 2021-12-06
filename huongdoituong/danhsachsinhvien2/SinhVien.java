package self_study.huongdoituong.danhsachsinhvien2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String ma,ten,lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(int id,String ten, String lop, String ngaysinh, float gpa) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d",id);
        this.ten = chuanHoaHoTen(ten);
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+lop+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)+" "+String.format("%.2f",gpa);
    }
    private String chuanHoaHoTen(String ten){
        ten = ten.trim().toLowerCase();
        ten = ten.replaceAll("\\s+"," ");
        String temp[] = ten.split(" ");

        ten = "";
        for(int i = 0 ; i < temp.length; i++){
            ten+= String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1)+" ";
        }

        return ten;
    }
}
