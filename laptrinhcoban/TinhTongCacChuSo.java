package self_study.laptrinhcoban;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCacChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            char[] c = sc.next().toCharArray();
            Arrays.sort(c);
            int tong =0;
            for(int i = 0 ; i < c.length; i++){
                if(Character.isDigit(c[i])) tong += c[i]-'0';
                else System.out.print(c[i]);
            }
            System.out.println(tong);
        }
    }
}
