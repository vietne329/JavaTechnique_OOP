package self_study.laptrinhcoban;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        int t,number;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-->0){
            number = sc.nextInt();
            boolean check = checkPrime(number);
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean checkPrime(int n){
        if(n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
