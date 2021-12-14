
package queue;

import java.util.*;
public class Q9_SoNguyenThuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while( n -- >0){
            int t =sc.nextInt();
            lietke(t);
        }
    }

    private static void lietke(int t) {
      int number = t;
      Queue<String> q =new LinkedList<>();
      q.add("4");
      q.add("5");
      while(!q.isEmpty() && number -- > 0){
          String tmp = q.poll() ;
          String result = tmp+reverse(tmp);
          if(tmp.length()> t)  break;
              System.out.print(result+" ");
              q.add(tmp+"4");
              q.add(tmp+"5");
         
      }
        System.out.println();
 
    }

    private static String reverse(String tmp) {
       StringBuilder stringBuilder = new StringBuilder(tmp);
       return stringBuilder.reverse().toString();
    }
  
}
