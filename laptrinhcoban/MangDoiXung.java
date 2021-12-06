package self_study.laptrinhcoban;

import java.util.Scanner;

public class MangDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt(), a[] = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();

            if(doixung(a,n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean doixung(int[] a, int n){
        int start = 0, end = n-1;
        while(start < end){
            if(a[start] != a[end]) return false;
            start++; end--;
        }
        return true;
    }
}
