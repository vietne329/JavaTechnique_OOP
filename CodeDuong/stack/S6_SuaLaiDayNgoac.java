
package stack;

import java.util. * ;

public class S6_SuaLaiDayNgoac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s = in.nextLine();
            Stack<Character> st = new Stack<>() ;
            for(int i = 0 ; i< s.length() ;i++){
                if(s.charAt(i) =='(' ||s.charAt(i) ==')' && s.isEmpty()) st.push(s.charAt(i));
                else if(s.charAt(i) == ')'){
                    if(st.peek() =='(' && s.charAt(i) == ')') st.pop();
                    else st.push(s.charAt(i));
                }
            }
            int d1= 0 ,d2 =0 ;
            while(!st.isEmpty()){
                if(st.pop() =='(') d1++;
                else d2++ ;
            
            }
            
            int kq = d1/2 + d2/2 +d1%2+ d2%2 ;
            System.out.print(kq);
            System.out.println();
        }
    }
}
