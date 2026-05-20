package package2;

import package1.C1;

public class C3 {

    public static void main(String[] args) {

        C1 c = new C1();

        System.out.println(c.x);

        // System.out.println(c.y);

        // System.out.println(c.z);

        // System.out.println(c.a);
    }
}

/*
🧠 UNDERSTANDING
===================

Different package: package2.C3

So only:
public

accessible through object.
 */