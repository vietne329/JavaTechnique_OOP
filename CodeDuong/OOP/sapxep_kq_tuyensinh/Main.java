/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sapxep_kq_tuyensinh;

import java.util. * ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()) ;
        ArrayList<TuyenSinh> list = new ArrayList<>() ;
        
        while(n-- > 0){
            TuyenSinh ts = new TuyenSinh(sc.nextLine(), sc.nextLine(),
                    Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine())) ;
       
                    list.add(ts );
        }
        Collections.sort(list) ;
        
        for(TuyenSinh ts : list) {
            System.out.println(ts);
        }
    }
}
//b o tren a