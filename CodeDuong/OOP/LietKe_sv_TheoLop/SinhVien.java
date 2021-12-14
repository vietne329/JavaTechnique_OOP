/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LietKe_sv_TheoLop;

import java.util.* ;
public class SinhVien  {
    private String ma ;
    private String hoten ;
    private String lop;
    private String mail ;

    public SinhVien(String ma, String hoten, String lop, String mail) {
        this.ma = ma;
        this.hoten = hoten;
        this.lop = lop;
        this.mail = mail;
    }



    public String getLop() {
        return lop;
    }

  
    
    @Override 
    public String toString(){
        return ma+" "+hoten+" "+lop+" "+mail ;
    }

}
