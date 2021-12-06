package self_study.dothi;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
    static ArrayList<Integer>[] dske = new ArrayList[1001];
    static boolean[] chuaxet = new boolean[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int v = sc.nextInt();
            int e = sc.nextInt();
            int s = sc.nextInt();

            for(int i = 1 ; i <= v;i++){
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
            }

            for(int i = 1 ; i <= e; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                dske[a].add(b);
                dske[b].add(a);
            }
            dfs(s);
            System.out.println();

        }

    }

    private static void dfs(int s) {
        System.out.print(s+" ");
        chuaxet[s] = false;
        for(Integer v : dske[s]){
            if(chuaxet[v]) dfs(v);
        }
    }

}
