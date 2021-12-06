package self_study.dothi;

import java.util.*;

public class DuongDiCoHuong {
    static ArrayList<Integer>[] dske = new ArrayList[1001];
    static boolean[] chuaxet = new boolean[1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int v = sc.nextInt();
            int e = sc.nextInt();
            int start = sc.nextInt();
            int end = sc.nextInt();

            for(int i = 1; i <= v; i++){
                dske[i] = new ArrayList<>();
                chuaxet[i] = true;
            }

            for(int i = 1; i <= e; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                dske[a].add(b);
            }

            bfs(start,end);
            System.out.println();

        }
    }

    private static void bfs(int start, int end) {
        int check_num = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        String kq = "";
        chuaxet[start] = false;
        while(!q.isEmpty()){
            int v = q.poll();
            if(v!=end){
                kq = kq.concat(v+" -> ");
                check_num = v;
            }else{
                kq = kq.concat(v+"");
                check_num = v;
                System.out.print(kq);
                break;
            }

            if(dske[v].size() > 1){
                for(int i = 0 ; i < dske[v].size(); i++){
                    if(dske[v].get(i) == end){
                        q.add(end);
                        chuaxet[dske[v].get(i)] = false;
                        break;
                    }
                }

            }else{
                for(Integer x : dske[v]){
                    if(chuaxet[x]){
                        q.add(x);
                        chuaxet[x] = false;
                    }
                }
            }
        }


        if(check_num != end){
            System.out.print("-1");
        }

    }


}
