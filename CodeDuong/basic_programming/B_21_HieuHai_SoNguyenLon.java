
package basic_programming;
import java.math.BigInteger;
import java.util.* ;
public class B_21_HieuHai_SoNguyenLon {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in) ;
        BigInteger a = in.nextBigInteger() ;
        BigInteger b = in.nextBigInteger();
      
        BigInteger res = a.subtract(b) ;
        
        
        System.out.println(res);
        
    }
}
