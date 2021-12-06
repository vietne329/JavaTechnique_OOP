package self_study.dothi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DemThanhPhanLienThong {
    static ArrayList<Integer>[] dske = new ArrayList[20001];
    static boolean[] visited = new boolean[20001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            int v = sc.nextInt();
            int e = sc.nextInt();

            for(int i = 0; i < 20001;i++){
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
                System.out.println(dem);
            }


            System.out.println();


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
