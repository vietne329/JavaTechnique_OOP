
package basic_programming;

import java.math.BigInteger;
import java.util.* ;
public class SoKhoi_LapPhuong {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<BigInteger> list = new ArrayList<>();
        for(int i=0;i<1000000;i++){
            BigInteger temp = BigInteger.valueOf(i);
            list.add(temp.multiply(temp.multiply(temp)));
        }
        int n = Integer.parseInt(in.nextLine());
        while (n-->0){
            String temp = in.nextLine();
            String copy = temp;
            int max=-1;
            for(int i=0;i<temp.length();i++){
                temp = temp.substring(0,i) + temp.substring(i+1,temp.length());
                BigInteger number = new BigInteger(temp);
               if(list.contains(number)){
                   for(int j=0;j<1000000;j++){
                       if( j*j*j == number.intValue()){
                           if(max<j){
                               max=j;
                           }
                           break;
                       }
                   }
               }
                temp=copy;

            }
            System.out.println(max);
        }
    }
}
