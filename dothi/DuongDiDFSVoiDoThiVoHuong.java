package self_study.dothi;

import java.util.*;

public class DuongDiDFSVoiDoThiVoHuong {
    static ArrayList<Integer>[] dske = new ArrayList[1002];
    static boolean[] chuaxet = new boolean[1002];
    static int[] truoc = new int[1002];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int v = sc.nextInt();
            int e = sc.nextInt();
            int start = sc.nextInt();
            int end = sc.nextInt();

            for(int i = 1 ; i <= 1001; i++){
                dske[i] = new ArrayList<>();
                dske[i].clear();
                chuaxet[i] = false;
                truoc[i] = 0;
            }

            for(int i = 1 ; i <= e; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                dske[a].add(b);
                dske[b].add(a);
            }

            dfs(start,end);
            Trace(end,start);
            System.out.println();

        }
    }

    public static void dfs(int start, int end) {
        if(chuaxet[end]) return;
        chuaxet[start] = true;
        for(int i = 0 ; i < dske[start].size();i++){
            if(!chuaxet[dske[start].get(i)]){
                truoc[dske[start].get(i)] = start;
                dfs(dske[start].get(i),end);
            }
        }
    }

    public static void Trace(int end,int start){
        if(!chuaxet[start]){
            System.out.print(-1);
            return;
        }
        Stack<Integer> stack = new Stack<>();
        while(start != end){
            stack.push(end);
            end = truoc[end];
        }
        stack.push(start);
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }

}
