
package basic_programming;

import java.util.Scanner;


public class B1_SoNguyenTo {
    public static boolean checkNT(int s){
        if(s <2)
           return false ;
        
        for(int i=2;i<=Math.sqrt(s);i++){
            if(s%i == 0)
            {
                return false ;
            }  
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in) ;
        int t =sc.nextInt();
        while(t --> 0){
            int s =sc.nextInt();
            if(checkNT(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
