
package basic_programming;
import java.util.* ;
public class B_10_DiaChi_Email {
    public static List<String> list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            System.out.println(chuanHoa(in.nextLine()));

        }
    }
    public static String chuanHoa(String s) {
        s=s.trim().toLowerCase();
        s=s.replaceAll("\\s", " ");
        String[] temp = s.split(" ");
        String ten = temp[temp.length-1];String ho = "";
        for(int i= 0 ; i<temp.length-1;i++){
            ho += temp[i].charAt(0);
        }
        
        if(list.contains(ten+ho)){
            int d =1;
            for(int i= 0;i<list.size();i++)
                if(list.get(i).equals(ten+ho)) d++ ;
                list.add(ten+ho);
                return ten+ho+d+"@ptit.edu.vn";
            
        }
        else{
            list.add(ten+ho);
            return ten+ho+"@ptit.edu.vn";
        }
      
    }
}
