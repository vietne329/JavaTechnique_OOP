package self_study.laptrinhcoban;

import java.math.BigInteger;
import java.util.Scanner;

public class UocSoChungLonNhatCuaSoNguyenLon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();

            BigInteger uc = a.gcd(b);
            System.out.println(uc);
        }
    }
}
