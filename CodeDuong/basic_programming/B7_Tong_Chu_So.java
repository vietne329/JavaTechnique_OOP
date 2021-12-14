
package basic_programming;

import java.util.Arrays;
import java.util.Scanner;


public class B7_Tong_Chu_So {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int t =in.nextInt() ;
        while(t -- > 0){
            char s[] =in.next().toCharArray();
           Arrays.sort(s);
           int tong =0 ;
           for(int i= 0 ;i<s.length;i++){
               if(Character.isDigit(s[i])) tong +=(s[i] - '0') ;
               else System.out.print(s[i]);
           }
            System.out.println(tong);
        }
    }
}
