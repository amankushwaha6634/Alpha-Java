package package2;

import package1.ProtectedInner;



public class TestProtected2
        extends ProtectedInner {


    void test() {


        /*
        ACCESSING PROTECTED
        INNER CLASS
        THROUGH CURRENT
        CHILD OBJECT
        */

        ProtectedInner.Demo d =
                this.new Demo();


        d.display();
    }
}