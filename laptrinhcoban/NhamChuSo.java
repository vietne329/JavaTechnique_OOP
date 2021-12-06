package self_study.laptrinhcoban;

import java.util.Scanner;

public class NhamChuSo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String s1 = String.valueOf(a);
        String s11="";
        String s12="";
        String s2 = String.valueOf(b);
        String s21="";
        String s22="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) == '5'){
                s11+='6';
            }
            else{
                s11+= s1.charAt(i);

            }
            if(s1.charAt(i)== '6'){
                s12+='5';
            }
            else{
                s12+= s1.charAt(i);
            }
        }
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i) == '5'){
                s21+='6';
            }
            else{
                s21+= s2.charAt(i);

            }
            if(s2.charAt(i)== '6'){
                s22+='5';
            }
            else{
                s22+= s2.charAt(i);
            }
        }
        int n11 = Integer.parseInt(s11);
        int n12 = Integer.parseInt(s12);
        int n21 = Integer.parseInt(s21);
        int n22 = Integer.parseInt(s22);
        System.out.println((n12+n22)+" "+(n11+n21));
    }
}
