package company;


import company.student.Aman;
import company.teacher.Teacher1;
import company.teacher.Teacher2;


public class Main {

    public static void main(String[] args) {

        Aman s1 = new Aman();

        Teacher1 t1 = new Teacher1();
        Teacher2 t2 = new Teacher2();


        // s1.display();

        t1.teach();
        t2.teach();
    }
}