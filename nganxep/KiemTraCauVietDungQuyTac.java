package self_study.nganxep;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraCauVietDungQuyTac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            boolean check = resolve(s);
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static boolean resolve(String s) {
        Stack<Character> stack = new Stack<>();
        s = s.trim();

        for(int i =0 ; i < s.length()-1; i++){
            char current = s.charAt(i);
            if(current=='(' || current=='[') stack.push(current);
            else if(current==']' || current ==')'){
                if(stack.empty()) return false;
                char top = stack.peek();
                if(current==')' && top=='(') stack.pop();
                else if(current==']' && top=='[') stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }

}
