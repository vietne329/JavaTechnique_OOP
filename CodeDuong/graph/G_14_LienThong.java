
package graph;
import java.util.* ;

public class G_14_LienThong {
    private static boolean [] chuaXet =new boolean[300];
    private static List<Integer>[] dske =new List[300];
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int t =sc.nextInt();
        
        for(int i = 0 ;i<= n ;i++){
            dske[i] = new ArrayList<>();
            chuaXet[i] =true ;
        }
        
        for (int i = 1; i <= m; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            dske[u].add(v);
            dske[v].add(u);
        }
        dfs(t);
        
        boolean check = false ;
        for(int i =1;i<= n ;i++){
            if(chuaXet[i]){
                check =true;
                System.out.println(i);
            }
        }
        if(!check) System.out.println(0);
    }
    
    private static void dfs(int i){
        for(Integer v :dske[i]){
            if(chuaXet[v]){
                chuaXet[v] =false;
                dfs(v);
            }
        }
    }
}
