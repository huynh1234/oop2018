/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;
public class Student {
    //cau1

    public static void main(String[] args) {

//cau 2
        Student p = new Student();
//cau 5
        Student p1 = new Student();
        p1.setName("Dang Anh Son");
        p1.setId("17020999");
        p1.setGroup("K62IE4");
        p1.setEmail("sonsieg1999@gmail.com");
        System.out.println("Ten sinh vien: "+p1.getName());
        Student q1 = new Student();
        System.out.println("Ten: "+q1.getName()+", MSSV: "+q1.getId()+
                ", LOP: "+q1.getGroup()+", Email: "+q1.getEmail());

        Student q2 = new Student("17020999","Dang Anh Son","sonsieg");
        System.out.println("Ten: "+q2.getName()+", MSSV: "+q2.getId()+
                ", Dia chi email: "+q2.getEmail()+", Lop: "+q2.getGroup());

        Student q3 = new Student(p1);
        System.out.println("Ten: "+q3.getName()+", MSVV: "+q3.getId()+
                ", Lop: "+q3.getGroup()+", Dia chi email: "+q3.getEmail());
    }
}
