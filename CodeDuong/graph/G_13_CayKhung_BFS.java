
package graph;

import java.util.* ;

public class G_13_CayKhung_BFS {
   private static int n, m;
    private static ArrayList<Integer>[] dske = new ArrayList[1005];
    private static boolean chuaXet[] = new boolean[1005];
    private static boolean ok;
    private static Stack<Integer> dsLuu;
    private static int[] truoc = new int[1005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            int s = sc.nextInt();
            dsLuu = new Stack<>();
            ok = true;
            Stack<String> dsLuu2 = new Stack<>();


            for (int i = 1; i <= n; i++) {
                dske[i] = new ArrayList<>();
                truoc[i] = 0;
                chuaXet[i] = true;
            }

            for (int i = 1; i <= m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                dske[u].add(v);
                dske[v].add(u);
            }

            bfs(s);
            for (int i = 1; i <= n; i++) {
                if (chuaXet[i]) {
                    ok = false;
                    break;
                }
            }

            if (ok == false) System.out.println(-1);
            else {
                while (!dsLuu.isEmpty()) {
                    String tmp = truoc[dsLuu.peek()] + " " + dsLuu.peek();
                    dsLuu.pop();
                    dsLuu2.add(tmp);
                }
                while (!dsLuu2.isEmpty()) {
                    System.out.println(dsLuu2.peek());
                    dsLuu2.pop();
                }
            }
        }
    }

    private static void bfs(int s) {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        chuaXet[s] = false;

        while (!q.isEmpty()) {
            int v = q.poll();
            for (Integer x : dske[v]) {
                if (chuaXet[x]) {
                    truoc[x] = v;
                    chuaXet[x] = false;
                    q.add(x);
                    dsLuu.add(x);
                }
            }
        }
    }
    
}
