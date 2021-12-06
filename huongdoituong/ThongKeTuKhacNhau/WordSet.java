package self_study.huongdoituong.ThongKeTuKhacNhau;

import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    TreeSet<String> treeSet = new TreeSet<>();

    public WordSet(Scanner in) {
        while (in.hasNext()){
            treeSet.add(in.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        String kq = "";
        for (String s : treeSet) kq = kq + s + "\n";
        return kq;
    }
}
