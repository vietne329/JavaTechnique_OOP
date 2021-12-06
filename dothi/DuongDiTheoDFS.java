import java.util.*;

public class DuongDiTheoDFS {
    static ArrayList<Integer>[] dske = new ArrayList[1001];
    static boolean[] visited = new boolean[1001];
    static String res = "";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int v = sc.nextInt();
            int e = sc.nextInt();
            int start = sc.nextInt();

            for(int i = 1; i <= v; i++){
                dske[i] = new ArrayList<>();
                visited[i] = false;
            }
            ArrayList<Integer> lists = new ArrayList<>();
            for(int i = 1; i <= e; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                lists.add(a);
                lists.add(b);
                dske[a].add(b);
                dske[b].add(a);
            }
            int check = 0;
            for(int i = 0 ; i < lists.size(); i++){
                if(lists.get(i) == start){
                    check = 1;
                }
            }
            if(check==1){
                res = res.concat(""+start);
                dfs(start);
            }else{
                System.out.println("No path");
            }
            res  = "";
        }
    }

    private static void dfs(int start) {
        visited[start] =true;
        for(Integer x : dske[start]){
            if(!visited[x]){
                res  = res.concat(" "+x);
                System.out.println(res);
                visited[x] = true;
                dfs(x);
            }
        }

    }
}
