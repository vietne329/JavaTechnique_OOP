package self_study.nganxep;

import java.util.Scanner;
import java.util.Stack;

public class DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
           String s = sc.nextLine();
           reverse(s);
        }

    }

    private static void reverse(String s) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(s);
        while (sc.hasNext()){
            String word = sc.next();
            for(int i = 0 ; i < word.length(); i++){
                stack.push(word.charAt(i));
            }

            while(!stack.empty()){
                System.out.print(stack.pop());
            }
            System.out.print(" ");
        }
        System.out.println();
    }


}
