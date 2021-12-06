package self_study.laptrinhcoban;

import java.util.Scanner;

public class ChuSo4Va7 {
    public static boolean check(String s){
        int dem =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== '4' || s.charAt(i)=='7')
                dem++;
        }
        if(dem == 4||dem ==7)
            return true;
        return false;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if(check(s)){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
