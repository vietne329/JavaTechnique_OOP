
package recursive;

import java.math.BigInteger;
import java.util.* ;
public class R5_LuyThua {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();
        while(t -- > 0){
            int n ,k ;
            int M =1000000007 ;
            n =in.nextInt() ;
            k =in.nextInt() ;
             BigInteger a =BigInteger.valueOf(n);
             BigInteger b= BigInteger.valueOf(k) ;
             BigInteger c = BigInteger.valueOf(M) ;
             
             long val = a.modPow(b, c).longValue() ;
             System.out.println(val);
        }
    }

 
}
