package self_study.nganxep;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDayNgoacDung {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = Integer.parseInt(in.nextLine());
//        while(t-->0){
//            String s = in.nextLine();
//            if(check(s)) System.out.println("YES");
//            else System.out.println("NO");
//        }
//    }
//
//    private static boolean check(String s) {
//        Stack<Character> stack = new Stack<>();
//        for(int i = 0 ; i < s.length(); i++){
//            char now = s.charAt(i);
//            if(now == '(' || now== '[' || now == '{' ){
//                stack.push(now);
//            }else {
//                if(stack.empty()) return false;
//                char top_of_stack = stack.peek();
//                if(top_of_stack == '(' && now == ')') stack.pop();
//                else if(top_of_stack == '[' && now == ']') stack.pop();
//                else if(top_of_stack == '{' && now == '}') stack.pop();
//                else return false;
//            }
//
//        }
//        return stack.empty();
//    }
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
        if(s == null){
            return true;
        }else{
            for(int i = 0 ; i < s.length(); i++){
                char current = s.charAt(i);
                if(current == '[' || current == '{' || current == '(') stack.push(current);
                else{
                    if(stack.empty()) return false;
                    char peek = stack.peek();
                    if(peek == '(' && current ==')') stack.pop();
                    else if(peek == '[' && current ==']') stack.pop();
                    else if(peek == '{' && current =='}') stack.pop();
                    else return false;
                }
            }
        }
        return stack.empty();
    }
}
