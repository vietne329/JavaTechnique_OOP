package self_study.huongdoituong.LietKeSinhVienTheoLop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Student> lists = new ArrayList<>();

        for(int i = 0; i < n; i++){
            Student s = new Student(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            lists.add(s);
        }

        int n_class = Integer.parseInt(in.nextLine());
        String[] tenlop = new String[n_class];

        for(int i = 0; i < n_class; i++){
            String input = in.nextLine();
            tenlop[i] = input;
        }


        for(int i = 0 ; i < n_class; i++) {
            System.out.println("DANH SACH SINH VIEN LOP "+tenlop[i]+":");
//            ArrayList<Student> temps = new ArrayList<>();
            for(int j = 0 ; j < lists.size();j++){
                if (lists.get(j).getLop().equalsIgnoreCase(tenlop[i])){
//                    temps.add(lists.get(j));
                    System.out.println(lists.get(j));
                }

            }

        }

    }
}
