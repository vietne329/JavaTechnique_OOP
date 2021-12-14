/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intset;

import java.util.* ;

public class IntSet {
    TreeSet<Integer> set = new TreeSet<>() ;
    
    public IntSet(){
        
    }
    
    public IntSet(int a[]){
        for(int i = 0 ; i <a.length ;i++){
            set.add(a[i]) ;
        }
    }
    
    @Override
    public String toString(){
        String kq ="" ;
        for(Integer i:set){
            kq = kq + i+ " ";
        }
        return kq ;
    }
    
    public IntSet union(IntSet a){
        IntSet u = new IntSet() ;
        u.set.addAll(set) ;
        u.set.addAll(a.set) ;
        return  u ;
    }
}
