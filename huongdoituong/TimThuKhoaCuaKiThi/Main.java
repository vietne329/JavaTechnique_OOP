package self_study.huongdoituong.TimThuKhoaCuaKiThi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ThiSinh> lists = new ArrayList<>();

        int n = Integer.parseInt(in.nextLine());

        for(int i = 1; i <=n ;i++){
            ThiSinh t = new ThiSinh(i,in.nextLine(),in.nextLine(),Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()));
            lists.add(t);
        }

        float diem_max = 0;
        for (int i = 0 ; i < lists.size();i++){
            if(diem_max < lists.get(i).getTongDiem()){
                diem_max = lists.get(i).getTongDiem();
            }
        }

        Collections.sort(lists);

        for (int i = 0 ; i < lists.size();i++){
            if(diem_max == lists.get(i).getTongDiem()){
                System.out.println(lists.get(i));
            }
        }
    }
}
