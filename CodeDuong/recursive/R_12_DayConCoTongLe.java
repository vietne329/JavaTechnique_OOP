
package recursive;
import java.util.* ;
public class R_12_DayConCoTongLe {
     static int  b[] = new int[20],n,a[] = new int[20];
    static void quaylui(int i){
        for(int j=0;j<=1;j++){
            b[i]=j;
            if(i==n){
                xuly();
            }
            else quaylui(i+1);
        }
    }
    static void xuly(){
        int tong=0;
        int i;
        for(i=1;i<=n;i++){
            if(b[i]==1) tong+= a[i];
        }
        if(tong%2!=0){
            for(i=1 ;i<=n;i++) {
                if (b[i] == 1) {
                    System.out.print(a[i]+" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            b=new int[20];
            n = in.nextInt();
            int x[] = new int[n];
            for(int i=0;i<n;i++){
                x[i] = in.nextInt();
            }
            Arrays.sort(x);
            for(int i=1;i<=n;i++){
                a[i] = x[n-i];
            }
            quaylui(1);
        }
    }
}
