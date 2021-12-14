/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic_programming;
import java.util.* ;

public class D5_ToHop {
    static int c[][];
    public static void main(String[] args) {
        c=new int[1001][1001];
        int mod=(int) 1e9+7;
        for (int i=0;i<=1000;i++){
            for (int j=0;j<=i;j++){
                if (i==j || j==0)
                    c[i][j]=1;
                else c[i][j]=(c[i-1][j-1]+c[i-1][j])% mod;
            }
        }

        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            System.out.println(c[n][k]);
        }
    }
}
