/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic_programming;

import java.util.* ;
public class D6_BacThang {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt(), k=scanner.nextInt();
            System.out.println(qhd(n,k));
        }
    }

    public static int qhd(int n, int k) {
        int i,j,mod=(int) 1e9+7,f[]=new int[n+1];
        f[0]=1;
        f[1]=1;
        for (i=2;i<=n;i++){
            for (j=1;j<=Math.min(i,k);j++){
                f[i]=(f[i]+f[i-j]) % mod;
            }
        }
        return f[n];
    }
}
