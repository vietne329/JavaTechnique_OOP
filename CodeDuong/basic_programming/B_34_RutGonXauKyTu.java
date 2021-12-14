/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_programming;

import java.util.* ;

public class B_34_RutGonXauKyTu {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer rs = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(stack.isEmpty()) stack.push(s.charAt(i));
            else{
                if(stack.peek() == s.charAt(i)){
                    stack.pop();
                }
                else{
                    stack.push(s.charAt(i));
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("Empty String");
        }
        else while(!stack.isEmpty()){
            rs.append(stack.peek());
            stack.pop();
        }
        System.out.println(rs.reverse());
        
    }

}

