package self_study.nganxep;

import java.util.Scanner;
import java.util.Stack;

public class DauTuChungKhoan {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            int n = in.nextInt();
            int a[] = new int[n];
            int result[] = new int[n];
            result[0] = 1;
            for(int i=0;i<n;i++){
                a[i] = in.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            for(int i=n-1;i>=0;i--){
                while (!st.isEmpty() && a[st.peek()] < a[i]) {
                    int index = st.pop();
                    result[index] = index-i;
                }
                st.push(i);
            }
            while (!st.isEmpty()){
                int index = st.pop();
                result[index] = index+1;
            }
            for(int i=0;i<n;i++){
                System.out.print(result[i]+" ");
            }
            System.out.println();
        }
    }
}
