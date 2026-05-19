package package2;


/*
IMPORTING DEFAULT CLASS
------------------------
*/

//import package1.DefaultClass;
//
//
//
//public class TestDefault {
//
//
//    public static void main(String[] args) {
//
//
//        /*
//        OBJECT CREATION
//        ----------------
//        */
//
//        DefaultClass obj = new DefaultClass();
//
//
//        obj.display();
//    }
//}


/*
🚨 RESULT

=============

COMPILE-TIME ERROR
🧠 WHY ERROR?

================

Because:
DefaultClass
has:
default access

and default means:
same package only


But:
package2
≠
package1
 */