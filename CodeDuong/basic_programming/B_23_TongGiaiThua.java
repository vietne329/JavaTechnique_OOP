
package basic_programming;
import java.util.* ;
public class B_23_TongGiaiThua {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in ) ;
       int t = in.nextInt() ;
       long n = 0 ;
       for(int  i = 1 ; i<= t ;i++){
           n += tinhGiaiThua(i);
       }
        System.out.println(n);
    }
      public static long tinhGiaiThua(int n ){
          long gt =1 ;
          for(int i =1 ;i<= n ;i++){
              gt *= i ;
          }
          return gt ;
      }
}
