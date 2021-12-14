/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhanSo;

import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        long a = sc.nextLong() ;
        long b  = sc.nextLong() ;
        RutGon rg = new RutGon(a, b) ;
        rg.rutGon();
        System.out.println(rg );
    }
}
