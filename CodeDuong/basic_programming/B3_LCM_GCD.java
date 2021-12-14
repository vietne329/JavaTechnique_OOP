

package basic_programming;
import java.util.* ;

public class B3_LCM_GCD {
    public static void main(String[] args) {
        int t  ;
        long a, b  ;
        Scanner in = new Scanner(System.in) ;
        t = in.nextInt() ;
        while(t -- > 0){
            a= in.nextInt() ;
            b= in.nextInt() ;
            long x = gcd(a, b) ;
            System.out.println(lcm(a, b, x) +" "+ x);
            
        }
    }
    public static long gcd(long a ,long b ){
        if(b == 0) return a ;
        else return gcd(b, a%b) ;
    }
    
    public static long lcm(long a, long b, long gcd){
        return (Math.abs(a*b)/gcd) ;
    }
}
