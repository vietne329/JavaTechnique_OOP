
package recursive;

import java.util.Scanner;

public class R7_Day_Xau_Fibonacci {
       static long f[] = new long[100];

    public static void main(String[] args) {
        f[0] =0;
        f[1] =1;
        for(int i=2;i<=92;i++){
            f[i] = f[i-1] + f[i-2];
        }
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            long k = in.nextLong();
            System.out.println(fiboWord(n,k));
        }
    }
    public static char fiboWord(int n , long k){
        if(n==1) return 'A';
        if(n==2) return 'B';
        if(k<= f[n-2]) return fiboWord(n-2,k);
        return  fiboWord(n-1,k-f[n-2]);
    }
}
