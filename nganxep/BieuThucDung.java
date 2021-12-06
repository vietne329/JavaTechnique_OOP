package self_study.nganxep;

import java.util.Scanner;
import java.util.Stack;

public class BieuThucDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0){
            String s = sc.nextLine();
            resolve(s);
        }
    }

    private static void resolve(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for(int i = 0 ; i < s.length(); i++){
            if(i == s.length()-1){
                break;
            }
            if(s.charAt(i) == '[' && s.charAt(i+1)==']'){
                i++;
                count= count+2;
            }
        }
        System.out.println(s.length()-count);
    }
}
