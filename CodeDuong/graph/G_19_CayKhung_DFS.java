
package graph;

import java.util. * ;
public class G_19_CayKhung_DFS {
    private static int n , m ;
    private static boolean  ok ;
    private static ArrayList<Integer> dske[] =new ArrayList[1001];
    private static boolean chuaXet[] =new boolean[1001];
    private static int[] truoc =new int[1001];
    private static Stack<Integer> dsLuu ;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int test =sc.nextInt();
        
       while(test-- >0){
           dsLuu =new Stack<>();
           Stack<String> dsLuu2 =new Stack<>();
           ok =false ;
           n =sc.nextInt() ;
           m=sc.nextInt();
           int s =sc.nextInt();
           
           for(int i=1;i<= n;i++){
               dske[i] =new ArrayList<>();
               chuaXet[i] =true ;
               truoc[i] = 0 ;
           }
           
           for(int j =1;j <= m ;j++){
               int u =sc.nextInt();
               int v =sc.nextInt();
               dske[u].add(v);
               dske[v].add(u) ;
           }
           
           dfs(s);
           for(int i=1 ;i<=n;i++){
               if(chuaXet[i]){
                   ok =true ;
                   break ;
               }
           }
           
          if(ok) System.out.println("-1");
          else{
              while(dsLuu.size() >1){
                  String tmp ="";
                  tmp = tmp + truoc[dsLuu.peek()]+" "+dsLuu.pop();
                  dsLuu2.add(tmp);
              }
              while(!dsLuu2.empty()){
                  System.out.println(dsLuu2.pop());
              }
          }
       }
    }

    private static void dfs(int i) {
        chuaXet[i] =false ;
        dsLuu.add(i) ;
        
        for(Integer x :dske[i]){
            if(chuaXet[x]){
                truoc[x] = i;
                dfs(x);
            }
        }
    }
}
