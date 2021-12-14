
package basic_programming;

import java.util.* ;

public class B_38_TinhLuyThua {
    static int mod = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTest = 20;
        while (soTest --> 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            if (n == 0 && k == 0) break;
            else System.out.println(powMod(n, k));
        }
    }

    private static long powMod(long n, long k) {
        if (k == 0) return 1;
        long x = powMod(n, k/2);
        long a = mul(x, x);
        if (k % 2 ==1) return a*n % mod;
        return a % mod;
    }
    private static long mul(long n, long k) {
        if (k == 0) return 0;
        long tmp = mul(n, k/2);
        if (k % 2 ==1 ) return (tmp*2 + n)%mod;
        return tmp*2%mod;
    }
}
