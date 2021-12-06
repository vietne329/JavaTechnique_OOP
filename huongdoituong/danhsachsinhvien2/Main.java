package self_study.huongdoituong.danhsachsinhvien2;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1; i <=n; i++){
            SinhVien a = new SinhVien(i,in.nextLine(), in.nextLine(),in.nextLine(),Float.parseFloat(in.nextLine()));
            System.out.println(a);
        }

    }
}
