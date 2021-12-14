/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive;

import java.util.* ;
public class R_13_DayCon_CoK_PhanTuTangDan {
     static int n,k,c[] = new int[50],a[] = new int[50];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t =in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            k = in.nextInt();
            a= new int[n];
            for(int i=0;i<n;i++){
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            quaylui(1);
        }
    }

    public static void quaylui(int i){
        int j;
        for(j = c[i-1]+1;j<=n-k+i;j++){
            c[i]=j;
            if(i==k)in();
            else{
                quaylui(i+1);
            }
        }
    }
    public static void in(){
        int result[] = new int[k];
        int position=0;
        for(int i=1;i<=k;i++){
            result[position] = a[c[i]-1];
            position++;
        }
        Arrays.sort(result);
        for(int i=0;i<position;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
}
