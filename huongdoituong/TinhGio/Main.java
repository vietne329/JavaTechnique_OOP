package self_study.huongdoituong.TinhGio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Gamer> quanlist = new ArrayList<>() ;
        Scanner sc = new Scanner(System.in) ;
        int n =sc.nextInt() ;
        while(n-->0){
            String id =sc.next() ;
            sc.nextLine() ;
            String name = sc.nextLine() ;
            String in =sc.next();
            String out =sc.next() ;

            Gamer qn = new Gamer(id, name, in, out) ;
            quanlist.add(qn);
        }

        quanlist.sort(Collections.reverseOrder());
        for(Gamer q : quanlist){
            System.out.println(q);
        }
    }
}
