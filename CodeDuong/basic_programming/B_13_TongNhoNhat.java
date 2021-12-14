
package basic_programming;

import java.util.* ;
public class B_13_TongNhoNhat {
    public static void main(String[] args) {
          int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        
        while(T-->0){
            long chay = 1;
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            long tong = 0;
            if(n%2 ==0){
                for(int i = n-1;i>0;i-=2){
                    tong+= a[i]*chay+a[i-1]*chay;
                    chay*=10;
                }
            }
            else{
                for(int i = n-1;i>1;i-=2){
                    tong+= a[i]*chay+a[i-1]*chay;
                    chay*=10;
                }
                tong+=a[0]*chay;
            }
            System.out.println(tong);
        }
    }
    
    
}
