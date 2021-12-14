
package ThongKe_TuKhacNhau;

import java.util.*;
public class WordSet {
    private TreeSet<String> set =new TreeSet<>();

    public WordSet(Scanner input) {
        while(input.hasNext()){
            set.add(input.next().toLowerCase());
        }
    }

    public String toString() {
       String kq ="";
       for(String s :set) kq=kq+ s+"\n" ;
       return kq ;
    }

}
