/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;
import java.util.* ;

public class Q4_So0_9 {
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int t =in.nextInt();
       while(t -- > 0){
           int n = in.nextInt() ;
           xuly(n) ;
       }
   }
   
   public static void xuly(int n){
       Queue<String> q = new LinkedList<>();
       q.add("9");
       while(!q.isEmpty()){
           String tmp = q.poll();
           long x = Long.parseLong(tmp);
           if(x%n == 0) 
           {
               System.out.print(x);
               break;
           }
           q.add(tmp+"0") ;
           q.add(tmp+"9");
           
       }
       System.out.println();
   }

}
