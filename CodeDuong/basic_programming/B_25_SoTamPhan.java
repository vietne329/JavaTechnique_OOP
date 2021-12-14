
package basic_programming;

import java.util.* ;

public class B_25_SoTamPhan {
     public static boolean check(long x){
        while(x > 0){
                if(x%10!=1&&x%10!=2&&x%10!=0) {
                    return false;
                }
                x/=10;
            } 
        return true;
    }
    
    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while(T-->0){
            long x = sc.nextLong();
            if(check(x)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        
    }
}
