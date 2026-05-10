/*
📘 TOPIC: Static vs Non-Static Access In Java
===============================================

🧠 WHAT YOU’LL LEARN
---------------------
1️⃣ Why static can access static directly
2️⃣ Why static cannot access non-static directly
3️⃣ Why object is needed for non-static access
4️⃣ JVM confusion behind static
5️⃣ Memory visualization
6️⃣ Correct way to access non-static members
7️⃣ Static vs non-static rules



🔹 MOST IMPORTANT RULE
-----------------------

STATIC
    → belongs to CLASS

NON-STATIC
    → belongs to OBJECT



🔹 CORE UNDERSTANDING
----------------------

Static methods execute WITHOUT object.

Non-static members REQUIRE object.

So static methods cannot directly use:

    ✅ instance variables
    ✅ instance methods



🔹 WHY JVM GIVES ERROR?
------------------------

Suppose:

    100 objects exist

Then JVM asks:

    "Which object's data should I use?"

Since static method has NO current object,
JVM throws compile-time error.
*/



/*
🔹 CLASS CREATION
------------------
*/

class Studenttttttt {


    /*
    🔹 INSTANCE VARIABLE
    ---------------------

    Belongs to object.

    Every object gets separate copy.

    Stored inside HEAP object.
    */

    String name = "Aman";



    /*
    🔹 STATIC VARIABLE
    -------------------

    Belongs to class.

    Shared by all objects.

    Stored in METHOD AREA.
    */

    static String company = "OpenAI";



    /*
    🔹 INSTANCE METHOD
    -------------------

    Requires object to execute.

    Stored in METHOD AREA.
    */

    void display() {

        System.out.println(
                "Name : " + name
        );
    }



    /*
    🔹 STATIC METHOD
    -----------------

    Belongs to CLASS.

    No object required.

    Stored in METHOD AREA.
    */

    static void test() {


        /*
        ✅ VALID
        ----------

        Static method CAN access
        static variable directly.

        WHY?

        Because both belong to CLASS.
        */

        System.out.println(
                "Company : " + company
        );



        /*
        ❌ INVALID
        ------------

        System.out.println(name);

        WHY ERROR?

        Because:

            name belongs to OBJECT

        But:

            static method belongs to CLASS
        */


        /*
        ❌ INVALID
        ------------

        display();

        WHY ERROR?

        Because display() belongs to OBJECT.

        JVM asks:

            "Which object's display()?"
        */



        /*
        🧠 JVM CONFUSION
        -----------------

        Suppose:

            s1.name = "Aman"

            s2.name = "Rahul"

        Now JVM asks:

            "Which object's name should I use?"

            s1.name ?
            OR
            s2.name ?
        */



        /*
        ✅ CORRECT WAY
        ----------------

        Create object first.
        */

        Studenttttttt s1 = new Studenttttttt();



        /*
        Assign value to object variable.
        */

        s1.name = "Aman";



        /*
        ✅ VALID
        ----------

        Using object reference.

        JVM now knows:

            use s1 object's variable
        */

        System.out.println(
                s1.name
        );



        /*
        ✅ VALID
        ----------

        Calling non-static method
        using object.
        */

        s1.display();
    }



    /*
    🔹 NON-STATIC METHOD
    ---------------------

    Instance methods CAN access:

        ✅ static members
        ✅ non-static members

    WHY?

    Because object exists.
    */

    void show() {


        /*
        ✅ VALID
        ----------

        Accessing instance variable.
        */

        System.out.println(
                name
        );



        /*
        ✅ VALID
        ----------

        Accessing static variable.
        */

        System.out.println(
                company
        );



        /*
        ✅ VALID
        ----------

        Calling instance method.
        */

        display();



        /*
        ✅ VALID
        ----------

        Calling static method.
        */

        test();
    }
}



/*
🔹 MAIN CLASS
--------------
Program execution starts from main().
*/

public class _3_WhyStaticCannotAccessNonStatic {

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
│   Studenttttttt.class                          │
│                                                 │
│   Static Variable                              │
│   --------------------------------             │
│   company = "OpenAI"                           │
│                                                 │
│   Static Methods                               │
│   --------------------------------             │
│   test()                                       │
│                                                 │
│   Instance Methods                             │
│   --------------------------------             │
│   display()                                    │
│   show()                                       │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Static members loaded during class loading
✅ Methods stored in METHOD AREA
✅ No object exists yet
*/


        /*
        🚀 STEP 2 : STATIC METHOD EXECUTION
        ====================================

        No object required.
        */

        Studenttttttt.test();


        /*
        🧠 MEMORY DURING STATIC METHOD EXECUTION
        =========================================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│   main() Frame                                 │
│                                                 │
├─────────────────────────────────────────────────┤
│                                                 │
│   test() Frame                                 │
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
│   Studenttttttt Object                         │
│                                                 │
│   name = "Aman"                                │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Static method created object manually
✅ JVM now knows which object to use
*/


        /*
        🚀 STEP 3 : NON-STATIC METHOD EXECUTION
        ========================================

        Requires object.
        */

        Studenttttttt s2 = new Studenttttttt();

        s2.show();
    }
}



/*
💬 OUTPUT
===========

Company : OpenAI

Aman

Name : Aman

Aman

OpenAI

Name : Aman

Company : OpenAI

Aman

Name : Aman



🔥 STATIC vs NON-STATIC ACCESS RULES
=====================================

STATIC METHOD
---------------
✅ Can directly access:
    static variables
    static methods

❌ Cannot directly access:
    instance variables
    instance methods


INSTANCE METHOD
-----------------
✅ Can access BOTH:
    static members
    non-static members



🔥 WHY STATIC CANNOT ACCESS NON-STATIC?
========================================

Static method belongs to:

    CLASS

Non-static members belong to:

    OBJECT

Without object JVM gets confused:

    "Which object's data should I use?"



🔥 MOST IMPORTANT REASON
=========================

Static method has:

    ❌ NO this reference

Without this,
JVM has NO current object.



🔥 MEMORY UNDERSTANDING
========================

METHOD AREA
-------------
✅ Static variables
✅ Static methods
✅ Instance method definitions


HEAP MEMORY
-------------
✅ Object data
✅ Instance variable values


STACK MEMORY
--------------
✅ Method execution
✅ Reference variables
✅ Local variables



🔥 GOLDEN RULE
================

CLASS LEVEL CODE
    cannot directly access
    OBJECT LEVEL MEMBERS



🔥 FASTEST MEMORY HACK
=======================

Static method asks:

    "Do I have object?"

NO
    → cannot access non-static directly

YES
    → access allowed
*/