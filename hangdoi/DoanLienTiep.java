    package self_study.hangdoi;

import java.util.Scanner;
import java.util.Stack;

public class DoanLienTiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] input = new int[n];
            int[] kq = new int[n];
            kq[0] = 1;

            for (int i = 0; i < n; i++) {
                input[i] = sc.nextInt();
            }

            Stack<Integer> stack = new Stack<>();
            for(int i = n-1 ; i >=0; i--){
                while(!stack.isEmpty() && input[stack.peek()] < input[i]){
                    int current = stack.pop();
                    kq[current] = current-i;
                }
                stack.push(i);
            }

            while(!stack.isEmpty()){
                int current =stack.pop();
                kq[current] = current+1;
            }

            for(int i= 0 ; i < n;i++){
                System.out.print(kq[i]+" ");
            }
            System.out.println();
        }
    }
}
