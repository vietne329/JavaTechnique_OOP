
package stack;
import java.util.* ;

public class S7_BieuThucDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int t= sc.nextInt();
        sc.nextLine();
        while(t -- >0){
            int kq = 0 ;
            String s = sc.nextLine() ;
            Stack<Character> st =new Stack<>() ;
            for(int i =0 ;i <s.length() ;i++){
                if(st.isEmpty()){
                    st.push(s.charAt(i));
                }else{
                    if(st.peek()== '[' && s.charAt(i)==']') st.pop();
                    else if(st.peek()==']'&& s.charAt(i) == '['){
                        kq+=st.size();
                        st.pop();
                    }else{
                        st.push(s.charAt(i));
                    }
                }
            }
            System.out.println(kq);
        }
    }
}
