/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lop_Phan_So;
import java.util.* ;
public class PhanSo {
    private long tu ,mau ;
    public PhanSo(){
        
    }

    public PhanSo(String s) {
        StringTokenizer st =new StringTokenizer(s," ");
        this.tu = Long.parseLong(st.nextToken());
        this.mau = Long.parseLong(st.nextToken());
    }

    public long getTu() {
        return tu;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public long getMau() {
        return mau;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return tu +"/" +mau;
    }
    
    public void rutGon(){
        long x =UCLN(tu,mau);
        tu =tu/x;
        mau =mau/x;
    }

    private long UCLN(long a, long b) {
       while(b >0){
           long t =a%b;
           a =b ;
           b =t ;
       }
       return a ;
    }
    
    public PhanSo cong(PhanSo p){
        long tu =this.getTu()*p.getMau()+p.getTu() *this.getMau() ;
        long mau =this.getMau()*p.getMau();
        PhanSo C =new PhanSo();
        C.setMau(mau);
        C.setTu(tu);
        C.rutGon();
        return  C;
    }
    
     
    public PhanSo nhan(PhanSo p){
        long tu =this.getTu()*p.getTu()  ;
        long mau =this.getMau()*p.getMau();
        PhanSo C =new PhanSo();
        C.setMau(mau);
        C.setTu(tu);
        C.rutGon();
        return  C;
    }
    
    
    
    
}
