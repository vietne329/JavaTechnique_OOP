
package recursive;
import java.util. * ;
public class R1_HoanViNguoc {
  private static int a[] =new int [15] , n ;
  private static boolean b[] = new boolean[15] ;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in) ;
       int t =sc.nextInt() ;
       while ( t -- >0){
       n =sc.nextInt() ;
        a =new int [15] ;
        b =new boolean[15] ;
        quaylui(1) ;
        System.out.println();
       }
    }
    public static void quaylui(int i){
        int j;
        for(j=n; j>=1;j--){ 

            if(b[j]==false){
                a[i] = j;     
                  b[j] =true ;
             
                if(i == n) {
                    in();
                } else {
                  quaylui(i+1);
              }
                b[j] = false;
            
          }
      }
    }

    public static void in() {
        for (int i = 1; i <= n; i++) {
           System.out.print(a[i]);
       }
        System.out.print(" ");
    }
}
