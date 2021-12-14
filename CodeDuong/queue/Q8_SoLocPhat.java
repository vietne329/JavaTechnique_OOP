
package queue;
import java.util.* ;
public class Q8_SoLocPhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            int n = Integer.parseInt(in.nextLine());
            xuLy(n);
        }
    }

    private static void xuLy(int n) {
      Queue<String> q = new LinkedList<>();
      ArrayList<String> list = new ArrayList<>();
      q.add("6");
      q.add("8");
      while(!q.isEmpty()){
          String tmp =q.poll() ;
          if(tmp.length() > n) break;
          list.add(tmp);
          q.add(tmp+"6");
          q.add(tmp+"8");
          
      }
      
        System.out.println(list.size());
        list.stream().sorted((o1,o2)->{
            if(Long.parseLong(o1)> Long.parseLong(o2))
                return -1;
            return 1 ;
        }).forEach(o -> System.out.print(o+" "));
        
        System.out.println();
    }
}
