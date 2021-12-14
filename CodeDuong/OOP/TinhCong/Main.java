/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinhCong;

import java.util.* ;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in) ;
     
        
       
            TinhCong tc = new TinhCong(1,scanner.nextLine(), scanner.nextInt(),  
                    scanner.nextInt(), scanner.next()) ;
       
   
        System.out.println(tc.toString());
      
    }
}
