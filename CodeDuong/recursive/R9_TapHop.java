
package recursive;
import java.util.*;

public class R9_TapHop {
       static int n, k, s, count;
    static int[]c = new int[50];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            n = in.nextInt();
            k = in.nextInt();
            s = in.nextInt();
            if (n == 0 && k == 0 && s == 0) break;
            count = 0;
            quayLui(1);
            System.out.println(count);
        }
    }

    public static void quayLui(int i) {
        int j;
        for (j = c[i - 1] + 1; j <= n - k + i; j++) {
            c[i] = j;
            if (i == k) xuLy();
            else quayLui(i + 1);
        }
    }

    public static void xuLy() {
        int t = 0;
        for (int i = 1;i <= k; i++) {
            t += c[i];
        }
        if (t == s) count++;
    }
}
