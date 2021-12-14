
package stack;
import java.util.* ;
public class S_12_NoiDay {
      static int mod = (int) 1e9 + 7;

    public static void main(String[] args) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            while (n-- > 0){
                pq.add(in.nextLong());
            }
            long result = 0;
            while (pq.size() > 1) {
                long num1 = pq.poll();
                long num2 = pq.poll();
                pq.add(num1 + num2);
                result += num1 + num2;
            }
            pq.poll();
            System.out.println(result % mod);
        }
    }
}
