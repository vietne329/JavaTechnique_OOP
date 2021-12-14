/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;
import java.util.*;
public class Q_13_HCNLonNhat {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long smax=0;
            Stack<Integer> s=new Stack<>();
            int n=sc.nextInt();

            int a[] = new int[n+1];

            int left[]=new int[n+1];
            int right[]=new int[n+1];

            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();

            s.push(0);
            for(int i=1;i<n;i++)
            {
                while(!s.isEmpty()&&a[s.peek()]>a[i]){
                    right[s.peek()]=  (i-s.peek());
                    s.pop();
                }
                s.push(i);
            }
            while(!s.isEmpty()){
                right[s.peek()]=  (n-s.peek());
                s.pop();
            }
            s.push(n-1);
            for(int i=n-2;i>=0;i--)
            {
                while(!s.isEmpty()&&a[s.peek()]>a[i]){
                    left[s.peek()]=  (s.peek()-i);
                    s.pop();
                }
                s.push(i);
            }
            while(!s.isEmpty()){
                left[s.peek()]=  (s.peek()+1);
                s.pop();
            }
            for(int i=0;i<n;i++)
            {
                long temp=a[i]*(left[i]+right[i]-1);
                if(temp>smax)smax=temp;
            }
            System.out.println(smax);
        }

    }
}
