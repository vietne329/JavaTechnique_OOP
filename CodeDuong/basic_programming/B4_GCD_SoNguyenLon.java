
package basic_programming;

import java.math.BigInteger;
import java.util.Scanner;

public class B4_GCD_SoNguyenLon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
     int t = in.nextInt() ;
     while(t -- > 0){    
       
        BigInteger a = in.nextBigInteger();
        BigInteger b= in.nextBigInteger() ;
        BigInteger gcd = b.gcd(a) ;
        
         System.out.println(gcd);
       
     }
    }
 
    

}
