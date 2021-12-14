
package basic_programming;

import java.math.BigInteger;
import java.util.* ;

public class B_29_BoiSoChungNhoNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int t = in.nextInt() ;
        
        while(t -- > 0){
            BigInteger a = in.nextBigInteger();
        BigInteger b= in.nextBigInteger() ;
          System.out.println(a.multiply(b).divide(a.gcd(b)));
        }
    }
    
}
   
      