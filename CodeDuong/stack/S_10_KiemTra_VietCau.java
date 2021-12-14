
package stack;
import java.util.* ;

public class S_10_KiemTra_VietCau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n -- >0){
            String s = sc.nextLine();
            System.out.println(check(s)? "YES" :"NO");
        }
    }

    private static boolean check(String s) {
       Stack<Character> st = new Stack<>() ;
       for(int i = 0 ;i< s.length() ;i++){
           if(s.charAt(i) == '(' || s.charAt(i) == '[') st.push(s.charAt(i));
           else if(s.charAt(i) == ')' || s.charAt(i) ==']'){
               if(st.isEmpty()) return false ;
               if(st.peek() == '(' && s.charAt(i) == ')') st.pop();
               else if(st.peek() == '[' && s.charAt(i) == ']') st.pop();
               else return  false;
           }
       }
       return st.isEmpty();
    }
}
