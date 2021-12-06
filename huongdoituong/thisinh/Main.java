package self_study.huongdoituong.thisinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ThiSinh a = new ThiSinh(in.nextLine(), in.nextLine(), in.nextFloat(),in.nextFloat() ,in.nextFloat());
        System.out.println(a);
    }
}
