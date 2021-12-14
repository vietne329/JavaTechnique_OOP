/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LietKe_sv_TheoNganh;


public class SinhVien {
   private String ma ;
   private String hoten ;
   private String lop ;
   private String email ;

    public SinhVien(String ma, String hoten, String lop, String email) {
        this.ma = ma;
        this.hoten = hoten;
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    

@Override
    public String toString(){
    return  ma+" "+hoten+" "+lop+" "+email ;
}
   
}
