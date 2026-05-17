package company;


import company.student.Student;
import company.teacher.Teacher;


public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        Teacher t1 = new Teacher();


        s1.display();

        t1.teach();
    }
}