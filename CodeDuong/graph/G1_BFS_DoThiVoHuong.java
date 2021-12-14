
package graph;

import java.util.* ;

public class G1_BFS_DoThiVoHuong {
 private static int n ,m ;
 private static ArrayList<Integer>[] dske = new ArrayList[1001];
 private static boolean [] chuaXet = new boolean[1001];
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt();
        while(t -->0){
            n=sc.nextInt();
            m=sc.nextInt();
            int s= sc.nextInt();
            
            for(int i =1;i<=n ;i++){
                dske[i] =new ArrayList<>();
                chuaXet[i] =true ;
            }
            
            for(int i =1 ;i<= m;i++){
                int a =sc.nextInt() ;
                int b=sc.nextInt();
                dske[a].add(b);
                dske[b].add(a);
            }
            
            bfs(s);
            System.out.println();
        }
    }

    private static void bfs(int s) {
       Queue<Integer> q= new LinkedList<>();
       q.add(s) ; chuaXet[s] =false ;
       while(!q.isEmpty()){
           int v =q.poll() ;
           System.out.print(v+" ");
           for(Integer x : dske[v]){
               if(chuaXet[x]) {
                   q.add(x);
                   chuaXet[x] =false ;
               }
           }
       }
    }

 }
