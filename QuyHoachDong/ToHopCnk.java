package self_study.QuyHoachDong;

import java.util.Scanner;

public class ToHopCnk {
    static int c[][];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        c = new int[1001][1001];
        int i,j,mod = (int) 1e9+7;
        for(i = 0; i <= 1000; i++){
            for(j = 0; j<= i; j++){
                if(i==j || j==0 ) c[i][j] = 1;
                else c[i][j] = (c[i-1][j-1] + c[i-1][j])  % mod;
            }
        }
        int t = in.nextInt();
        while(t-- >0){
            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println(c[n][k]);
        }
    }
}
