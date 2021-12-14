/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
import java.util.*;
public class S_11_DauTuChungKhoan {
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
