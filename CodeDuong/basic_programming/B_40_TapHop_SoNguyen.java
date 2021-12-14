/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_programming;

import java.util.* ;
public class B_40_TapHop_SoNguyen {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        boolean[] A = new boolean[1000];
        boolean[] B = new boolean[1000];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            A[a[i]] = true;
        }

        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
            B[b[i]] = true;
        }

        for (int i = 0; i < 1000; i++) {
            if (A[i] && B[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < 1000; i++) {
            if (A[i] && !B[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < 1000; i++) {
            if (!A[i] && B[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
