
package graph;
import java.util.*;
public class G3_DemSo_TPLienThong {
 private static int n , m ;
 private static ArrayList<Integer> []dske =new ArrayList[1005];
 private static boolean [] chuaXet =new boolean[1005];
 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt() ;
        while(t -- >0 ){
            n =sc.nextInt();
            m =sc.nextInt();
            
            for(int i = 0 ;i<1000 ;i++){
                dske[i] =new ArrayList<>();
                chuaXet[i] =true ;
            }
            for(int i = 1;i<= m ;i++){
                int a =sc.nextInt();
                int b =sc.nextInt();
                dske[a].add(b);
                dske[b].add(a);
            }
            
            int dem = 0 ;
            for(int  i = 1 ;i<= n ;i++){
                if(chuaXet[i]){
                    dem++ ;
                    dfs(i);
                }
            }
            System.out.println(dem);
        }
    }

    private static void dfs(int i) {
        chuaXet[i] =false ;
        for(Integer x : dske[i]){
            if(chuaXet[x]) dfs(x) ;
        }
    }
    
}
