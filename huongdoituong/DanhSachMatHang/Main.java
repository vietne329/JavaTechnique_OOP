package self_study.huongdoituong.DanhSachMatHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> lists = new ArrayList<>();

        for(int i = 1 ; i <= n;i++){
            MatHang m = new MatHang(i,sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            lists.add(m);
        }

        Collections.sort(lists);

        for(MatHang m : lists){
            System.out.println(m);
        }

    }
}
