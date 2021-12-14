/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic_programming;
import java.util. * ;

public class D7_XauConDoiXungDaiNhat {
    static boolean f[][];
    public static void main(String[] args) {
        Scanner  in  = new Scanner(System.in) ;
        int t = in.nextInt() ;
        while(t -- > 0){
            char s[] = in.next().toCharArray() ;
            System.out.println(qhd(s));
        }
    }
    
    public static int qhd(char s[]) {
        int i , j ,k , n = s.length,kq = 1 ;
        f = new boolean [n+1][n+1] ;
        for( i =0 ; i < n ;i++) {
          for( j = 0 ; j< n ;j++){
                if(i == j) f[i][j] = true ;
                else f[i][j] = false;
          }
        }
        
        for(k=1 ;k<n;k++){
            for( i = 0 ; i < n - k ;i++){
                 j = i+ k ;
             if(s[i] == s[j]){
                    if(k ==1) f[i][j] =true ;
                    else f[i][j]  = f[i+1][j-1]  ;
                 }
            
             if(f[i][j])    kq =Math.max(kq, j-i+1) ;
            }
        }
        return kq ;
    }
}
