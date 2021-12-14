/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxep_sv_theoma;

import java.util.* ;

public class Student implements Comparable<Student> {
    private String ma ;
    private String hoten ;
    private String lop ;
    private String email ;

    public Student(String ma, String hoten, String lop, String email) {
        this.ma = ma;
        this.hoten = hoten;
        this.lop = lop;
        this.email = email;
    }
    

    @Override
    public String toString(){
        return ma+" "+hoten+" "+lop+" "+email ;
    }
    @Override
    public int compareTo(Student o) {
            return this.ma.compareTo(o.ma) ;
    }
    
}
