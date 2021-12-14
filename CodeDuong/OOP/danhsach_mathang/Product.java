
package danhsach_mathang;

import java.util.* ;
public class Product implements Comparable<Product>{
    private String id ;
    private String tenmh ;
    private String donvi ;
    private int giamua,giaban ;
    private int loinhuan;

    public Product(int id, String tenmh, String donvi, int giamua, int giaban) {
        this.id = "MH"+String.format("%03d",id);
        this.tenmh = tenmh;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
        this.loinhuan = giaban-giamua ;
    }
    
  
    public String toString(){
        return id+" "+tenmh+" "+donvi+" "+giamua+" "+giaban+" "+loinhuan;
    }
    
    @Override
    public int compareTo(Product o) {
      if(this.loinhuan > o.loinhuan){
          return -1;
      }else
          return this.id.compareTo(o.id);
    }

   
    
}
