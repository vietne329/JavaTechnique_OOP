package self_study.laptrinhcoban;


import java.util.*;
public class UocSoNguyenToLonNhat {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            long i, n = in.nextLong();
            for(i = 2; i <= Math.sqrt(n);i++){
                if(i*i == 2){
                    n/=i;break;
                }

                while(n %i ==0) n/=i;

            }

            System.out.println(n);
        }

        }
}



