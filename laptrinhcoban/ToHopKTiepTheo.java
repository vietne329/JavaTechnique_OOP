package self_study.laptrinhcoban;

import java.util.Scanner;

public class ToHopKTiepTheo {
    public static void next(int[] B,int N,int K){

        int i = K;
        while (B[i] == N - K + i) i--;
        B[i]++;
        if(i!=K)
            for(int j = i + 1; j <= K; j++) B[j] = B[i] + j - i;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[k+1];
            int temp[] = new int[k+1];
            for(int i=1;i<=k;i++){
                a[i] = in.nextInt();
                temp[i]=a[i];
            }
            int demm=0;
            for (int i=1;i<=k;i++){
                if(a[i]==n-k+i)
                    demm++;
            }
            if(demm==k){
                System.out.println(k);
            }
            else {
                next(a, n, k);
                int dem = k;
                for (int i = 1; i <= k; i++) {
                    for (int j = 1; j <= k; j++)
                        if (temp[j] == a[i]) {
                            dem--;
                            break;
                        }
                }
                System.out.println(dem);
            }
        }

    }
}
