
package graph;

import java.util.*;
public class G8_KiemTra_ChuTrinh {
 private static int n , m ;
 private static ArrayList<Integer> dske [] = new ArrayList[1001];
 private static boolean ok ;
 private static boolean chuaXet[] = new boolean[1001];
 private static int truoc[] = new int[1001];
 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt();
        while(t -->0){
            n =sc.nextInt();
            m=sc.nextInt();
            ok =false ;
            for(int i =0;i<=n;i++){
                dske[i] =new ArrayList<>();
                chuaXet[i] =true;
            }
            
            for(int i=1 ;i<= m;i++){
                int u =sc.nextInt();
                int v =sc.nextInt() ;
                dske[u].add(v);
                dske[v].add(u) ;
            }
            
            for(int i =1;i<= n ;i++){
               if(chuaXet[i]){
                    if(bfs(i)){
                    ok =true;
                    break;
                }
               }
            }
            
            if(ok ) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static boolean bfs(int i) {
        Queue<Integer> q =new LinkedList<>();
           q.add(i);chuaXet[i] =false;
          while(!q.isEmpty()){
              int v =q.poll();
              for(Integer x : dske[v]){
                  if(chuaXet[x]){
                    chuaXet[x] =false ;
                    q.add(x);
                    truoc[x] =v ;
                  }
                  else if(x!= truoc[v]) return true ;
              }
          }
          return false ;
    }
}
