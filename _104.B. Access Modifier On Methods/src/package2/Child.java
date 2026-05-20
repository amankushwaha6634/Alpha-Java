package package2;


import package1.Parent;


/*
📘 CHILD CLASS
================

Different package
+
inheritance
*/

public class Child extends Parent {


    void test() {


        /*
        ✅ VALID
        */

        publicMethod();

        protectedMethod();


        /*
        ❌ INVALID
        */

        // defaultMethod();

        // privateMethod();
    }
}