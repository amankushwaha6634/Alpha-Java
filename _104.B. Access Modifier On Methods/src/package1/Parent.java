package package1;


/*
📘 PARENT CLASS
================

Contains methods with all
access modifiers.
*/

public class Parent {


    /*
    PUBLIC METHOD
    ----------------
    Accessible everywhere.
    */

    public void publicMethod() {

        System.out.println(
                "Public Method"
        );
    }



    /*
    PROTECTED METHOD
    ------------------
    Accessible inside :

        ✅ same package
        ✅ child class
    */

    protected void protectedMethod() {

        System.out.println(
                "Protected Method"
        );
    }



    /*
    DEFAULT METHOD
    ----------------
    Accessible ONLY
    inside same package.
    */

    void defaultMethod() {

        System.out.println(
                "Default Method"
        );
    }



    /*
    PRIVATE METHOD
    ----------------
    Accessible ONLY
    inside same class.
    */

    private void privateMethod() {

        System.out.println(
                "Private Method"
        );
    }



    /*
    SAME CLASS ACCESS
    -------------------

    All methods accessible
    inside same class.
    */

    void testInsideClass() {

        publicMethod();

        protectedMethod();

        defaultMethod();

        privateMethod();
    }
}