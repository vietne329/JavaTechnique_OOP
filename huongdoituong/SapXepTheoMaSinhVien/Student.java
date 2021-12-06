package self_study.huongdoituong.SapXepTheoMaSinhVien;

public class Student implements Comparable<Student>{
    private String id,ten,lop,email;

    public Student(String id, String ten, String lop, String email) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return id+" "+ten+" "+lop+" "+email;
    }


    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
