package package1;


/*
🔹 PROTECTED INNER CLASS
--------------------------

Accessible:

    ✅ same package
    ✅ child class
*/

public class ProtectedInner_CorrectOne {


    protected class Demo {

        public void display() {

            System.out.println(
                    "Protected Inner Class"
            );
        }
    }
}