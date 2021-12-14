
package graph;

import java.util.* ;

public class G_10_DSKeSangDSCanh {
   private static ArrayList<Integer>[] dske =new ArrayList[1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =Integer.parseInt(sc.nextLine());
       for(int i= 1;i<=t;i++){
           dske[i]= new ArrayList<>();
           String s =sc.nextLine();
        
           s =s.trim() ;
           s.replaceAll("\\s+", " ") ;
            int num = 0 ;
            for(int j = 0 ; j<s.length() ;j++){
                if(s.charAt(j) != ' '){
                 num =10*num + (int)s.charAt(j) - '0';
                if(j == s.length() -1){
                    dske[i].add(num) ;
                   
                }
            }else{
                   dske[i].add(num);
                    num = 0;
                    }
               
            }
        }
        
       for(int i = 1;i<=t ;i++){
           dske[i].sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 -o2 ;
                }
            });
        }
        
        int[][] d =new int[1001][1001];
        
        for(int i =1 ;i<=t;i++){
            for(int j = 0 ; j <dske[i].size();j++){
                if(d[i][dske[i].get(j)] == 0 && d[dske[i].get(j)][i]==0){
                    System.out.print(i+" "+dske[i].get(j));
                System.out.println();
                d[i][dske[i].get(j)] = d[dske[i].get(j)][i] =1;
            }
            
        }
    }
    }
}
