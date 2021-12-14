/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic_programming;
import java.util.* ;
public class D3_TongLonNhat_DayConTangDan {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(tinh(n,a));
        }
    }
    
    public static long tinh(int n, int a[]){
        long result = 0;
        long[] b = new long[n];
        b[0] = a[0];
        for(int i=0;i<n;i++){
            b[i] = a[i];
            for(int j=0;j<i;j++){
                if(a[j] < a[i]){
                    b[i] = Math.max(b[i], b[j]+a[i]);
                }
            }
            result = Math.max(result, b[i]);
        }
        return result;
    }
}
