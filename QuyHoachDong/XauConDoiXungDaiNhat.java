package self_study.QuyHoachDong;

import java.util.Scanner;

public class XauConDoiXungDaiNhat {
    static  boolean f[][] ;
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- >0){
            char[]  s = in.next().toCharArray();
            System.out.println(qhd(s));
        }
    }
    public static int qhd(char[] s){
        int n = s.length;
        f = new boolean[s.length+1][s.length+1];
        for(int i=0;i<=n;i++) f[i][i] = true;
        int j;
        int kq=1;
        for(int k = 1; k<n ; k++){
            for(int i = 1;i<= n-k; i++){
                j= i+k;
                if(k == 1){
                    if (s[i-1] == s[j-1])
                        f[i][j] = true;
                }
                else{
                    if(s[i-1] == s[j-1] && f[i+1][j-1])
                        f[i][j] = true;
                }
                if(f[i][j])kq = Math.max(kq,j-i+1);
            }
        }
        return kq;
    }
}
