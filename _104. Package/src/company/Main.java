package company;


import company.student.Aman;
import company.teacher.Teacher;


public class Main {

    public static void main(String[] args) {

        Aman s1 = new Aman();

        Teacher t1 = new Teacher();


        s1.display();

        t1.teach();
    }
}