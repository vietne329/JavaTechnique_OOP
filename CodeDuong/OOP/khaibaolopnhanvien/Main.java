
package khaibaolopnhanvien;
import java.text.ParseException;
import java.util.* ;

public class Main {
    public static void main(String[] args) throws ParseException {
       Scanner in = new Scanner(System.in) ;
       NhanVien a = new NhanVien(in.nextLine(), in.nextLine(),in.nextLine(),
        in.nextLine() ,in.nextLine(),in.nextLine()) ;
        System.out.println(a);
    }
}
