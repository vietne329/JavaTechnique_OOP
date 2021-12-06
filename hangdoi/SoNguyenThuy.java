package self_study.hangdoi;

import java.util.*;

public class SoNguyenThuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0){
            int n = Integer.parseInt(sc.nextLine());
            solve(n);
        }
    }

    private static void solve(int n) {
        int count = 0;
        List<String> list = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("4");
        queue.add("5");
        while (!queue.isEmpty()){
            String tmp = queue.poll();
            if(tmp.length() <= n){
                count++;
                list.add(tmp);
                queue.add(tmp+"4");
                queue.add(tmp+"5");
            }
        }

        System.out.println(count);
        for(int i = list.size()-1; i >=0 ;i--){
            System.out.print(list.get(i)+" ");
        }

        System.out.println();
    }
}
