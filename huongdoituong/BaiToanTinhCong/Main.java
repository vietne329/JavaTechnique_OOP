package self_study.huongdoituong.BaiToanTinhCong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        NhanVien nv = new NhanVien(in.nextLine(), Float.parseFloat(in.nextLine()),Integer.parseInt(in.nextLine()), in.nextLine());
        System.out.println(nv);

    }
}
