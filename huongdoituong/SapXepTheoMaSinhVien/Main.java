package self_study.huongdoituong.SapXepTheoMaSinhVien;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> lists = new ArrayList<>();

        while(in.hasNext()){
            String id = in.nextLine();
            String name = in.nextLine();
            String lop = in.nextLine();
            String email = in.nextLine();
            Student s = new Student(id,name,lop,email);
            lists.add(s);
        }

        Collections.sort(lists);

        for (Student s : lists){
            System.out.println(s);
        }

    }
}
