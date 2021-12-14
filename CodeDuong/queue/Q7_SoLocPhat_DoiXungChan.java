package queue;

import java.util.* ;

public class Q7_SoLocPhat_DoiXungChan {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            resolve(n);
        }
    }

    private static void resolve(int n) {
      Queue<String> q=  new LinkedList<>();
      q.add("6");
      q.add("8");
      while(n-->0){
          String tmp = q.poll() ;
          System.out.print(tmp+checkReverse(tmp)+" ");
          q.add(tmp+"6");
          q.add(tmp+"8");
      }
        System.out.println();
    }

    private static String checkReverse(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString() ;
    }

}
