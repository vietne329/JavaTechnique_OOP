package self_study.hangdoi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class So2UuThe {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();;
        while(t-->0){
            int n = sc.nextInt();
            resolve(n);
        }
    }

    private static void resolve(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("0");
        q.add("1");
        q.add("2");
        while(!q.isEmpty() && n > 0){
            String tmp = q.poll();
            if(check(tmp)){ System.out.print(tmp+" ");
                n--;
            }
                q.add(tmp+"0");
                q.add(tmp+"1");
                q.add(tmp+"2");
        }
        System.out.println();

    }

    private static boolean check(String tmp) {

        if(tmp.charAt(0)=='0'){
            return false;
        }

        int count =0;
        for(int i = 0 ; i < tmp.length(); i++){
            if(tmp.charAt(i)=='2') count++;
        }
        if(count>tmp.length()/2) return true;
        else return false;
    }
}
