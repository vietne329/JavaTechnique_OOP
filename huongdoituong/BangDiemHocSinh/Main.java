package self_study.huongdoituong.BangDiemHocSinh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        List<HocSinh> ds = new ArrayList<>();

        for(int i = 1; i <=n ; i++){
            HocSinh a = new HocSinh(i,in.nextLine(), Float.parseFloat(in.next()),Float.parseFloat(in.next()),Float.parseFloat(in.next()),Float.parseFloat(in.next()),Float.parseFloat(in.next()),Float.parseFloat(in.next()),Float.parseFloat(in.next()),Float.parseFloat(in.next()),Float.parseFloat(in.next()),Float.parseFloat(in.nextLine()));
            ds.add(a);
        }
        Collections.sort(ds);
//        Collections.sort(ds, Comparator.comparingDouble(HocSinh::getDtb).reversed());

        for(HocSinh a : ds){
            System.out.println(a);
        }
    }
}
