package basic_programming;

import java.util.Scanner;

public class B_35_HoanVi_TiepTheo {
       public static void next(int[] X){
        int i=0,j=0;
        for(j = X.length-1 ;j>0;j--){
            if(X[j]>X[j-1]){
                break;
            }
        }
        j--;
        if(j==-1){
            for(int k=0;k<X.length;k++){
                X[k]=k+1;
            }
        }
        else{
        for(i = X.length-1 ;i>0;i--){
            if(X[i]>X[j]){
                int temp = X[i];
                X[i] = X[j];
                X[j]= temp;
                break;
            }
        }
        for(int x = 0;x<(X.length-i)/1;x++){
            int temp =  X[i+x];
            X[i+x] = X[X.length-1-x];
            X[X.length-1-x] = X[i+x];
        }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            int n = in.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i] = in.nextInt();
            }
            next(a);
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
