/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lop_Hoc_Phan_1;

import java.util. * ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = Integer.parseInt(sc.nextLine()) ;
        
        ArrayList<Lop> list = new ArrayList<>();
        while(n-- >0){
            Lop lop = new Lop(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()) ;
            list.add(lop);
        }
        Collections.sort(list); ;
        
        int so = Integer.parseInt(sc.nextLine()) ;
        String[] temp = new String[so] ;
        for(int i = 0 ; i < so ;i++){
            temp[i] = sc.nextLine();
        }
        
        for(int i= 0 ; i <so ;i++){
            String ten = "" ;
            ArrayList<String> result  = new ArrayList<>() ;
            
            for(int j = 0 ;j<list.size() ;j++){
                if(list.get(j).getMa().equals(temp[i])){
                    String temppp = list.get(j).getNhom()+" "+list.get(j).getTengv() ;
                    result.add(temppp) ;
                    ten =list.get(j).getTenmh();
                }
            }
            System.out.println("Danh sach nhom lop mon "+ten+":");
            for(String sss:result){
                System.out.println(sss);
            }
        }
    }
}
