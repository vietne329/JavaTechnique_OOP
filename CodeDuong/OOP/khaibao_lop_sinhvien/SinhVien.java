
package khaibao_lop_sinhvien;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.* ;

public class SinhVien {
        private String ma;
    private String fullname;
    private String lop;
    private Date  ngaysinh;
    private float gpa;

    public SinhVien( String fullname, String lop, String ngaysinh, float gpa) throws ParseException {
        this.ma = "B20DCCN001";
        this.fullname = fullname;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.gpa = gpa;
    }

    
    public String toString(){
        return ma+" "+fullname+" "+lop+" "+
                new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)+" "+
                String.format("%.3g%n", gpa);
    }
}
