
package basic_programming;

import java.util.Scanner;

public class B8_SoDep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ; 
        int t = in.nextInt() ;
        while(t -- > 0){
            String s = in.next() ; 
            if(tn(s) && chan(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean  tn(String s) {
        StringBuilder b= new StringBuilder(s) ;
        String rs = b.reverse().toString() ;
        return s.equals(rs);
    }
    
    public static boolean chan(String s ){
        for(int  i = 0 ; i<s.length() ; i ++){
            int t = s.charAt(i)-'0' ;
            if(t%2 == 1) return  false ;
        }
        return  true ;
    }
}
