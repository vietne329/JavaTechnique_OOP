package self_study.huongdoituong.TinhThuNhapGiaoVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GiaoVien a = new GiaoVien(in.nextLine(),in.nextLine(),in.nextFloat());
        System.out.println(a);
    }
}
