/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhanSo;
import java.util.* ;

public class RutGon {
    private long tuso ;
    private long mauso ;

    public RutGon(long tuso, long mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }
    
    @Override
    public String toString(){
           return tuso+"/"+mauso ;
    }
    
    public void rutGon(){

        long x = gcd(tuso ,mauso) ;
     
        tuso /= x;
        mauso /= x ;
    }
    
    private long gcd(long a ,long b){
      long t ;
      while(b >0){
          t = a%b ;
          a= b ; b = t ;
      }
      return a ;
    }
}
