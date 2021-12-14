/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinhTien;

/**
 *
 * @author Pro 2004
 */
public class SanPham implements Comparable<SanPham>{
    private String ma ;
    private String tensp ;
    private int soluong ;
    private long dongia ,chietkhau ,tong ;

    public SanPham(String ma, String tensp, int soluong, long dongia, long chietkhau) {
        this.ma = ma;
        this.tensp = tensp;
        this.soluong = soluong;
        this.dongia = dongia;
        this.chietkhau = chietkhau;
        this.tong = soluong * dongia - chietkhau;
    }
    
    @Override 
    public String toString(){
        return ma+" "+tensp+" "+soluong+" "+dongia+" "+chietkhau+" "+tong ;
    }

    @Override
    public int compareTo(SanPham o) {
        if(this.tong > o.tong){
                return -1 ;
        }
        else 
              return 1 ;
        
    }
    
}
