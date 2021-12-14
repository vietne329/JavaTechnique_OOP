
package basic_programming;

import java.util.* ;
public class B_26_SoLienKe {
      public static boolean checkcs(String s){
        for(int i=0;i<s.length()-1;i++){
            if((s.charAt(i)-'0') != (s.charAt(i+1)-'0'+1)){
                if((s.charAt(i)-'0') != (s.charAt(i+1)-'0'-1))
                    return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int T;
        int x;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while(T-->0){
            String s = sc.next();
            if(checkcs(s)) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}
