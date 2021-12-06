package self_study.nganxep;

import java.util.Scanner;
import java.util.Stack;

public class DanhSoThuTuCapDauNgoac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            resolve(s);
        }
    }

    private static void resolve(String s) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                index++;
                System.out.print(index+" ");
                stack.push(index);
            }else if(s.charAt(i) == ')'){
                System.out.print(stack.pop()+" ");
            }
        }
        System.out.println();

    }
}
