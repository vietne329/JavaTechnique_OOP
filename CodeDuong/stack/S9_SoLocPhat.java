
package stack;

import java.util.*;
public class S9_SoLocPhat {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            int n = Integer.parseInt(in.nextLine());
            xuLy(n);
        }
    }

    private static void xuLy(int n) {
        Stack<String> kq = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("6");
        queue.add("8");
        while (!queue.isEmpty()) {
            String s = queue.poll();
            if (s.length() > n) break;
            kq.add(s);
            queue.add(s + "6");
            queue.add(s + "8");
        }
        System.out.println(kq.size());
        while (!kq.isEmpty()) {
            System.out.print(kq.pop() + " ");
        }
        System.out.println();
    }   
}
