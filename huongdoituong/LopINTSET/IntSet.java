package self_study.huongdoituong.LopINTSET;

import java.util.TreeSet;

public class IntSet {
    TreeSet<Integer> set = new TreeSet();

    public IntSet() {
    }
    public IntSet(int a[]){
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
    }
    public String toString(){
        String kq = "";
        for(Integer i : set){
            kq+= i+" ";
        }
        return kq;
    }
    public IntSet union(IntSet s2){
        IntSet u = new IntSet();
        u.set.addAll(set);
        u.set.addAll(s2.set);
        return u;
    }
}
