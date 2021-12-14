
package danhsach_doituong_sinhvien2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.* ;
public class SinhVien {
        private String hoten ;
    private Date ngaysinh ;
    private float gpa ;
    private String lop ;
    private int ma ;

    public SinhVien(int id,String hoten,String lop ,  String ngaysinh,float gpa )throws ParseException {
        this.ma = id;
        this.hoten = hoten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaysinh);
       this.gpa = gpa;
        
    }
    
    @Override
    public String toString(){
        String ma = "B20DCCN" +String.format("%03d", this.ma) ;
        return ma+" "+chuanHoa(hoten)+" "+lop+" "+new SimpleDateFormat("dd/mm/yyyy").format(ngaysinh)+" "+String.format("%.3g%n", gpa);
    }
    
           private static String chuanHoa(String s) {
        StringTokenizer st = new StringTokenizer(s) ;
        StringBuilder kq = new StringBuilder() ;
        while(st.hasMoreTokens()){
            String tmp = st.nextToken() ;
            kq.append(Character.toUpperCase(tmp.charAt(0))) ;
            for(int i = 1 ;i<tmp.length() ; i++){
                kq.append(Character.toLowerCase(tmp.charAt(i))) ;
            }
            kq.append(" ") ;
        } 
        return kq.toString().trim() ;
    }
       
}
