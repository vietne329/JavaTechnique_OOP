package graph;

import java.util.* ;

public class G7_DuongDiCoHuong {
 private static int n,m;
 private static List<Integer>[] dske =new List[1005];
 private static boolean [] chuaXet =new boolean[1005];
 private static int truoc[] =new int [1005] ;
 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in ) ;
        int t =sc.nextInt();
        while(t --> 0){
            n =sc.nextInt() ;
            m=sc.nextInt() ;
            int  u =sc.nextInt() ;
            int v =sc.nextInt();
            
            for(int i = 0 ; i<= n;i++){
                dske[i] =new ArrayList<>() ;
                chuaXet[i] =true ;
                truoc[i] = 0;
            }
            
            for(int i =1 ;i<= m;i++){
                int a =sc.nextInt() ;
                int b =sc.nextInt() ;
                dske[a].add(b) ;
            }
            
            bfs(u) ;
            if(chuaXet[v]) 
                System.out.println("-1");
            else{
                Stack<Integer> st =new Stack<>();
                st.push(v);
                while(st.peek() != u) 
                    st.push(truoc[st.peek()]);
                while(!st.isEmpty()){
                    if(st.peek()!= v) 
                        System.out.print(st.pop()+"->");
                    else
                        System.out.print(st.pop());
                }
            }
            System.out.println();
        }
    }

    private static void bfs(int u) {
       Queue<Integer> q =new LinkedList<>();
       q.add(u);
       while(!q.isEmpty()){
              int v=q.poll();
            for(Integer x : dske[v]){
           if(chuaXet[x]){
               q.add(x) ;
               chuaXet[x] =false ;
               truoc[x] =v ;
               
           }
       }
       }
      
    }
}
