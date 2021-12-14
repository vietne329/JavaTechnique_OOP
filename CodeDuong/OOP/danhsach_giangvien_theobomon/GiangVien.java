/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsach_giangvien_theobomon;

import java.util.StringTokenizer;


public class GiangVien {
    private String tenGV ;
    private String tenMh ;
    private String ma ;
    
    public String getTenGV() {
        return tenGV;
    }
    public GiangVien(int id ,String tenGV, String tenMh) {
        this.ma="GV"+String.format("%02d", id) ;
        this.tenGV = tenGV;
        this.tenMh = tenMh;
    }

    public String getTenMh() {
        return tenMh;
    }

    public String getMa() {
        return ma;
    }
   
    @Override
    public String toString(){
        return ma+" "+tenGV+" "+chuanhoa(tenMh) ;
    }
  

    public static String chuanhoa(String tenMh) {
        StringTokenizer str = new StringTokenizer(tenMh) ;
       StringBuilder res = new StringBuilder();
       while(str.hasMoreTokens()){
           String tmp = str.nextToken() ;
           res.append(tmp.toUpperCase().charAt(0)) ;
       }
       return res.toString().trim() ;
    }
    
}
