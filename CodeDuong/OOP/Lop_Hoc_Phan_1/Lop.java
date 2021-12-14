/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lop_Hoc_Phan_1;

public class Lop implements Comparable<Lop>{
    private String ma ;
    private String tenmh ;
    private String nhom ;
    private String tengv ;

    public Lop(String ma, String tenmh, String nhom, String tengv) {
        this.ma = ma;
        this.tenmh = tenmh;
        this.nhom = nhom;
        this.tengv = tengv;
    }

    public String getTenmh() {
        return tenmh;
    }

    public String getNhom() {
        return nhom;
    }

    public String getTengv() {
        return tengv;
    }

    @Override
    public int compareTo(Lop o) {
      return this.nhom.compareTo(o.nhom) ;
    }

    public String getMa() {
        return ma;
    }
    
    
    
    
    
    
}
