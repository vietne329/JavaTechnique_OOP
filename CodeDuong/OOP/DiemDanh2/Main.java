/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiemDanh2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pro 2004
 */
public class Main {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        int n = Integer.parseInt(sc.nextLine()) ;
        
        ArrayList<TinhDiem> lists = new ArrayList<>() ;
        
        for(int i = 0 ; i<n ;i++) {
            TinhDiem item = new TinhDiem(sc.nextLine(), sc.nextLine(), sc.nextLine()) ;
            lists.add(item);
        }
        
        for(int i = 0 ;i< n ;i++) {
            String ma = sc.next();
            String cc =sc.nextLine() ;
            
            for(int j = 0 ;j<lists.size() ;j++){
                if(lists.get(j).getMasv().equals(ma)){
                    lists.get(j).setDiemdanh(cc);
                    
                }
            }
        }
        

       String k = sc.nextLine() ;       
       for(int i = 0 ;  i <lists.size() ;i++){          
           if(lists.get(i).getLop().equals(k)){
               System.out.println(lists.get(i));
            }
      }
       
    }
}
