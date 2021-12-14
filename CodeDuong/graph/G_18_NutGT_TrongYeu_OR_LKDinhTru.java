
package graph;
import java.util.* ;
public class G_18_NutGT_TrongYeu_OR_LKDinhTru {
   private static int count = 0;
   private static int[] isVisited;
   private static Vector<Integer>[] vectors ;
   private static ArrayList<Integer> result ;
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int test =sc.nextInt();
        int  v,e,u,x ;
     
  while(test -- >0){
            v=sc.nextInt();
            e =sc.nextInt();
            vectors =new Vector[v+1];
            result =new ArrayList<>();
            for(int i = 0 ;i<=v;i++){
                vectors[i] = new Vector<>();
            }
            for(int i =1;i<=e;i++){
                u=sc.nextInt();
                x=sc.nextInt();
                vectors[u].add(x);
                vectors[x].add(u);
            }
            isVisited =new int[v+1];
            for(int i =1;i<=v;i++){
                isVisited[i] =1;
                count =1;
                if(i ==1) DFS(2);else DFS(1);
                if(count<v) result.add(i);
                isVisited=new int[v+1];
            }
//            System.out.println(result.size());
            for(int i :result){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }


    private static void DFS(int i) {
       for(int x :vectors[i]){
           if(isVisited[x] ==0){
               ++count;
           isVisited[x] =1 ;
           DFS(x);
           }
       }
    }
}
