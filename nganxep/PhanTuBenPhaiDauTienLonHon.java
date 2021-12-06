package self_study.nganxep;

import java.util.Scanner;
import java.util.Stack;

public class PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();


        while(t-->0){
            int n = in.nextInt();
            int a[] = new int[n];
            for(int i = 0 ; i < n ; i++) a[i] = in.nextInt();
            resolve(a,n);
        }
    }

    private static void resolve(int[] a, int n) {
        int[] r = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1;i >= 0; i--){
            while(!stack.empty() && stack.peek() <= a[i]) stack.pop();
            if(stack.empty()) r[i] = -1;
            else  r[i] = stack.peek();
            stack.push(a[i]);
        }

        for(int i = 0;i < n ; i++){
            System.out.print(r[i]+" ");
        }
        System.out.println();
    }

}
