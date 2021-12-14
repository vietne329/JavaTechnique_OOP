/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiToan_TuyenSinh;

import java.util.* ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
        ThiSinh ts = new ThiSinh(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), 
                 Float.parseFloat(sc.nextLine()), 
                 Float.parseFloat(sc.nextLine())) ;
        
        System.out.println(ts);
    }
}
