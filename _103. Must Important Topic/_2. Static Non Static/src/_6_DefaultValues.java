/*
📘 TOPIC: Default Values Of Variables In Java
==============================================

🧠 WHAT YOU’LL LEARN
---------------------
1️⃣ Default values of static variables
2️⃣ Default values of instance variables
3️⃣ Why local variables don't get default values
4️⃣ Memory visualization
5️⃣ JVM initialization flow
6️⃣ Important interview rules



🔹 IMPORTANT UNDERSTANDING
---------------------------

Java automatically gives default values to:

    ✅ static variables
    ✅ instance variables

But NOT to:

    ❌ local variables



🔹 WHY JVM GIVES DEFAULT VALUES?
---------------------------------

Because JVM manages:

    METHOD AREA
    HEAP MEMORY

So JVM initializes variables there automatically.



🔹 WHY LOCAL VARIABLES DON'T GET DEFAULT VALUES?
-------------------------------------------------

Because local variables live in:

    STACK MEMORY

and JVM does NOT initialize local stack variables automatically.
*/



/*
🔹 CLASS CREATION
------------------
*/

class Employeeeeeeeee {


    /*
    🔹 STATIC VARIABLES
    --------------------

    Stored in METHOD AREA.

    Default values assigned
    during class loading.
    */

    static int companyId;

    static boolean isActive;



    /*
    🔹 INSTANCE VARIABLES
    ----------------------

    Stored inside HEAP object.

    Default values assigned
    during object creation.
    */

    String name;

    int age;

    double salary;

    boolean married;



    /*
    🔹 INSTANCE METHOD
    -------------------

    Used to print values.
    */

    void display() {

        System.out.println(
                "name = " + name
        );

        System.out.println(
                "age = " + age
        );

        System.out.println(
                "salary = " + salary
        );

        System.out.println(
                "married = " + married
        );
    }



    /*
    🔹 LOCAL VARIABLE EXAMPLE
    --------------------------

    Local variables do NOT get default values.
    */

    void test() {


        /*
        Local variable stored in STACK.
        */

        int x;


        /*
        ❌ INVALID
        ------------

        System.out.println(x);

        WHY ERROR?

        JVM does NOT initialize
        local variables automatically.
        */
    }
}



/*
🔹 MAIN CLASS
--------------
Program execution starts from main().
*/

public class _6_DefaultValues {

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
│   Employeeeeeeeee.class                        │
│                                                 │
│   Static Variables                             │
│   --------------------------------             │
│   companyId = 0                                │
│   isActive = false                             │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Static variables get default values
✅ Assigned during class loading
*/


        /*
        🚀 STEP 2 : ACCESS STATIC VARIABLES
        ====================================

        No object required.
        */

        System.out.println(
                "companyId = " +
                        Employeeeeeeeee.companyId
        );

        System.out.println(
                "isActive = " +
                        Employeeeeeeeee.isActive
        );


        /*
        🚀 STEP 3 : OBJECT CREATION
        ============================

        JVM creates object in HEAP.

        Instance variables get default values.
        */

        Employeeeeeeeee e1 =
                new Employeeeeeeeee();


        /*
        🧠 MEMORY AFTER OBJECT CREATION
        =================================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│   e1 ─────────────────────→ 101                │
│                                                 │
└─────────────────────────────────────────────────┘




┌─────────────────────────────────────────────────┐
│                  HEAP MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│   Address : 101                                │
│   ------------------------------------          │
│                                                 │
│   Employeeeeeeeee Object                       │
│                                                 │
│   name     = null                              │
│   age      = 0                                 │
│   salary   = 0.0                               │
│   married  = false                             │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Instance variables get default values
✅ Assigned during object creation
*/


        /*
        🚀 STEP 4 : DISPLAY VALUES
        ===========================

        Print default instance values.
        */

        e1.display();
    }
}



/*
💬 OUTPUT
===========

companyId = 0
isActive = false

name = null
age = 0
salary = 0.0
married = false



🔥 DEFAULT VALUES TABLE
========================

byte
    → 0

short
    → 0

int
    → 0

long
    → 0

float
    → 0.0

double
    → 0.0

char
    → '\\u0000'

boolean
    → false

Object Reference
    → null



🔥 VARIABLE TYPES vs DEFAULT VALUES
====================================

STATIC VARIABLE
-----------------
✅ Gets default value
✅ Stored in METHOD AREA


INSTANCE VARIABLE
-------------------
✅ Gets default value
✅ Stored in HEAP


LOCAL VARIABLE
----------------
❌ NO default value
✅ Stored in STACK



🔥 WHY LOCAL VARIABLES DON'T GET DEFAULT VALUES?
=================================================

Because local variables live in:

    STACK MEMORY

and JVM does NOT initialize stack variables automatically.



🔥 MEMORY UNDERSTANDING
========================

METHOD AREA
-------------
✅ Static variables


HEAP MEMORY
-------------
✅ Instance variables


STACK MEMORY
--------------
✅ Local variables
❌ No automatic initialization



🔥 GOLDEN RULE
================

JVM initializes:

    ✅ CLASS MEMORY
    ✅ OBJECT MEMORY

JVM does NOT initialize:

    ❌ LOCAL STACK VARIABLES



🔥 FASTEST MEMORY HACK
=======================

Ask:

    "Where is variable stored?"

METHOD AREA / HEAP
    → gets default value

STACK
    → no default value
*/