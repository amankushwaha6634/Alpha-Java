package package1;


/*
🔹 PROTECTED INNER CLASS
--------------------------

Accessible:

    ✅ same package
    ✅ child class
*/

public class ProtectedInner {


    protected class Demo {

        void display() {

            System.out.println(
                    "Protected Inner Class"
            );
        }
    }
}