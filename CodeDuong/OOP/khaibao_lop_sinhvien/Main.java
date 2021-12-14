/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khaibao_lop_sinhvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.* ;

public class Main {

    
    public static void main(String[] args) throws ParseException  {
            Scanner sc = new Scanner(System.in) ;
        SinhVien sv = new SinhVien(sc.nextLine(),sc.nextLine(), sc.nextLine(), sc.nextFloat()) ;
        System.out.println(sv.toString());
    }


}
