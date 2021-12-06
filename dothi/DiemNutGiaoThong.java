package self_study.dothi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DiemNutGiaoThong {
    static ArrayList<Integer>[] dske = new ArrayList[1001];
    static boolean[] visited = new boolean[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int v = sc.nextInt();
            int e = sc.nextInt();

            for(int i = 0; i < 1001;i++){
                dske[i] = new ArrayList<>();
                dske[i].clear();
                visited[i] = false;
            }

            for(int i = 1; i <= e;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                dske[a].add(b);
                dske[b].add(a);
            }

            int res = 0;
            for(int i = 1; i <= v;i++){
                if(!visited[i]){
                    res++;
                    DFS(i);
                }
            }

            int count_all=0;
            ArrayList<Integer> lists = new ArrayList<>();
            for(int i = 1; i<= v;i++){
                Arrays.fill(visited, false);
                visited[i]= true;
                int dem = 0 ;
                for(int j = 1; j <=v; j++){
                    if(!visited[j]){
                        dem++;
                        DFS(j);
                    }
                }
                if(dem>res) {
                    count_all++;
                    lists.add(i);
                }
            }

            System.out.println(count_all);
            for (Integer x: lists) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static void DFS(int u){
        visited[u] = true;
        for(int i = 0; i < dske[u].size(); i++){
            if(!visited[dske[u].get(i)]){
                DFS(dske[u].get(i));
            }
        }
    }


}
