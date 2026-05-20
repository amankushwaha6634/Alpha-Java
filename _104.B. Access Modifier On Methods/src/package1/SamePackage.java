package package1;


/*
📘 SAME PACKAGE ACCESS
========================
*/

public class SamePackage {


    void test() {


        Parent p = new Parent();


        /*
        ✅ VALID
        */

        p.publicMethod();

        p.protectedMethod();

        p.defaultMethod();


        /*
        ❌ INVALID

        private method accessible
        only inside same class.
        */

        // p.privateMethod();
    }
}