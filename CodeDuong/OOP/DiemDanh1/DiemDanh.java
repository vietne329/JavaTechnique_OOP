/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiemDanh1;

/**
 *
 * @author Pro 2004
 */
public class DiemDanh {
   private String masv ,hoten , lop ,diemdanh ;
   private int diem ;

    public DiemDanh(String masv, String hoten, String lop) {
        this.masv = masv;
        this.hoten = hoten;
        this.lop = lop;
    }

    public String getMasv() {
        return masv;
    }

    public void setDiemdanh(String diemdanh) {
        this.diemdanh = diemdanh;
    }
    
    public int tinhDiemChuyenCan(){
        int diemcc  = 10 ;
        for(int i = 0 ;i<this.diemdanh.length() ; i++){
            if(diemdanh.charAt(i) == 'm'){
                diemcc -= 1 ;
            }else if(diemdanh.charAt(i) == 'v'){
                diemcc -= 2 ;
            }
        }
        
        this.diem = diemcc ;
        if(diem <= 0){
            this.diem = 0 ;
        }
        
       return diem ;
    }
    
    public String getGhiChu(){
        if(this.diem <= 0){
            return "KDDK";
        }else 
            return "";
    }
    
    
    @Override
    public String toString(){
        return masv+" "+hoten+" "+lop+" "+tinhDiemChuyenCan()+" "+getGhiChu() ;
    }
    
    
   
}
