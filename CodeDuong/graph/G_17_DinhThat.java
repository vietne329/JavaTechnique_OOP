
package graph;
import java.util.* ;

public class G_17_DinhThat {
   private static int v,e,start,end ;
   private static int [] check = new int[102];
   private static int [] mark=new int[102];
   private static ArrayList<Integer>[] road = new ArrayList[109];
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t -- >0){
            v =sc.nextInt();
            e =sc.nextInt();
            start =sc.nextInt();
            end =sc.nextInt();
            for(int i =1 ;i<=100;i++){
                road[i] = new ArrayList<>();
            }
            
            for(int i =1;i<=e ;i++){
                int a =sc.nextInt(),b=sc.nextInt() ;
                road[a].add(b);
            }
            
            for(int i =1;i<=v;i++){
                check[i] = 0;
                mark[i] =1;
            }
            
            check[start] =1 ;
            Dequy_QuayLui(start,end) ;
            check[start] = 0;
            int count = 0;
            for(int i=1;i<=v;i++){
                if(i!= start && i!=end &&mark[i] == 1) count ++ ;
            }
            System.out.println(count);
            
            for(int i =1 ;i<=100 ;i++){
                road[i].clear();
            }
        }
    }

    private static void Dequy_QuayLui(int r, int end) {
      if(r ==end){
          find_similar();
      }else{
          for(int i = 0 ;i< road[r].size();i++){
              int v =road[r].get(i);
              if(check[v] ==0){
                  check[v] =1 ;
                  Dequy_QuayLui(v, end);
                  check[v] =0;
              }
          }
      }
    }

    private static void find_similar() {
      for(int i =1 ;i<= v ;i++){
          if(check[i] ==1 & mark[i] ==1){
              mark[i] =1 ;
          }else{
              mark[i] = 0;
          }
      }
    }
}
