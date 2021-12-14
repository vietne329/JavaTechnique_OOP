
package queue;

import java.util.* ;
public class Q_11_So2_UuThe {
    private static boolean check(String s){
        int dem = 0 ;
        for(int i = 0 ;i<s.length() ;i++){
            if(s.charAt(i) == '2') dem ++ ;
        }
        return dem>s.length()/2 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        int t =sc.nextInt();
        while(t -->0){
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("1");
            q.add("2");
            
            int count = 0 ;
            while(!q.isEmpty()){
               String temp =q.poll();
               if(check(temp)){
                   System.out.print(temp+" ");
                   count++ ;
               }
               
               if(count == n ) break ;
               q.add(temp+"0");
               q.add(temp+"1");
               q.add(temp+"2");
            }
               System.out.println();
        }

    }
}
