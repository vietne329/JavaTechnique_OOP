package self_study.laptrinhcoban;

import java.util.Scanner;

public class SapXepCongViec {
    static int a[] = new int[10000];
    static int b[] = new int[10000];
    static int n=0,position=0,count=0,min=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            int n = in.nextInt();
            for(int i=0;i<n;i++){
                a[i] = in.nextInt();
                b[i] = in.nextInt();
            }
            position = 0;
            count =0;
            min =1000001;
            while (true){
                int dem=0;
                for(int i=0;i<n;i++){
                    if(min>b[i] && a[i]>=position ){
                        min = b[i];
                    }
                    else dem++;
                }
                if(dem == n){
                    System.out.println(count);
                    break;
                }
                else{
                    position=min;
                    min =1000001;
                    count++;
                }
            }
        }
    }
}