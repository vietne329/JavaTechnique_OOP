package basic_programming;
import java.math.BigInteger;
import java.util.*;
public class B_37_ChiaHet {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    while(n -- > 0){
        BigInteger a = sc.nextBigInteger();
        BigInteger b=sc.nextBigInteger();
        BigInteger res1 = a.mod(b);
        BigInteger res2 = b.mod(a);
        if(res1.toString().equalsIgnoreCase("0")||res2.toString().equalsIgnoreCase("0")){
            System.out.println("YES");
        }else System.out.println("NO");
        }
    }
}
