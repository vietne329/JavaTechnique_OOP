package self_study.hangdoi;

import java.util.Scanner;
import java.util.Stack;

public class LoaiBoDauNgoacThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s= sc.nextLine();
            resolve(s);
        }
    }

    private static void resolve(String s) {
        Stack<Integer> stack = new Stack<>();
        s = s.trim();
        s = s.replaceAll("\\s+","");
        int check = 0;
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i)=='(') stack.push(i);
            else if(s.charAt(i)==')'){
                int j = stack.peek();
                stack.pop();


                if(i-j==2){
                    s = s.replace(s.charAt(i),' ');
                    s = s.replace(s.charAt(j),' ');
                }
                if(s.charAt(j+1)=='(' && s.charAt(i-1)==')'){
                    s = s.replace(s.charAt(i-1),' ');
                    s = s.replace(s.charAt(j+1),' ');
                }
            }
        }
        s = s.replaceAll("\\s+","");
        System.out.println(s);
    }
}
