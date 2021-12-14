
package basic_programming;
import java.util.*;
public class B_33_SapXepChen_LKNguoc {
    public static void sapxepchen(int a[], int n){
        int i, key, j;
        String[] kq = new String[n];
        kq[0] = "Buoc 0: "+a[0];
        String st = "";
        for(i = 1; i < n;i++){
            key = a[i];
            j = i-1;
            while(j >= 0 && a[j] > key){
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = key;
            st+="Buoc "+(i)+": ";
            for(int k = 0;k <= i;k++){
                st+=a[k]+" ";
            }
            kq[i] = st;
            st = "";
        }
        for(i = kq.length-1;i>=0;i--){
            System.out.println(kq[i]);
        }
    }
    
     public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
         sapxepchen(a, n);
    }
}
