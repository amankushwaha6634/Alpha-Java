package package2;


import package1.ProtectedConstructor;



public class TestProtected extends ProtectedConstructor {


    public TestProtected() {

        /*
        ✅ VALID

        child class calling
        protected constructor
        */

        super();
    }
}