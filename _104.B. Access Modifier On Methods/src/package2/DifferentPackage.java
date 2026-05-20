package package2;


import package1.Parent;


/*
📘 DIFFERENT PACKAGE
======================
*/

public class DifferentPackage {


    void test() {


        Parent p = new Parent();


        /*
        ✅ VALID
        */

        p.publicMethod();


        /*
        ❌ INVALID
        */

        // p.protectedMethod();

        // p.defaultMethod();

        // p.privateMethod();
    }
}