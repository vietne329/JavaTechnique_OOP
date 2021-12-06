package self_study.huongdoituong.WordSet;

import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set = new TreeSet<>();
    public WordSet(){

    }
    public WordSet(String s){
        StringTokenizer st = new StringTokenizer(s.toLowerCase());
        while (st.hasMoreTokens()) set.add(st.nextToken());
    }
    public String toString(){
        String kq = "";
        for(String i : set) kq = kq + i +" ";
        return kq.trim();
    }
    public WordSet union(WordSet a){
        WordSet u = new WordSet();
        u.set.addAll(set);
        u.set.addAll(a.set);
        return u;
    }
    public WordSet intersection(WordSet a){
        WordSet inter = new WordSet();
        inter.set.addAll(set);
        inter.set.retainAll(a.set);
        return inter;
    }
}
