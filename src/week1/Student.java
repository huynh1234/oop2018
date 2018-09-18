package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student

    private String name;
    private String id;
    private String group;
    private String email;


    // TODO: khai báo các phương thức getter, setter cho Student
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name ;
    }
    public String getid(){
        return id;
    }
    public void setid(String id){
        this.id = id;
    }
    public String getgroup(){
        return group;
    }
    public void setgroup(String group){
        this.group=group;
    }
    public String getemail(){
        return email;
    }
    public void setemail(String email){
        this.email=email;
    }
    /**
     * Constructor 1
     */

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        name =n;
        id= sid;
        email=em;
    }

    /**
     * Constructor 3
     * @param
     */

    Student() {
        // TODO:
        name="Nguyen Duc huynh";
        id="17020812";
        group="INT22041";
        email="huynhphoke@gmail.com";
    }

    Student(Student s){
        name= s.getname();
        id= s.getid();
        group=s.getgroup();
        email=getemail();
    }

    String getInfo() {
        // TODO:
        return (name + id+ group+ email);

    }
}
