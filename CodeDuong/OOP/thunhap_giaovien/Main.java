/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thunhap_giaovien;

import java.util.* ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        GiaoVien gv = new GiaoVien(sc.nextLine(),sc.nextLine(),sc.nextInt());
        System.out.println(gv);
    }
}
