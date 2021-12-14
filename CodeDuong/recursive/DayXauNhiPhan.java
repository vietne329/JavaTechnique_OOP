/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive;
import java.util.* ;

public class DayXauNhiPhan {
    
    static int n, a[] = new int[30];
    static void quaylui(int i){
        for(int j=0;j<=1;j++){
            a[i]=j;
            if(i==n){
                for(int k = 0;k<n;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
            else quaylui(i+1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        quaylui(1);
    }
}
