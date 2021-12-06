package self_study.dothi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    static ArrayList<Integer>[] dske = new ArrayList[1001];
    static boolean[] chuaxet = new boolean[1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int v = sc.nextInt();
            int e = sc.nextInt();
            int s = sc.nextInt();

            for(int i = 1; i <= v ; i++){
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
            }
            for(int i = 1; i <= e ; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                dske[a].add(b);
                dske[b].add(a);
            }
            bfs(s);
            System.out.println();
        }

    }

    private static void bfs(int s) {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        chuaxet[s] = false;
        while(!q.isEmpty()){
            int v = q.poll();
            System.out.print(v+" ");
            for(Integer x : dske[v]){
                if(chuaxet[x]) {
                    q.add(x);
                    chuaxet[x] = false;
                }
            }

        }
    }
}
