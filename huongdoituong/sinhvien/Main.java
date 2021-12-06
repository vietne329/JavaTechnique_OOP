package self_study.huongdoituong.sinhvien;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        SinhVien a = new SinhVien(in.nextLine(), in.nextLine(),in.nextLine(),in.nextFloat());
        System.out.println(a);
    }
}
