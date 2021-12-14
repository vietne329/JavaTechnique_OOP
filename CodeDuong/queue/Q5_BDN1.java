
package queue;

import java.util.*;
public class Q5_BDN1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            String s1 = in.next();
            xuly(s1);
        }
    }
    public static void xuly(String s1){
        Queue<String> q = new LinkedList<>();
       q.add("1");
       int dem = 0 ;
       while(!q.isEmpty()){
            String tmp = q.poll();
            if(tmp.length() <s1.length()) {
                dem++;
            
               q.add(tmp+"0");
               q.add(tmp+"1");
           }
            if(tmp.length() ==s1.length() && tmp.compareTo(s1) <=0) dem++;
       }
        System.out.println(dem);
    }
}