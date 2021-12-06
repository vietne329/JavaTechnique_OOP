package self_study.DeQuy;

import java.util.ArrayList;
import java.util.Scanner;

public class SapXepQuanHau2 {
    static int n, a[] = new int[11],check[] =new int [11],xuoi[] = new int[21],nguoc[] = new int[21];
    static int[][] matrix = new int[9][9];
    static int max;
    static void quaylui(int i){
        for(int j=1;j<=n;j++){
            if(check[j]==0 && xuoi[i-j+n]==0 && nguoc[i+j-1]==0)
            {
                a[i]=j;
                check[j]=1;
                xuoi[i-j+n]=1;
                nguoc[i+j-1]=1;
                if(i==n){
                    int sum=0;
                    for(int x=1;x<=n;x++){
                        sum+=matrix[x-1][a[x]-1];
                    }
                    if(sum>max){
                        max = sum;
                    }
                }
                else{
                    quaylui(i+1);
                }
                check[j]=0;
                xuoi[i-j+n]=0;
                nguoc[i+j-1]=0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            check = new int[11];
            a= new int[11];
            xuoi = new int[21];
            nguoc = new int[21];
            for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    matrix[i][j]=in.nextInt();
                }
            }
            max = Integer.MIN_VALUE;
            n=8;
            quaylui(1);
            System.out.println(max);
        }
    }
}
