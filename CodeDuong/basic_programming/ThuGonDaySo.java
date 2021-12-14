/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_programming;

import java.util. * ;

public class ThuGonDaySo {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if((a[i]+a[i+1])%2 ==0 ){
                a[i]=-1;
                a[i+1]=-1;
                i++;
            }

        }
        int dem=0;
        for(int i=0;i<n;i++){
            if(a[i]>0 ){
                dem++;
            }

        }
        System.out.println(dem);

    }   
}
