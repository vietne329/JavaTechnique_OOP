/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangDiem_HocSinh;

import java.util.* ;

public class HocSinh implements Comparable<HocSinh>{
    private String ma,ten ;
    private float [] diem ;
    private float dtb ;

    public HocSinh(int id, String ten ) {
        this.ma = "HS"+String.format("%02d", id);
        this.ten = ten;
  
    }
    

    public float[] getDiem() {
        return diem;
    }

    public void setDiem(float[] diem) {
        this.diem = diem;
        this.dtb = tinhdtb() ;
    }
    
    private float tinhdtb(){
        float tb =0f ;
        for(int i = 0 ; i<10 ;i++){
            if(i== 0 || i ==1){
                tb += diem[i] ;
            }  tb+= diem[i];
        } tb /= 12 ;
        return (float) Math.round(tb*10)/10 ;
    }
    
    private String xeploaiHS(float dtb){
         if(dtb>= 9)
              return "XUAT SAC";
        
        else if(dtb>= 8 && dtb<=8.9)
              return "GIOI ";
        
        else if(dtb>= 7 && dtb<=7.9)
              return "KHA";
        
        else if(dtb>= 5 && dtb <= 6.9)
             return "TB";
        
        else 
                 return "YEU";
     
        }
    


    
    @Override
    public String toString(){
        return ma+" "+ten+" "+dtb+" "+xeploaiHS(dtb);
    }
    @Override
    public int compareTo(HocSinh o) {
     if(this.dtb < o.dtb){
         return 1 ;
        
     } else if(this.dtb >o.dtb){
         return -1 ;
     }else{
         return  this.ma.compareTo(o.ma) ;
     }
    }
    
    
}
