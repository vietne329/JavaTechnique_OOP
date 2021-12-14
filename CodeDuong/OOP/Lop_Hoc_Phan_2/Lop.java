
package Lop_Hoc_Phan_2;
import java.util.* ;

public class Lop implements Comparable<Lop>{
    private String ma ,ten  ,tengv ;
    private String nhom ;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTengv() {
        return tengv;
    }

    public void setTengv(String tengv) {
        this.tengv = tengv;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }
    
    

    public Lop(String ma, String ten, String nhom ,String tengv) {
        this.ma = ma;
        this.ten = ten;
        this.tengv = tengv;
        this.nhom = nhom;
    }
    

    @Override
    public int compareTo(Lop o) {
      if(this.ma.compareTo(o.ma) > 0){
          return 1;
      }else{
          if(this.ma.compareTo(o.ma) <0){
              return -1 ;
          }else{
              return this.nhom.compareTo(o.nhom) ;
          }
      }
      
    }
    
    

}
