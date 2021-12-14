
package queue;
import java.util.* ;
public class Q_10_So_ST {
       static Queue<Integer> q ;
    static Map<Integer,Integer> thuTu ,nhanh ;
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt();
        while(t -- > 0){
            q = new LinkedList<>();
            thuTu =  new HashMap<>();
            nhanh = new HashMap<>();
            int x , y ;
            x= sc.nextInt();
            y =sc.nextInt();
            find(x,y);
            thuTu.clear();
            nhanh.clear();
        }
    }
    private static int check(int top ,int next){
        if(nhanh.get(next) ==null){
            thuTu.put(next, thuTu.get(top)+1);
            nhanh.put(next, nhanh.get(top)) ;
            q.add(next);
        }else if(!Objects.equals(nhanh.get(next), nhanh.get(top))){
            System.out.println(thuTu.get(next) + thuTu.get(top)+1);
            return 1 ;
        }
        return 0;
    }

    private static void find(int x, int y) {
      q.add(x);
      q.add(y);
      nhanh.put(x, 1);
      nhanh.put(y, 2);
      thuTu.put(x, 0);
      thuTu.put(y, 0) ;
      
      while(!q.isEmpty()){
          int top =q.poll();
          if(nhanh.get(top) == 1){
              int temp =top-1;
              if(temp > 0)
                  if(check(top, temp) == 1) return ;
              if(top<y){
                  temp =top*2 ;
                  if(check(top, temp) == 1) return ;
              }
          }else{
              int temp =top+1 ;
              if(check(top, temp) ==1 ) return ;
              if(top > x && top %2 == 0){
                  temp =top/2;
                  if(check(top, temp) ==1) return;
              }
          }
      }
    }
}
