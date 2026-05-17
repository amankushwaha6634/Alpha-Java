package company.teacher;

import company.student.Aman;
import company.student.Ankit;

public class Teacher2 {
    public String subject = "DSA";

    public void teach() {
        Aman s1= new Aman();
        Ankit s2 = new Ankit();

        System.out.println(
                "Teacher 2 Teaching : " + subject + " both to " + s1.name + " and " + s2.name
        );

    }
}
