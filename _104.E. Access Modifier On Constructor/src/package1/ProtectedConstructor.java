package package1;


/*
🔹 PROTECTED CONSTRUCTOR
--------------------------

Accessible:

    ✅ same package
    ✅ child class in different package
*/

public class ProtectedConstructor {


    protected ProtectedConstructor() {

        System.out.println(
                "Protected Constructor"
        );
    }
}