/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxep_donhang;

import java.util.* ;

public class DonHang implements Comparable<DonHang>{
    private String tenhang ;
    private String madh ;
    private String stt ;
    private int giamgia ;
    private int dongia  ,soluong,tong;

    public DonHang(String tenhang, String madh, int dongia, int soluong) {
        this.tenhang = tenhang;
        this.madh = madh;
        this.stt = madh.substring(1, 4);
        
        String a = madh.substring(4) ;
        int giamgia = 0;
        if(a.charAt(0)== '1') {
            giamgia = dongia*soluong*1/2 ;
        }else giamgia =dongia*soluong*3/10 ;
        
        this.giamgia = giamgia;
        this.dongia = dongia;
        this.soluong = soluong;
        this.tong = dongia*soluong-giamgia;
    }
    
    @Override
    public String toString(){
        return tenhang+" "+madh+" "+stt+" "+giamgia+" "+tong ;
        
    }

    @Override
    public int compareTo(DonHang o) {
        return this.stt.compareTo(o.stt) ;
    }
    
    
    
}
