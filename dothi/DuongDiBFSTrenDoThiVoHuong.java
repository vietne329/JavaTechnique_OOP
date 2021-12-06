package self_study.dothi;

import java.util.*;

public class DuongDiBFSTrenDoThiVoHuong {
    static ArrayList<Integer>[] dske = new ArrayList[1002];
    static boolean[] ok = new boolean[1002];
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
                ok[i] = false;
                truoc[i] = 0;
            }

            for(int i = 1 ; i <= e; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                dske[a].add(b);
                dske[b].add(a);
            }

            bfs(start,end);
            Trace(end,start);
            System.out.println();

        }
    }

    public static void bfs(int start, int end) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()){
            int top = q.peek(); q.poll();
            ok[top] = true;
            if(top==end) return;
            for(int i = 0 ; i < dske[top].size();i++){
                if(!ok[dske[top].get(i)]){
                    ok[dske[top].get(i)]= true;
                    truoc[dske[top].get(i)] = top;
                    q.add(dske[top].get(i));
                }
            }
        }
    }

    public static void Trace(int end,int start){
        if(!ok[start]){
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
