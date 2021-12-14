/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThuKhoa_KyThi;

public class ThuKhoa implements Comparable<ThuKhoa>{ 
    private int ma ;
    private String hoten ;
    private String ngaysinh ;
    private float diem1,diem2,diem3 ;
    private float tong ;

    public ThuKhoa(int ma, String hoten, String ngaysinh, float diem1, float diem2, float diem3) {
        this.ma = ma;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tong = diem1+diem2+diem3 ;
    }
  
    @Override 
    public String toString(){
        return ma+" "+hoten+" "+ngaysinh+" "+tong ;
    }

    @Override
    public int compareTo(ThuKhoa o) {
        if(this.tong > o.tong) 
            return 1 ;
        else if(this.tong<o.tong){
           return -1 ; 
        }else{
            if(this.ma > o.ma)
                return 1;
            else return -1 ;
        }
            
    }

    public float getTong() {
        return tong;
    }
}   

