package self_study.dothi;

import java.util.ArrayList;
import java.util.Scanner;

public class DinhThat {
    static ArrayList<Integer>[] road = new ArrayList[109];
    static int v,e,start,end;
    static int[] check = new int[102];
    static int[] mark = new int[102];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            v = sc.nextInt(); e = sc.nextInt(); start = sc.nextInt(); end = sc.nextInt();
            for(int i = 1; i <=100 ; i++){
                road[i] = new ArrayList<>();
            }

            for(int i = 1; i <= e; i++){
                int a = sc.nextInt(), b = sc.nextInt();
                road[a].add(b);
            }

            for(int i = 1; i <= v; i++){
                check[i] =0;
                mark[i]=1;
            }

            check[start] =1;
            Deque_Quaylui(start,end);
            check[start] = 0;
            int count = 0;
            for(int i = 1; i <= v;i++){
                if(i != start && i != end && mark[i] ==1) count++;
            }
            System.out.println(count);

            for(int i = 1; i <=100; i++){
                road[i].clear();
            }

        }
    }

    public static void Deque_Quaylui(int r,int End){
        if(r==End){
            find_similar();
        }
        else{
            for(int i =0; i < road[r].size();i++){
                int v = road[r].get(i);
                if(check[v]==0){
                    check[v] = 1;
                    Deque_Quaylui(v,End);
                    check[v] = 0;
                }
            }
        }
    }

    public static void find_similar(){
        for(int i = 1; i <=v ;i++){
            if(check[i]==1 && mark[i]==1){
                mark[i]=1;
            }
            else{
                mark[i]=0;
            }
        }
    }
}
