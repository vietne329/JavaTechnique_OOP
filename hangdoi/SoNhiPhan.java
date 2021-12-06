package self_study.hangdoi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoNhiPhan {
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
        q.add("1");
        while(n-->0){
            String tmp = q.poll();
            System.out.print(tmp+" ");
            q.add(tmp+"0");
            q.add(tmp+"1");
        }
        System.out.println();
    }
}
