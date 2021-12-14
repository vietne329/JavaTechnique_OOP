/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiemDanh1;

import java.util.* ;

public class Main {
  public static void main(String[] args) {
           Scanner sc = new Scanner(System.in) ;

       int n = Integer.parseInt(sc.nextLine()) ;
       
       ArrayList<DiemDanh> list = new ArrayList<>() ;
       
       for(int i = 0 ; i <n;i++){
           DiemDanh dd = new DiemDanh(sc.nextLine(), sc.nextLine(), sc.nextLine()) ;
           list.add(dd) ;
       }
       for(int i = 0 ;i<n ;i++){
           String maSV =sc.next();
           String cc =sc.nextLine() ;
           
           for(int j = 0 ; j<list.size() ; j++){
               if(list.get(j).getMasv().equals(maSV)){
                   list.get(j).setDiemdanh(cc);
               }
           }
       }
       
       
       for(DiemDanh item :list){
           System.out.println(item);
       }
       
    }
}
