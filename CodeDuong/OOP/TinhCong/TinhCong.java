/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinhCong;

public class TinhCong {
    private String ma ;
    private String hoten ;
    private int luongcb ;
    private int ngaycong ;
    private String chucvu ;
    private int tong ;
    private int thuong ,phucap ,luong ;

    public TinhCong(int id , String hoten, int luongcb, int ngaycong, String chucvu) {
        this.ma = "NV"+String.format("%02d", id);
        this.hoten = hoten;
        this.luongcb = luongcb;
        this.ngaycong = ngaycong;
        this.chucvu = chucvu;
    
        if(ngaycong >=25){
            this.thuong = this.luongcb * this.ngaycong*1/5;
        }else if( ngaycong >=22 && ngaycong < 25){
            this.thuong = this.luongcb * this.ngaycong*1/10; 
        }else if( ngaycong < 22){
            this.thuong =0; 
        }
        this.luong = this.luongcb * this.ngaycong ;
       this.phucap = check(this.chucvu) ;
        this.tong = this.phucap+this.thuong+this.luongcb*this.ngaycong ;
    }
    
    private int check(String abc){
         int x = 0 ;
        switch(abc){
            case "GD": x = 250000;
            break;
            case "PGD": x= 200000;
             break ;
            case "TP": x = 180000;
             break ;
            case "NV":x =150000;
             break ;
            default: x= 0;
            break ;
           
        }
         return x;
    }
    
    @Override 
    public String toString(){
        return ma+" "+hoten+" "+luong+" "+thuong+" "+phucap+" "+tong;
    }
    
    
    
}
