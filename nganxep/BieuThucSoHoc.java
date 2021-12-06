package self_study.nganxep;

import java.util.Scanner;
import java.util.Stack;

public class BieuThucSoHoc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            if(check(s)) System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

    private static boolean check(String s) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == '(') stack.push(i);
            else if(s.charAt(i) == ')'){
                int j = stack.peek();
                stack.pop();
                if(i-j == 2) return true;
                if(s.charAt(j+1) == '(' && s.charAt(i-1) == ')') return true;
            }
        }
        return false;
    }
}
