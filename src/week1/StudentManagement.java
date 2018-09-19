package week1;

public class StudentManagement {


    // TODO: khai b?o thu?c t?nh students l? array ch?a c?c ??i t??ng thu?c l?p Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:

        return s1.getGroup().equals(s2.getGroup()); // x?a d?ng n?y sau khi c?i ??t
    }

    void studentsByGroup() {
        // TODO:
    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
        Student p = new Student();
        p.getInfo();
        Student p1= new Student("Nguyen Duc Huynh","17020812","huynhphoke@gmail.com");
        p1.getInfo();
        Student p2= new Student(p1);
        p2.getInfo();

        Student sv1 = new Student();
        sv1.setName("Huynh");
        sv1.setGroup("INT20041");
        Student sv2 = new Student();
        sv2.setName("thu");
        sv2.setGroup("INT20041");
        Student sv3 = new Student();
        sv3.setName("nhan");
        sv3.setGroup("INT20042");

        StudentManagement sv = new StudentManagement();
        System.out.println(sv.sameGroup(sv1,sv2));

    }
}
