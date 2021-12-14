/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive;

import java.util.* ;
public class DoiChuCacChuSo {
   static int k,step;
    public static void quaylui (String s){

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            k = in.nextInt();
            step=0;
            in.nextLine();
            String  s =in.nextLine();

        }
    }
    public static void swap(int i,int j,String s){
        StringBuilder sb = new StringBuilder(s);
        char temp = sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,temp);
        s= sb.toString();
    }  
}
