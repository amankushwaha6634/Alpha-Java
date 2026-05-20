package package2;

import package1.ProtectedInner_CorrectOne;



public class TestProtected3_CorrectOne
        extends ProtectedInner_CorrectOne {



    protected class ChildDemo
            extends Demo {


        void test() {

            display();
        }
    }
}