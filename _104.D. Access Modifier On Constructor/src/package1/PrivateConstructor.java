package package1;


/*
🔹 PRIVATE CONSTRUCTOR
------------------------

Accessible ONLY inside:

    same class
*/

public class PrivateConstructor {


    private PrivateConstructor() {

        System.out.println(
                "Private Constructor"
        );
    }


    /*
    Object creation allowed
    INSIDE same class.
    */

    void createObject() {

        PrivateConstructor p =
                new PrivateConstructor();
    }
}