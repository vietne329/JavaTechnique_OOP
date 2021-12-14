
package queue;

import java.util.* ;
public class Q2_Min_CuaXau {
 public static void main(String[] args) {
      Scanner sc = new Scanner(System.in) ;
      int t = sc.nextInt() ;
      PriorityQueue<Integer> pq =new PriorityQueue<>(5,(o1,o2)->{
          if(o1 >o2) return -1 ;
          else if(o1<o2)return 1;
          else return 0;
      }) ;
     while(t -- >0){
         int n =sc.nextInt();
         sc.nextLine();
          int a[] = new int[32];
          String s = sc.nextLine();
          for(int i = 0 ;i< s.length() ;i++){
             a[s.charAt(i) - 'A']++;
          }
          for(int i =0 ;i<32 ;i++){
              if(a[i] != 0) pq.add(a[i]);
          }
          
          while(!pq.isEmpty() && n >0){
             n -- ;
            int number =pq.poll();
             number -- ;
             pq.add(number);
          }
          
          long result = 0;
          while(!pq.isEmpty()){
              int temp = pq.poll();
              result += (long)temp*temp;
          }
          System.out.println(result);
     }
      
    }
}
