package self_study.dothi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class BieuDienDoThiCoHuong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0){

            ArrayList<Integer>[] ke = new ArrayList[1001];

            int vertices = sc.nextInt();
            int edges = sc.nextInt();

            for(int i = 1; i <= vertices; i++){
                ke[i] = new ArrayList<>();
            }

            for(int i = 1 ; i<= edges; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                ke[a].add(b);
            }

            for(int i = 1; i <= vertices; i++){
                ke[i].sort(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1 - o2;
                    }
                });
            }

            for(int i = 1; i <= vertices; i++){
                System.out.print(i+":");
                for(int j = 0 ; j < ke[i].size(); j++){
                    System.out.print(" "+ke[i].get(j));
                }
                System.out.println();
            }
        }
    }
}
