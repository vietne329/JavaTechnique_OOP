
package graph;

import java.util.*;
public class G_15_DuongDi_DFS_VoHuong {
    private static int n ,m ;
    private static ArrayList<Integer>[] dske = new ArrayList[1005];
    private static boolean chuaXet[] =new boolean[1005];
    private static int truoc[];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int test = sc.nextInt();
        while(test -- >0){
            n=sc.nextInt();
            m =sc.nextInt();
            int s =sc.nextInt();
            int t =sc.nextInt();
            truoc = new int[1005];
            for(int i= 0;i<=n;i++){
                dske[i] = new ArrayList<>();
                chuaXet[i] = true ;
                truoc[i]= 0 ;
            }
            
            for(int i =1;i<=m;i++){
                int u =sc.nextInt();
                int v= sc.nextInt();
                dske[u].add(v);
                dske[v].add(u);
            }
            
            dfs(s);
            if(chuaXet[t] ) System.out.println("-1");
            else{
                Stack<Integer> st =new Stack();
                st.push(t);
                while(st.peek()!= s){
                    st.push(truoc[st.peek()]);
                }while(!st.isEmpty()){
                    System.out.print(st.pop()+" ");
                }
            }
            System.out.println();
        }
    }
    
    private static void dfs(int s){
        chuaXet[s] =false;
        for(Integer x :dske[s]){
            if(chuaXet[x]){
                truoc[x] =s ;
                dfs(x);
            }
        }
    }
}
