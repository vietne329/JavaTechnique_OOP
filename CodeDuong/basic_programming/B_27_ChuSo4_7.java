
package basic_programming;
import java.util.* ;

public class B_27_ChuSo4_7 {
    public static void main(String[] args) {
       String x ;
        Scanner sc = new Scanner(System.in);
        x = sc.next();
        int dem=0;
        for(int i=0;i<x.length();i++){
            if((x.charAt(i)-'0')==4||(x.charAt(i)-'0')==7){
                dem++;
            }
        }
        if(dem==4||dem==7) System.out.println("YES");
        else System.out.println("NO");

    
    }
}
