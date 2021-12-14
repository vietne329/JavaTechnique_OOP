/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxep_sv_theolop;
import java.util.* ;

public class Student implements Comparable<Student>{
    private String masv ;
    private String hoten ;
    private String lop;
    private String mail ;

    public Student(String masv, String hoten, String lop, String mail) {
        this.masv = masv;
        this.hoten = hoten;
        this.lop = lop;
        this.mail = mail;
    }
    
    @Override
    public String toString(){
        return masv+" "+hoten+" "+lop+" "+mail ;
    }


    @Override
    public int compareTo(Student o) {
          if(this.lop.compareTo(o.lop) > 0)
            return 1 ;
        else{
            if(this.lop.compareTo(o.lop)<0)
                return -1 ;
            else{
                return this.masv.compareTo(o.masv) ;
            }
        }
    }
    
    
}
