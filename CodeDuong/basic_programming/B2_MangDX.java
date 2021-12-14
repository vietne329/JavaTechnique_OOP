
package basic_programming;

import java.util.Scanner;

public class B2_MangDX {
   
    public static void main(String[] args) {
     int arr[];
     int n ;
     Scanner sc =new Scanner(System.in );
     n =sc.nextInt();
     while(n -- >0){
         int t =sc.nextInt();
         arr =new int [t];
         
         int mid =t /2 ;
        for(int i =0;i< t ;i++){
            arr[i] =sc.nextInt();
        }
        
        boolean ok =true ;
        for(int i =0;i<=mid;i++){
            if(arr[i] != arr[t-1-i]){
                ok =false ;
                break;
            }
        }
        
        if(ok) System.out.println("YES");
        else System.out.println("NO");
     }
    }
    
     
}
