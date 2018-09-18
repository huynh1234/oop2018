package week1;

public class StudentManagement {

    int max=100;
    Student[] students=new Student[max];

    public boolean sameGroup(Student s1, Student s2) {
        if(s1.getGroup().equals(s2.getGroup())) return true;
        return false;

    }

    void studentsByGroup() {
        int j=1;
        for (int i=0;i<100;i++){
            System.out.println("Lop "+j+" :");
            System.out.println(students[i].getInfo());



        }
    }

    void removeStudent(String id) {

        for( int i = 0 ; i < 100 ; i ++ )
        {
            int sinhvienthuN;
            if (students[i].getId() == id )
            {
                sinhvienthuN = i;
                for(int j = i ; j < 100 ; j++)
                {
                    students[j] = students[j+1];
                }
                max = max - 1;

            }
        }
    }

    public static void main(String[] args)
    {

        Student a=new Student();
        a.setName("Dang Anh Son");
        a.setEmail("maxseo9x@gmail.com");
        a.setGroup("INT2204");
        a.setId("17020999");

        System.out.println("ten Sv:" + a.getName());
        a.getInfo();

        //lam cau 8:
        Student b=new Student();
        b.getInfo();

        Student c=new Student("Son ", "17020999", "abcxyz@gmail.com");
        c.getInfo();

        Student d=new Student(a);
        d.getInfo();

        // cau10
        Student s01 = new Student("A", "17020888", "num1@gmail.com");

        Student s02 = new Student("B", "17020777", "num2@gmail.com");

        Student s03 = new Student();
        s03.setGroup("INT22042");
        StudentManagement ss = new StudentManagement();
        System.out.println( "Student 1vs2 " +ss.sameGroup(s01, s02));
        System.out.println("Student 1vs3 " + ss.sameGroup(s01, s03));
        System.out.println("Student 2vs3 " + ss.sameGroup(s02, s03));

    }
}
