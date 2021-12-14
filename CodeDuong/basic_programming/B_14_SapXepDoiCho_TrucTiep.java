
package basic_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class B_14_SapXepDoiCho_TrucTiep {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in ) ;
        int n = in.nextInt() , a[] = new int[n] ;
        for(int i = 0 ; i< n ;i ++) a[i] = in.nextInt() ;
        sapxep(a, n) ;
     }

    private static void sapxep(int[] a, int n) {
        int i , j , t ;
        ArrayList<String> ds = new ArrayList<>() ;
        for(i = 0 ; i<n -1 ;i++){
            for(j = i +1 ;j<n ;j++){
                if(a[i] > a[j]){
                t =a[i] ; a[i] = a[j] ; a[j] = t ;  
                }
            }
              String tmp = "Buoc " + (i + 1) +":" ;
              for(j = 0 ; j <n ;j++) tmp =tmp + " "+a[j] ;
              ds.add(tmp) ;
        }
//      Collections.reverse(ds) ;
      for(String tmp : ds) System.out.println(tmp);
    }
    
}
