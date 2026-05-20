package package2;


import package1.PublicConstructor;



public class TestPublic {


    public static void main(String[] args) {


        /*
        ✅ VALID
        */

        PublicConstructor p =
                new PublicConstructor();
    }
}