/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khaibao_lop_thisinh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.* ;

public class ThiSinh {
    private String hoten ;
    private Date ngaysinh ;
    private float diem1 ,diem2 ,diem3 ;

    public ThiSinh(String hoten, String ngaysinh, float diem1, float diem2, float diem3) throws ParseException {
        this.hoten = hoten;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    
    @Override
    public String toString(){
        float x = diem1+ diem2 +diem3 ;
        return hoten + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) +" "+x ;
    }
}
