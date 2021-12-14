
package graph;

import java.util.* ;

public class G_11_BDDoThiCoHuong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        while(n -- >0){
           int v =sc.nextInt();
           int e =sc.nextInt();
           int [][] input =new int[v+1][e+1];
           while(e -->0){
              int a = sc.nextInt();
              int b =sc.nextInt();
              input[a][b] =1;
           }
           
           for(int i = 1;i<v+1 ;i++){
               ArrayList<Integer> ke = new ArrayList<>();
               for(int j =1;j<v+1;j++){
                   if(input[i][j] ==1)
                       ke.add(j);
               }
               System.out.print(i+":");
               for(int j=0 ;j<ke.size();j++){
                   System.out.print(" "+ke.get(j));
           }
               System.out.println();
           }
           
           
        }
    }
     
}
