/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tinh_Gio;

import java.util.* ;

public class Main {
    public static void main(String[] args) {
        ArrayList<QuanNet> quanlist = new ArrayList<>() ;
        Scanner sc = new Scanner(System.in) ;
        int n =sc.nextInt() ;
        while(n-->0){
          
            String id =sc.next() ;
            sc.nextLine() ;
            String name = sc.nextLine() ;
            String in =sc.next();
            String out =sc.next() ;
            
            QuanNet qn = new QuanNet(id, name, in, out) ;
            quanlist.add(qn);
        }
        
        quanlist.sort(Collections.reverseOrder());
        for(QuanNet q : quanlist){
            System.out.println(q);
        }
    }
}
