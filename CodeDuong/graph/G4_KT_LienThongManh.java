
package graph;

import java.util.* ;

public class G4_KT_LienThongManh {
  private static int n ,m ;
  private static ArrayList<Integer> [] dske = new ArrayList[1005];
  private static boolean [] chuaXet = new boolean[1005] ;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
         n=sc.nextInt();
         m=sc.nextInt();
         int s =sc.nextInt();
         
         for(int i =0 ;i <=1000;i++){
             dske[i] =new ArrayList<>();
             chuaXet[i] =true ;
         }
         
         for(int i =1 ;i<= m ;i++){
           int a =  sc.nextInt() ;
           int b =sc.nextInt() ;
           dske[a].add(b); 
         }
         
         boolean check =true ;
         dfs(1);
         for( int i =1 ;i<= n ;i++){
             if(chuaXet[i]) {
                 check =false ;
                 break ;
             }
         }
         
         if(check) System.out.println("YES");
         else System.out.println("NO");
         
    }

    private static void dfs(int i) {
       chuaXet[i] =false ;
       for(Integer x :dske[i]){
           if(chuaXet[x])
               chuaXet[x] =false ;
       }
    }
}
