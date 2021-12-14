
package basic_programming;

import java.util.Scanner;

public class B_30_DanhDauChuCai {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in) ;
         String s = scanner.next() ;
         System.out.println(s.chars().distinct().count());
     }
}
