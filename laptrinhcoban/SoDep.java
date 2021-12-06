package self_study.laptrinhcoban;

import java.util.Scanner;

public class SoDep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String s = sc.next();
            if(thuannghich(s) && isEven(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean thuannghich(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        String rs = stringBuilder.reverse().toString();
        return s.equals(rs);
    }

    public static boolean isEven(String s){
        for(int i = 0 ; i < s.length(); i++){
            int num = s.charAt(i)-'0';
            if(num %2 == 1){
                return false;
            }
        }
        return true;
    }
}
