/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiToan_TuyenSinh;


public class ThiSinh {
    private String ma ;
    private String hoten ;
    private float toan ,ly,hoa ;
    private float uutien  ,diemtong;
   
    
    public ThiSinh(String ma, String hoten, float toan, float ly, float hoa) {
        this.ma = ma;
        this.hoten = hoten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        
        String x = ma.substring(0,3) ;
        if(x.equals("KV1")){
            this.uutien = 0.5f ;
        }
        if(x.equals("KV2")){
            this.uutien = 1.0f ;
        }
        if(x.equals("KV3")){
            this.uutien = 1.5f ;
        }
        
        diemtong = toan*2+ly+hoa ;
    }
    
    @Override
    public String toString(){
        String uutienstr , diemtongstr ;

        if(uutien - (int)uutien == 0){
            uutienstr = (int)uutien+"";
        }else  uutienstr = uutien+"";
        
         if(diemtong - (int)diemtong == 0){
            diemtongstr = (int)diemtong+"";
        }else  diemtongstr = diemtong+"";
         
         String trangthai ;
         if(diemtong +uutien>= 24) trangthai = "TRUNG TUYEN";
         else trangthai = "TRUOT";
        return ma+" "+hoten+" "+uutienstr +" "+diemtongstr+" "+trangthai;
    }
    
    
}
