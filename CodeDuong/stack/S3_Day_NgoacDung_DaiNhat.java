package stack;

import java.util.Scanner;
import java.util.Stack;

public class S3_Day_NgoacDung_DaiNhat {
      public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while(T-->0){
            String s = sc.next();
            System.out.println(tinh(s));
            
        }
    }
    
    
       public static int tinh(String s){
      Stack<Integer> st = new Stack<>();
      st.push(-1) ;int kq = 0 ;
      for(int i = 0 ;i<s.length() ;i++){
          if(s.charAt(i) == '('){
              st.push(i) ;
          }else{
              st.pop();
              while(!st.isEmpty()){
                  kq = Math.max(kq, i - st.peek());
              }
          }
      }
      return kq ;
    }
}
