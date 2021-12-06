package self_study.huongdoituong.LietKeSinhVienTheoNganh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> lists = new ArrayList<>();

        for(int i = 0; i < n; i++){
            SinhVien s = new SinhVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            lists.add(s);
        }

        int n_class = Integer.parseInt(in.nextLine());
        String[] nganh = new String[n_class];

        for(int i = 0; i < n_class; i++){
            String input = in.nextLine();
            nganh[i] = input;
        }

        for(int i = 0 ; i < n_class; i++) {
            for(int j = 0 ; j < lists.size();j++){
                if(lists.get(j).getNganh().equals("Cong nghe thong tin") && lists.get(j).getLop().charAt(0)=='E' || lists.get(j).getNganh().equals("An toan thong tin") && lists.get(j).getLop().charAt(0)=='E' ){
                    lists.remove(j);
                }
            }
        }

        for(int i = 0 ; i < n_class; i++) {
            System.out.println("DANH SACH SINH VIEN NGANH "+nganh[i].toUpperCase()+":");
            for(int j = 0 ; j < lists.size();j++){
                if(lists.get(j).getNganh().equals(nganh[i])){
                    System.out.println(lists.get(j));
                }
            }

        }

    }
}
