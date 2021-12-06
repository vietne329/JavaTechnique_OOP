package self_study.laptrinhcoban;

import java.math.BigInteger;
import java.util.Scanner;

public class ChiaHet {
    public static void main(String[] args) {
        BigInteger a,b;
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while(t-->0){
            a = sc.nextBigInteger();
            b = sc.nextBigInteger();
            BigInteger res1 = a.mod(b);
            BigInteger res2 = b.mod(a);

            if(res1.toString().equalsIgnoreCase("0") || res2.toString().equalsIgnoreCase("0")){
                System.out.println("YES");;
            }else{
                System.out.println("NO");
            }


        }
    }

}
