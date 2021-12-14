/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangDiem_TuyenSinh;

/**
 *
 * @author Pro 2004
 */
public class TuyenSinh {
    private String ma;
    private  String ten;
    private float diemtoan;
    private float diemli;
    private float diemhoa;
    float diemuutien;
    float diemtong;

    public TuyenSinh(String ma, String ten, float diemtoan, float diemli, float diemhoa) {
        this.ma = ma;
        this.ten = ten;
        this.diemtoan = diemtoan;
        this.diemli = diemli;
        this.diemhoa = diemhoa;
        char vung = this.ma.charAt(2);

        if(vung == '1') diemuutien =0.5f;
        if(vung =='2') diemuutien =1.0f;
        if(vung=='3') diemuutien =2.5f;
        diemtong = diemtoan*2+diemli+diemhoa;
    }

    @Override
    public String toString() {
        String diemuutienstr,diemtongstr;
        if(diemuutien - (int)diemuutien ==0){ 
            diemuutienstr = (int)diemuutien+"";
        }
        else diemuutienstr = diemuutien+"";
        if(diemtong - (int)diemtong ==0){
            diemtongstr = (int)diemtong+"";
        }
        else diemtongstr = diemtong+"";
        String trangthai;
        if(diemuutien + diemtong >=24){
            trangthai = "TRUNG TUYEN";
        }
        else trangthai = "TRUOT";
        return ma+" "+ten+" "+diemuutienstr+" "+diemtongstr+" "+trangthai;
    }
    
    
    
}
