
package khaibaolopnhanvien;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class NhanVien {
    private String ma ,ten ,gioitinh,diachi,masothue ;
    private Date ngaysinh,ngayky ;

       public NhanVien(String ten,String gioitinh,String ngaysinh, String diachi, String masothue, String ngayky) throws ParseException {
        this.ma = "00001";
        this.ten = ten;
        this.gioitinh =gioitinh;
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.ngayky = new SimpleDateFormat("dd/MM/yyyy").parse(ngayky);
    }
   @Override
   public String toString(){
       return ma + 
               " " + ten +
               " "+gioitinh +
               " "+new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)+
               " "+diachi + 
               " "+masothue +
               " "+ new SimpleDateFormat("dd/MM/yyyy").format(ngayky) ;
   }
}
