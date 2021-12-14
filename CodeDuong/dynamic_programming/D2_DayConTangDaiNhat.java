/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic_programming;
import java.util.* ;
public class D2_DayConTangDaiNhat {
  public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]=scanner.nextInt();
        System.out.println(qhd(a,n));
    }

    private static int qhd(int a[],int n) {
        int kq=0,f[]=new int[n];
        f[0]=1;
        for (int i=1;i<n;i++){
            f[i]=1;
            for (int j=0;j<i;j++){
                if (a[j]<a[i]){
                    f[i]=Math.max(f[i],f[j]+1);
                }
            }
            kq=Math.max(kq,f[i]);
        }
        return kq;
    }
}
