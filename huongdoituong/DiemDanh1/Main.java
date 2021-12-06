package self_study.huongdoituong.DiemDanh1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> lists = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            SinhVien s = new SinhVien(in.nextLine(),in.nextLine(),in.nextLine());
            lists.add(s);
        }

        for(int i = 0 ; i < n ; i++){
            String msv = in.next();
            String cc = in.nextLine();
            for(int j =0; j < lists.size(); j++){
                if(lists.get(j).getMa().equals(msv)){
                    lists.get(j).setDiemdanh(cc);
                }
            }
        }

        for(SinhVien s : lists){
            System.out.println(s);
        }

    }
}
