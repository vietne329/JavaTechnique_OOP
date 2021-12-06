package self_study.huongdoituong.DanhSachKhacHang;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> lists = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            KhachHang k = new KhachHang(i,sc.nextLine(),sc.nextLine(),sc.nextLine(), sc.nextLine());

            lists.add(k);
        }

        Collections.sort(lists);

        for(KhachHang l : lists){
            System.out.println(l);
        }

    }
}
