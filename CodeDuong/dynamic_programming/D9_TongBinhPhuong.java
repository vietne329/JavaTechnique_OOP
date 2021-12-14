/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic_programming;

import java.util.* ;

public class D9_TongBinhPhuong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int t = in.nextInt() ;
        while(t -- > 0){
            int n = in.nextInt() ;
            System.out.println(qhd(n));
        }
    }

    private static int qhd(int n) {
       int i  ,j ,f[] = new int[n+1] ;
      for(i =1 ; i<= n ;i++){
          f[i] = i ;
          for(j= 2; j<=Math.sqrt(i);j++){
          f[i]  = Math.min(f[i], f[i-j*j] +1) ;
      }
      } 
      return  f[n] ;
    }
}
