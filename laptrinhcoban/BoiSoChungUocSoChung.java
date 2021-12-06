package self_study.laptrinhcoban;

import java.util.Scanner;

public class BoiSoChungUocSoChung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();

            long bc = (long) a*b/uc(a,b);
            System.out.println(bc+" "+uc(a,b));
        }
    }

    public static int uc(int a, int b){
        while(b > 0){
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
