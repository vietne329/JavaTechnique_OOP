
package stack;
import java.util.* ;
public class S2_KiemTra_DauNgoac_Dung {
     
    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while(T-->0){
            String s = sc.next();
            if(kiemtra(s)) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
    
    
       public static boolean kiemtra(String s){
       Stack<Character> st = new Stack<>();
       for(int i = 0 ; i<s.length() ;i++){
           char out =s.charAt(i);
           if(s.charAt(i) == '('||s.charAt(i) == '{'||s.charAt(i) == '[') st.push(s.charAt(i));
           else{
               if(st.isEmpty()) return false ;
               char in = st.peek();
               if(in =='(' && out ==')') st.pop();
               else if(in =='{' && out =='}') st.pop();
               else if(in =='[' && out ==']') st.pop();
                 else return false;
                 
           }
       }
       return st.isEmpty();
    }
}
