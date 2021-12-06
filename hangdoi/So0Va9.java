package self_study.hangdoi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class So0Va9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            resolve(n);
        }
    }

    private static void resolve(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("9");
        while(!q.isEmpty()){
            String tmp = q.poll();
            long x = Long.parseLong(tmp);
            if(x % n == 0){
                System.out.println(x);
                break;
            }
            q.add(tmp+"0");
            q.add(tmp+"9");
        }
    }
}
