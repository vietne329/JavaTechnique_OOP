/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LietKe_sv_TheoNganh;

import java.util.* ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int so = Integer.parseInt(sc.nextLine()) ;
        ArrayList<SinhVien> list = new ArrayList<>() ;
        
        while(so -- >0){
            String maSV = sc.nextLine().trim().toUpperCase(Locale.ROOT).replaceAll("\\s+", " ") ;
            SinhVien sv = new SinhVien(maSV, sc.nextLine(), sc.nextLine(), sc.nextLine()) ;
            list.add(sv);
        }
        
        int test = Integer.parseInt(sc.nextLine()) ;
        String temp[] = new String[test];
       for(int i = 0 ; i<test ;i++){
           temp[i] = sc.nextLine() ;
       }
        
       
       for(int i = 0 ; i < test ;i++){
           String tenNganh = temp[i] ;
           System.out.println("DANH SACH SINH VIEN NGANH "+tenNganh.toUpperCase(Locale.ROOT)+": ");
           
           for(int j = 0 ; j <list.size() ;j++  ){
               switch(tenNganh){
                   case "Ke toan":
                    if(list.get(j).getMa().contains("DCKT") == true) System.out.println(list.get(j));
                    break ;
                    
                    case "Cong nghe thong tin":
                    if(list.get(j).getMa().contains("DCCN") == true && list.get(j).getLop().charAt(0) != 'E') System.out.println(list.get(j));
                    break ;
                    
                    case "An toan thong tin":
                    if(list.get(j).getMa().contains("DCAT") == true && list.get(j).getLop().charAt(0) != 'E') System.out.println(list.get(j));
                    break ;
                    
                    case "Vien thong":
                    if(list.get(j).getMa().contains("DCVT") == true) System.out.println(list.get(j));
                    break ;
                    
                    case "Dien tu":
                    if(list.get(j).getMa().contains("DCDT") == true) System.out.println(list.get(j));
                    break ;
                    
                    default:
                        continue;
               }
           }
       }
    }
}
