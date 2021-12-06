package self_study.huongdoituong.DanhSachGiangVienTheoBoMon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Teacher> lists = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            Teacher t  = new Teacher(i, in.nextLine(), in.nextLine());
            lists.add(t);
        }

        int n_class = Integer.parseInt(in.nextLine());
        String[] bomon = new String[n_class];

        for(int i = 0; i < n_class; i++){
            String input = in.nextLine();
            bomon[i] = input;
        }


        for(int i = 0 ; i < n_class; i++) {
            System.out.println("DANH SACH GIANG VIEN BO MON "+convertBoMon(bomon[i])+":");
            for(int j = 0 ; j < lists.size();j++){
                if (lists.get(j).convertBoMon().equals(convertBoMon(bomon[i]))){
//                    temps.add(lists.get(j));
                    System.out.println(lists.get(j));
                }
            }

        }
    }

    public static String convertBoMon(String bomon){
        bomon = bomon.trim().toUpperCase();
        bomon = bomon.replaceAll("\\s+", " ");
        String[] words = bomon.split(" ");
        String s = "";
        for (int i = 0; i < words.length; i++) {
            s += String.valueOf(words[i].charAt(0));
        }
        return s;

    }
}
