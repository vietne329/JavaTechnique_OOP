package self_study.laptrinhcoban;

import java.util.Scanner;

public class SoKhongLienKe {
    public static boolean check(String s){
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            int a = s.charAt(i)-'0';
            count+=a;
            int  b = s.charAt(i+1)-'0';
            if((a-b)!=2 && (a-b)!=-2){
                return false;
            }
        }
        count+= (s.charAt(s.length()-1)-'0');
        if(count%10 !=0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String temp = in.nextLine();
            if(check(temp)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
