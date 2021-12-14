/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxep_donhang;

import java.util.* ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        ArrayList<DonHang> list = new ArrayList<>() ;
        while(n-- > 0) {
            sc.nextLine();
            DonHang dh = new DonHang(sc.nextLine(), sc.nextLine(), sc.nextInt(),sc.nextInt()) ;
            list.add(dh);
        }
        Collections.sort(list);
        
        for(DonHang dh:list){
            System.out.println(dh);
        }
    }
}
