
package basic_programming;

import java.math.BigInteger;
import java.util.Scanner;

public class B_31_TongSoNguyenLon {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b= in.nextBigInteger() ;
        System.out.println(a.add(b));
    }
}
