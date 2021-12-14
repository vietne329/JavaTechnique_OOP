
package recursive;

import java.util.*;
public class R_14_ATM1 {



    static int n,dem=0,Min=9999;
    static int sum=0,val;
    static List<Integer> t;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        while (k-->0){
            sum=0;
            Min=9999;
            dem=0;
            t=new ArrayList<>();
            n=scanner.nextInt();
            val=scanner.nextInt();
            for(int i=1;i<=n;i++)
                t.add(scanner.nextInt());
            t.sort(Collections.reverseOrder());

            sinh(1);
            System.out.println(Min == 9999 ? "-1" : Min);

        }
    }

    public static void sinh(int i)
    {
        for(int j=0;j<=1;j++)
        {
            sum+=j*t.get(i-1);
            dem+=j;
            if(i==n-1)
            {
                if(sum==val) {
                    Min=Math.min(dem,Min);
                    return;
                }
            }
            else if(sum<=val) sinh(i+1);
            sum-=j*t.get(i-1);
            dem-=j;
        }
    }



}
