/*
📘 TOPIC: Static Methods In Java
=================================

🧠 WHAT YOU’LL LEARN
---------------------
1️⃣ What is static method
2️⃣ Why static method is needed
3️⃣ Difference between static & instance method
4️⃣ Memory visualization
5️⃣ Why object is not needed
6️⃣ Why static cannot access non-static directly



🔹 WHAT IS A STATIC METHOD?
----------------------------

A static method belongs to:

    ✅ CLASS

NOT object.

Meaning:

    object is NOT required
    to call static method.



🔹 WHY STATIC METHOD IS NEEDED?
--------------------------------

Suppose functionality belongs to class itself,
not individual object.

Example:

    Math.max()
    Arrays.sort()

No object required.

So JVM allows:

    ClassName.method()
*/



/*
🔹 CLASS CREATION
------------------
*/

class Studenttt {


    /*
    🔹 INSTANCE VARIABLE
    ---------------------

    Belongs to object.
    Stored in HEAP object.
    */

    String name = "Aman";



    /*
    🔹 STATIC VARIABLE
    -------------------

    Shared by all objects.
    Stored in METHOD AREA.
    */

    static String company = "OpenAI";



    /*
    🔹 STATIC METHOD
    -----------------

    Belongs to CLASS.

    Stored in METHOD AREA.

    Can be called without object.
    */

    static void showCompany() {

        System.out.println(
                "Company : " + company
        );


        /*
        🚨 IMPORTANT
        =============

        Static method CAN access:

            ✅ static members

        because both belong to CLASS.
        */
    }



    /*
    🔹 INSTANCE METHOD
    -------------------

    Belongs to object.

    Requires object to call.
    */

    void display() {
        // Instance method can access both Instance var and static var.
        // cause static variables are shared globally.
        /*
        🔥 RULE
        ===========
            Access From	      Can Access Static?	Can Access Non-Static?
            Static Method     	✅ Yes	                 ❌ No
            Instance Method	    ✅ Yes	                 ✅ Yes

        🧠 MEMORY UNDERSTANDING
        ==========================
        static String company = "OpenAI";
        stored in: ✅ METHOD AREA

        🚀 GOLDEN RULE
        =================
            Object can access class data
            Class cannot directly access object data
         */
        System.out.println(
                "Name : " + name
        );

        System.out.println(
                "Company : " + company
        );
    }



    /*
    🔹 STATIC METHOD ERROR EXAMPLE
    -------------------------------

    Uncomment below code to see error.
    */

    static void test() {

        System.out.println(company);


        /*
        ❌ INVALID
        ------------

        System.out.println(name);

        WHY ERROR?

        Because:

            static method belongs to CLASS

            name belongs to OBJECT

        JVM gets confused:

            "Which object's name?"
        */
    }
}



/*
🔹 MAIN CLASS
--------------
Program execution starts from main().
*/

public class _2_StaticMethods {

    public static void main(String[] args) {


        /*
        🚀 STEP 1 : CLASS LOADING
        ==========================

        JVM loads class into METHOD AREA.
        */


        /*
        🧠 MEMORY AFTER CLASS LOADING
        ==============================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 METHOD AREA                    │
├─────────────────────────────────────────────────┤
│                                                 │
│   Studenttt.class                              │
│                                                 │
│   Static Variable                              │
│   --------------------------------             │
│   company = "OpenAI"                           │
│                                                 │
│   Static Methods                               │
│   --------------------------------             │
│   showCompany()                                │
│   test()                                       │
│                                                 │
│   Instance Methods                             │
│   --------------------------------             │
│   display()                                    │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Static methods stored in METHOD AREA
✅ Instance methods also stored in METHOD AREA
✅ Methods are shared instructions
*/


        /*
        🚀 STEP 2 : STATIC METHOD CALL
        ===============================

        No object required.
        */

        Studenttt.showCompany();


        /*
        🚀 STEP 3 : OBJECT CREATION
        ============================

        Creates object in HEAP.
        */

        Studenttt s1 = new Studenttt();


        /*
        🧠 MEMORY AFTER OBJECT CREATION
        =================================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 METHOD AREA                    │
├─────────────────────────────────────────────────┤
│                                                 │
│   company = "OpenAI"                           │
│                                                 │
│   showCompany()                                │
│   display()                                    │
│                                                 │
└─────────────────────────────────────────────────┘




┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│   s1 ─────────────────────→ 101                │
│                                                 │
└─────────────────────────────────────────────────┘




┌─────────────────────────────────────────────────┐
│                  HEAP MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│   Address : 101                                │
│   ------------------------------------          │
│                                                 │
│   Studenttt Object                             │
│                                                 │
│   name = "Aman"                                │
│                                                 │
└─────────────────────────────────────────────────┘
*/


        /*
        🚀 STEP 4 : INSTANCE METHOD CALL
        =================================

        Requires object.
        */

        s1.display();
    }
}



/*
💬 OUTPUT
===========

Company : OpenAI

Name : Aman



🔥 STATIC METHOD vs INSTANCE METHOD
====================================

STATIC METHOD
---------------
✅ Belongs to class
✅ No object required
✅ Access using ClassName.method()
✅ Can directly access static members


INSTANCE METHOD
-----------------
✅ Belongs to object
✅ Object required
✅ Can access both static & non-static members



🔥 WHY STATIC CANNOT ACCESS NON-STATIC?
========================================

Static method belongs to CLASS.

Non-static member belongs to OBJECT.

Suppose:

    100 objects exist

Then JVM asks:

    "Which object's variable should I use?"

Since no object exists,
JVM throws error.



🔥 IMPORTANT RULES
===================

✅ Static method belongs to CLASS

✅ Static method can access:
    static variables
    static methods

❌ Static method cannot directly access:
    instance variables
    instance methods

✅ Instance methods CAN access static members



🔥 GOLDEN RULE
================

STATIC
=
class level

NON-STATIC
=
object level



🔥 FASTEST MEMORY HACK
=======================

Static method asks:

    "Do I need object data?"

NO
    → make static

YES
    → make instance method
*/