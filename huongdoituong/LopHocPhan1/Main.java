package self_study.huongdoituong.LopHocPhan1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<LopHocPhan> lists = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            LopHocPhan l = new LopHocPhan(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            lists.add(l);
        }
        Collections.sort(lists);

        int n2 = Integer.parseInt(in.nextLine());
        String malop[] = new String[n2];
        String tenlop[] = new String[n2];

        for(int i = 0 ; i < n2;i++){
            malop[i] = in.nextLine();
            for(int j = 0; j < lists.size(); j++){
                if(malop[i].equals(lists.get(j).getMa())){
                    tenlop[i] = lists.get(j).getTen();
                }
            }
        }

        for(int i= 0; i < n2 ;i++){
            System.out.println("Danh sach nhom lop mon "+tenlop[i]+":");
            for(int j = 0; j < lists.size();j++){
                if(lists.get(j).getTen().equals(tenlop[i])){
                    System.out.println(lists.get(j));
                }
            }
        }

    }
}
