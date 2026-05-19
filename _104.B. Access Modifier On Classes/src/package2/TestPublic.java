package package2;
/*
IMPORTING PUBLIC CLASS
-----------------------
*/

import package1.PublicClass;

public class TestPublic {

    public static void main(String[] args) {
        /*
        OBJECT CREATION
        ----------------
        */

        PublicClass obj = new PublicClass();

        /*
        METHOD CALL
        -------------
        */

        obj.show();
    }
}

/*
🚀 OUTPUT
=============

Public Class Method
🧠 WHY THIS WORKS?

=====================

Because:

PublicClass
is:
public

So accessible from:
different package
 */