import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSTrenDoThiVoHuong {
    static ArrayList<Integer>[] dske = new ArrayList[1001];
    static boolean[] visited = new boolean[1001];
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
            for(int i = 1; i <= e; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                dske[a].add(b);
                dske[b].add(a);
            }

            bfs(start);
            System.out.println();
        }
    }

    private static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        String res= "";
        res = res.concat("BFS("+start+") = ");
        while(!q.isEmpty()){
            int index = q.poll();
            visited[index]= true;
            res = res.concat(""+index+" -> ");
            for (int i = 0; i < dske[index].size(); i++) {
                if(!visited[dske[index].get(i)]){
                    visited[dske[index].get(i)]=true;
                    q.add(dske[index].get(i));
                }
            }
        }
        for(int i =0 ; i < res.length()-4;i++){
            System.out.print(res.charAt(i));
        }
    }
}
