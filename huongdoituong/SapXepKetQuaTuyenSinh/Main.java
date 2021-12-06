package self_study.huongdoituong.SapXepKetQuaTuyenSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ThiSinh> lists = new ArrayList<>();

        int n = Integer.parseInt(in.nextLine());

        for(int i = 0 ; i < n;i++){
            ThiSinh ts = new ThiSinh(in.nextLine(),in.nextLine(),Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()),Float.parseFloat(in.nextLine()));
            lists.add(ts);
        }

        Collections.sort(lists);

        for (ThiSinh s : lists){
            System.out.println(s);
        }

    }
}
