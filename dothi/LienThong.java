package self_study.dothi;

import java.util.ArrayList;
import java.util.Scanner;

public class LienThong {
    static ArrayList<Integer>[] dske = new ArrayList[1001];
    static boolean[] chuaxet = new boolean[1001];
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int v = sc.nextInt(), e = sc.nextInt();
        int start = sc.nextInt();

        for(int i = 0 ; i <= v; i++){
            dske[i] = new ArrayList<>();
            chuaxet[i] = true;
        }
        for(int i = 1 ; i <= e; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            dske[a].add(b);
            dske[b].add(a);
        }

        dfs(start);
        int count = 0;
        for (int i = 1 ; i< chuaxet.length; i++){
            if(chuaxet[i]){
                count++;
                System.out.println(i);
            }
        }
        if(count == 0){
            System.out.println(0);
        }
    }

    private static void dfs(int start) {
        chuaxet[start] = false;
        for(Integer x : dske[start]){
            if(chuaxet[x]) dfs(x);
        }
    }
}
