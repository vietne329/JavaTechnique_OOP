package self_study.nganxep;

import java.util.LinkedList;
import java.util.Scanner;

public class SoLocPhatDoiXungChan {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            int n = in.nextInt();
            LinkedList<String> queue = new LinkedList<>();
            queue.add("6");
            queue.add("8");
            int count=0;
            if(n!=0) {
                while (queue.isEmpty() == false) {
                    String str = queue.pop();
                    StringBuilder reverse = new StringBuilder(str);
                    reverse = reverse.reverse();
                    String result = str + reverse;
                    System.out.print(result + " ");
                    count++;
                    String temp1 = str + "6";
                    String temp2 = str + "8";
                    queue.add(temp1);
                    queue.add(temp2);
                    if (count == n) break;

                }
            }
            System.out.println();
        }
    }
}