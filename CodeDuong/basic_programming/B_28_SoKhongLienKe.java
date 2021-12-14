
package basic_programming;
import java.util.* ;
public class B_28_SoKhongLienKe {
      public static boolean checkchiahet(String s){
        int tong = 0;
        for(int i=0;i<s.length();i++){
            tong+=s.charAt(i)-'0';
        }
        if(tong%10 ==0) return true;
        else return false;
    }
    public static boolean checkcs(String s){
        for(int i=0;i<s.length()-1;i++){
            if((s.charAt(i)-'0') != (s.charAt(i+1)-'0'+2)){
                if((s.charAt(i)-'0') != (s.charAt(i+1)-'0'-2))
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
            if(checkchiahet(s)&&checkcs(s)) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}
