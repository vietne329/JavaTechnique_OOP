/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinhTien;

import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int n = sc.nextInt() ;
        ArrayList<SanPham> list = new ArrayList<>();
        
        while(n -- >0 ){
            sc.nextLine() ;
            SanPham sp = new SanPham(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextLong(),sc.nextLong() );
            list.add(sp);
        }
        Collections.sort(list);
        
        for(SanPham sp: list){
            System.out.println(sp);
        }
    }
            
}
