/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TraCuu_DonHang;

import java.util.* ;

public class DonHang {
    private String ten ;
    private String ma ;
    private String stt;
    private int giamgia ;
    private int soluong ,dongia ;
    private int tong ;

    public DonHang( String ten, String ma, int dongia, int soluong) {
        this.ten = ten;
        this.ma = ma;
        this.stt = ma.substring(1,4);
          int x;
       
        if(this.ma.charAt(4)== '1') { //AC
            x= dongia*soluong*1/2; 
        }
        else{
            x= dongia*soluong*3/10; 
        }
        this.giamgia =x;
        this.dongia = dongia;
        this.soluong = soluong;
        this.tong = soluong*dongia-this.giamgia ;
    }
    

    
    public String toString(){
        return ten+" "+ma+" "+stt+" "+giamgia+" "+tong ;
    }
    
}
