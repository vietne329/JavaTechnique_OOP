package queue;

import java.util.* ;

public class Q6_BDN2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            xuly(n);
        }
    }

    public static void xuly(int n) {
       Queue<String> q =new LinkedList<>();
       q.add("1");
       while(!q.isEmpty()){
           String tmp = q.poll();
           long x = Long.parseLong(tmp);
           if(x%n ==0) {
               System.out.print(x);
               break;
           }
           q.add(tmp+"0");
           q.add(tmp+"1");
       }
        System.out.println();
    }
}
