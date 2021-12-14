
package basic_programming;
import java.util.* ;

public class B_16_SapXepChen {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in ) ;
        int n = in.nextInt() , a[] = new int[n] ;
        for(int i = 0 ; i< n ;i ++) a[i] = in.nextInt() ;
        sapxep(a, n) ;
    }

    private static void sapxep(int[] a, int n) {
        int i , j , t ;

        ArrayList<Integer> list = new ArrayList<>();
        for(i = 0 ; i<n ;i++){
            list.add(a[i]);
            int temp = i;
            for(j = i-1 ;j>=0 ;j--){
                if(list.get(i)<list.get(j)){
                    temp=j;
                }
            }
            int temp2 = list.get(i);
            for(int k = i;k>temp;k--){
                list.set(k,list.get(k-1));
            }
            list.set(temp,temp2);

            String tmp = "Buoc " + (i) +":" ;
            for(j = 0 ; j <list.size() ;j++) tmp =tmp + " "+list.get(j) ;
            System.out.println(tmp);
        }

    }
}
