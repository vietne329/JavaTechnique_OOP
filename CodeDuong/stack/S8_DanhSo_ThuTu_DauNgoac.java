/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
import java.util.* ;

public class S8_DanhSo_ThuTu_DauNgoac {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s = in.nextLine();
            Stack<Integer> stack = new Stack<>();
            int ngoac = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    ngoac++;
                    System.out.print(ngoac + " ");
                    stack.push(ngoac);
                }else if (s.charAt(i) == ')') {
                    System.out.print(stack.pop() + " ");
                }
            }
            System.out.println();
        }
    }
}
