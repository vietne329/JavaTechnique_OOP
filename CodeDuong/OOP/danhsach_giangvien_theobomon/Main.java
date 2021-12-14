/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsach_giangvien_theobomon;
import java.util.* ;
public class Main {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine())  ;
        ArrayList<GiangVien> list = new ArrayList<>(); 
        for(int i = 1 ; i <n+1 ; i++ ){
            GiangVien gv = new GiangVien(i,sc.nextLine(), sc.nextLine()) ;
            list.add(gv);
            
        }
        
        int number= Integer.parseInt(sc.nextLine()) ;
        String temp[] = new String[number] ;
        
        for(int i = 0 ; i<number ;i++) {
            temp[i] = sc.nextLine();
        }
        
        for(int i = 0 ; i< number ;i++) {
            String mon = GiangVien.chuanhoa(temp[i]) ;
            ArrayList<GiangVien> result = new ArrayList<>() ;
            
            for(GiangVien item : list){
                if(item.getTenMh().equals(temp[i])){
                    result.add(item) ;  
                }
            }
            System.out.println("DANH SACH GIANG VIEN BO MON "+mon+":");
            for(GiangVien it : result){
                System.out.println(it);
            }
        }
    }
    
    
}
