package package1;


/*
🔹 PRIVATE INNER CLASS
------------------------

Accessible ONLY inside:

    same outer class
*/

public class PrivateInner {


    private class Demo {

        void test() {

            System.out.println(
                    "Private Inner Class"
            );
        }
    }


    /*
    ACCESSING PRIVATE INNER CLASS
    INSIDE SAME OUTER CLASS
    */

    void accessInner() {

        Demo d = new Demo();

        d.test();
    }
}