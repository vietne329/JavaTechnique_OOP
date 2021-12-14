package recursive;

import java.util.* ;
public class R4_Hoan_Vi_Xau_KyTu {
    private static int a[] =new int[15] ,n ;
    private static boolean b[] = new boolean[15] ;
    private static String s ;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        int t =sc.nextInt();
        while(t -- >0){
           s=sc.next() ;
            n =s.length() ;
            a =new int[15];
            b =new boolean[15] ;
            quaylui(1) ;
            System.out.println("");
        }
    }

    private static void quaylui(int i) {
      int j ;
      for(j=1;j<=n;j++){
          if(b[j] ==false){
              a[i] = j; 
              b[j] =true ;
              if(i == n) {
                  in() ;
              }
              else{
                  quaylui(i+1);
              }
              b[j] =false ;
          }
      }
    }

    private static void in() {
        for(int  i = 1;i<=n;i++){
            System.out.print(s.charAt(a[i]-1));
        }
        System.out.println("");
    }
}

