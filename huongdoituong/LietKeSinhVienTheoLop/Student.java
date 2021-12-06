package self_study.huongdoituong.LietKeSinhVienTheoLop;


public class Student implements Comparable<Student>{
    private String id,ten,lop,email;

    public Student(String id, String ten, String lop, String email) {
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public String getEmail() {
        return email;
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
