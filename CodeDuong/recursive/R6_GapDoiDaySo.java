
package recursive;
import java.util.* ;

public class R6_GapDoiDaySo {
     long n,k;
    public static void main(String[] args) {
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while(t-->0)
        {
            long n = in.nextLong();
            long k = in.nextLong();
            long mid=powp(2,n-1);
            System.out.println(tim(n,k,mid));
        }
    }

    public static long powp(int n,long k)
    {
        if(k==0)return 1;
        if(k==1)return n;
        long temp=powp(n,k/2);
        if(k%2==0)return temp*temp;
        return temp*temp*n;
    }
    public static long tim(long n,long k,long mid)
    {
        if(n==0)return 0;
        if(k==mid)return n;
        else if(k>mid) return tim(n-1,k-mid,mid/2);
        return tim(n-1,k,mid/2);
    }
}
