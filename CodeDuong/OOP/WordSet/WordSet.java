/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordSet;

import java.util.StringTokenizer;

import java.util.* ;
public class WordSet {
    private TreeSet<String> set = new TreeSet<>() ;

    public  WordSet() {
        
    }
    public WordSet(String s) {
        StringTokenizer st = new StringTokenizer(s.toLowerCase()) ;
        while(st.hasMoreTokens()) set.add(st.nextToken()) ;
    }

    
    public String toString(){
        String kq = "" ;
        for(String i : set ) kq  = kq + i+ " " ;
        return kq.trim();
    }
    
    public WordSet union(WordSet a) {
        WordSet u = new WordSet() ;
        u.set.addAll(set);
        u.set.addAll(a.set) ;
        return  u ;
    }
    
    public WordSet intersection(WordSet a){
        WordSet u = new WordSet()  ;
        u.set.addAll(set) ;
        u.set.retainAll(a.set) ;
        return u ;
    }
}
