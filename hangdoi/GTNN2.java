package self_study.hangdoi;

import java.util.PriorityQueue;
import java.util.Scanner;

public class GTNN2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(5, (o1, o2) -> {
            if (o1 > o2) {
                return -1;
            } else if (o1 < o2) return 1;
            return 0;
        });
        while (t-- > 0) {
            int n = in.nextInt();
            in.nextLine();
            String temp = in.nextLine();
            int[] a = new int[32];
            for (int i = 0; i < temp.length(); i++) {
                a[temp.charAt(i) - 'A']++;
            }
            for (int i = 0; i < 32; i++) {
                if (a[i] != 0) pq.add(a[i]);
            }
            while (!pq.isEmpty() && n > 0) {
                n--;
                int number = pq.poll();
                number--;
                pq.add(number);
            }
            long result = 0;
            while (!pq.isEmpty()) {
                int temp2 = pq.poll();
                result += (long) temp2 * temp2;
            }
            System.out.println(result);
        }
    }
}
