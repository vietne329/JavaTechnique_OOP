/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic_programming;

import java.util.Scanner;

/**
 *
 * @author Pro 2004
 */
public class D_11_SoNguyenLon {
      static int c[][] ;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        int t = in.nextInt() ;
        while(t-- >0){
            char s1[] = in.next().toCharArray() ;
            char s2[] = in.next().toCharArray() ;
            System.out.println(qhd(s1,s2));
        }
    }

    private static int qhd(char[] s1, char[] s2) {
      int  n = s1.length , m = s2.length ;
      c=new int[n+1][m+1] ;
      for(int  i = 1 ;i <= n ;i++){
          for( int j = 1 ; j <= m ;j++){
              if(s1[i -1] == s2[j-1]) c[i][j] = c[i-1][j-1] +1 ;
              else c[i][j] =Math.max(c[i][j-1], c[i-1][j]) ;
          }
      }
      return c[n][m];
    }
}
