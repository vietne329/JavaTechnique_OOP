/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsach_doituong_sinhvien1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.* ;
public class SinhVien {
    private String hoten ;
    private Date ngaysinh ;
    private float gpa ;
    private String lop ;
    private int ma ;

    public SinhVien(int id,String hoten,String lop ,  String ngaysinh,float gpa )throws ParseException {
        this.ma = id;
        this.hoten = hoten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaysinh);
       this.gpa = gpa;
        
    }
    
    @Override
    public String toString(){
        String ma = "B20DCCN" +String.format("%03d", this.ma) ;
        return ma+" "+hoten+" "+lop+" "+new SimpleDateFormat("dd/mm/yyyy").format(ngaysinh)+" "+String.format("%.3g%n", gpa);
    }
}
