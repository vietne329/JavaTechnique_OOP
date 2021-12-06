package self_study.nganxep;
import java.util.Scanner;

public class HinhChuNhatLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0 ; i < n; i++){
                a[i] = sc.nextInt();
            }
            resolve(a,n);
        }
    }

    private static void resolve(int[] a, int n) {
        int max = 0;
        for(int i = 0; i < a.length;i++){
            int left =0, right = 0;
            if(i==a.length-1){ //th đầu
                right=a.length;
                left = findLeft(a,i);
                max =Math.max( (right-left-1)*a[i],max);
            }
            else if(i==0){//th cuối
                left=-1;
                right = findRight(a,i);
                max =Math.max( (right-left-1)*a[i],max);
            }else{
                left = findLeft(a,i);
                right = findRight(a,i);
                max =Math.max( (right-left-1)*a[i],max);
            }
        }


        System.out.println(max);
    }

    private static int findRight(int[] a,int index) {
            if(index==a.length-1){
                return a.length;
            }
            if(a[index] > a[index+1]) return index+1;
            else{
                return findRight(a,index+1);
            }
        }


    private static int findLeft(int[] a,int index) {
        if(index==0){
            return -1;
        }

        if(a[index] > a[index-1]) return index-1;
        else{
            return findLeft(a,index-1);
        }
    }
    }

