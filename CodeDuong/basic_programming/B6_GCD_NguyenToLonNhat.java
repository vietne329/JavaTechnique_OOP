
package basic_programming;
import java.util.* ;

public class B6_GCD_NguyenToLonNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int t = in.nextInt() ;
        while( t-- >0){
          long  n ;
          n =in.nextLong();
            get(n);
        }
    }
    
    public static void get(long n) {
        while(n%2 == 0){
             n /= 2 ;
        }
        for(long i =3 ;i<=Math.sqrt(n) ; i+=2){
            while( n% i == 0){
                n /= i ;
            }
            if(n == 1 ) System.out.println(i);
        }
        if(n > 3) System.out.println(n);
    }
}
