package self_study.huongdoituong.TraCuuDonHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<DonHang> lists = new ArrayList<>();

        int n = Integer.parseInt(in.nextLine());
        for(int i = 0 ; i < n;i++){
            DonHang d = new DonHang(in.nextLine(),in.nextLine(),Float.parseFloat(in.nextLine()),Integer.parseInt(in.nextLine()));
            lists.add(d);
        }

        for (DonHang d : lists){
            System.out.println(d);
        }

    }
}
