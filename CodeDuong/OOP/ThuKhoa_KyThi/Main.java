/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThuKhoa_KyThi;

import java.util.* ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        ArrayList<ThuKhoa> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 1;i<n+1 ;i++){
            sc.nextLine();
            ThuKhoa tk = new ThuKhoa(i, sc.nextLine(), sc.nextLine(), sc.nextFloat(), 
                    sc.nextFloat(), sc.nextFloat()) ;
            
            list.add(tk);
        }
        Collections.sort(list);
        
         for(int i = 0 ;i< list.size() ;i++){
             if(list.get(i).getTong() == list.get(list.size()-1).getTong()) {
                      System.out.println(list.get(i));
                    
             }
         }
    }
    
   
}
