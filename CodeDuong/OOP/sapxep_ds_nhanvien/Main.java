/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxep_ds_nhanvien;

import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws ParseException {
       Scanner in = new Scanner(System.in) ;
       ArrayList<NhanVien> ds =new ArrayList<>();
       int n  =in.nextInt() ;
       in.nextLine() ;
       for(int i =1 ;i<n +1 ;i++){ 
           NhanVien nv = new NhanVien(i ,in.nextLine(), in.nextLine(),in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine())  ;//00001
           
           ds.add(nv);
         
       }
       Collections.sort(ds);
       
     for(NhanVien item : ds){
         System.out.println(item);
     }
    }
}
