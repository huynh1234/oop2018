package week1;

public class Student {

    // TODO: khai b?o c?c thu?c t?nh cho Student
    //bai1:
    private String name;
    private String id;
    private String group;
    private String email;


    // TODO: khai b?o c?c ph??ng th?c getter, setter cho Student

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        group = "INT22041";
    }
//ádsfasdfasdf
    /**
     * Constructor 3
     * @param
     */

    Student() {
        // TODO:
        name="Student";
        id="000";
        group="INT22041";
        email="uet@gmail.com";
    }

    Student(Student s){
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    void getInfo() {
        // TODO:
        System.out.println("name = " + this.name);
        System.out.println("id 	 = " + this.id);
        System.out.println("group = " + this.group);
        System.out.println("email = " + this.email);
    }
}
