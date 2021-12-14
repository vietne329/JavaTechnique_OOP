
package danhsach_doituong_sinhvien2;

import java.text.ParseException;
import java.util.* ;
public class Main {
     public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
       
        ArrayList<SinhVien> sv  = new ArrayList<> ();
         int t =sc.nextInt() ;
        for(int i = 1 ;i<t+1;i++){
                sc.nextLine();
          SinhVien s = new SinhVien(i,sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextFloat()) ;
      
          sv.add(s);
        }
        
        sv.forEach(System.out::print);
    } 
}
