/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TraCuu_DonHang;

import java.util.* ;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in) ;
    int t = sc.nextInt();
    ArrayList<DonHang> list = new ArrayList<>();
        while(t-->0){
            sc.nextLine();
               
            DonHang dh = new DonHang(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()) ;
          
            list.add(dh);
        }
        
        for(DonHang item :list){
            System.out.println(item);
        }
    }
}
