/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle;


public class Triangle {
  private Point a,b,c ;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean valid(){
        if(tinhkhoangcach(a, b)+tinhkhoangcach(b, c)>tinhkhoangcach(a, c)&&
             tinhkhoangcach(b, c)+tinhkhoangcach(c, a)>tinhkhoangcach(a, b)&& 
                  tinhkhoangcach(c, a)+tinhkhoangcach(a, b)>tinhkhoangcach(b,c))
            return true ;
        return  false ;
    }
  
  public float getPerimeter(){
      return Math.round((tinhkhoangcach(a, b)+tinhkhoangcach(b, c)+tinhkhoangcach(c, a))*1000f)/1000f ;
  }
  
  private float tinhkhoangcach(Point a ,Point b){
      return (float) Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY()-b.getY(),2));
  }
}
