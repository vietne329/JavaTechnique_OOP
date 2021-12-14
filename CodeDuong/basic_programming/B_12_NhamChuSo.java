
package basic_programming;
import java.util.*;
public class B_12_NhamChuSo {
     public static long tongnho(String s1, String s2){
        String s11 = s1.replace('6', '5');
        String s21 = s2.replace('6', '5');
        return Long.parseLong(s11)+Long.parseLong(s21);
    }
    
    public static long tonglon(String s1, String s2){
        String s11 = s1.replace('5', '6');
        String s21 = s2.replace('5', '6');
        return Long.parseLong(s11)+Long.parseLong(s21);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();  
        String s2 = sc.next();
        System.out.println(tongnho(s1,s2)+" "+tonglon(s1,s2));
      
    }
}
