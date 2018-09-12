package week1;
public class Student {
    private String id;
    private String name;
    private String group;
    private String email;
    //cau 6 phuong thuc 1
    public Student(){
        id = "000";
        name = "Student";
        group = "INT22041";
        email = "uet@vnu.edu.vn";

    }
    //cau3
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //cau6 phuong thuc 2
    public Student(String nid, String n, String em){
        name = n ;
        id = nid ;
        email = em ;
        group = "INT22041";
    }
//     String Info(){
//        return name;
//       return id;
//        return group;
//        return email;
//    }

    //cau 6 phuong thuc 3
    public Student(Student s){
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }
}