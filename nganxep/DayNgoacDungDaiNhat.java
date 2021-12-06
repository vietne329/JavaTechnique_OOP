package self_study.nganxep;

import java.util.Scanner;
import java.util.Stack;

public class DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0){
            String s = sc.nextLine();
            System.out.println(count(s));
        }

    }

//    private static int count(String s) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(-1); int kq =0;
//        for(int i =0 ; i < s.length(); i++){
//            if(s.charAt(i) == '(') stack.push(i);
//            else{
//                stack.pop();
//                if(!stack.empty()){
//                    kq = Math.max(kq,i-stack.peek());
//                }else stack.push(i);
//            }
//        }
//        return kq;
//    }

    private static int count(String s){
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int max=0;
        for(int i =0 ; i < s.length(); i++){
            char current = s.charAt(i);
            if(current == '(') stack.push(i);
            else{
                stack.pop();
                if(!stack.empty()){
                    max = Math.max(max, i-stack.peek());
                }else{
                    stack.push(i);
                }
            }
        }
        return max;

    }
}
