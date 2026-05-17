/*
📘 TOPIC: Static Block In Java
================================

🧠 WHAT YOU’LL LEARN
---------------------
1️⃣ What is static block
2️⃣ Why static block is needed
3️⃣ When static block executes
4️⃣ Memory visualization
5️⃣ Static block execution order
6️⃣ Why static block runs only once



🔹 WHAT IS A STATIC BLOCK?
---------------------------

A static block is a special block used for:

    ✅ one-time initialization

Syntax:

    static {

    }

It belongs to:

    ✅ CLASS



🔹 WHEN DOES STATIC BLOCK RUN?
--------------------------------

Static block runs:

    ✅ during class loading

BEFORE:

    main()
    object creation



🔹 WHY STATIC BLOCK IS NEEDED?
--------------------------------

Used when some initialization should happen:

    only once

Examples:
    database connection
    config loading
    driver loading
    static variable initialization
*/



/*
🔹 CLASS CREATION
------------------
*/

class Employeeeeeeee {


    /*
    🔹 STATIC VARIABLE
    -------------------

    Stored in METHOD AREA.
    */

    static String company;



    /*
    🔹 STATIC BLOCK
    ----------------

    Runs automatically
    during class loading.

    Executes only ONCE.
    */

    static {

        System.out.println(
                "Static Block Executed"
        );


        company = "OpenAI";
    }



    /*
    🔹 CONSTRUCTOR
    ----------------

    Runs during object creation.
    */

    Employeeeeeeee() {

        System.out.println(
                "Constructor Executed"
        );
    }



    /*
    🔹 STATIC METHOD
    -----------------

    Belongs to class.
    */

    static void showCompany() {

        System.out.println(
                "Company : " + company
        );
    }
}



/*
🔹 MAIN CLASS
--------------
Program execution starts from main().
*/

public class _4_StaticBlock {

    public static void main(String[] args) {


        /*
        🚀 STEP 1 : CLASS LOADING
        ==========================

        JVM loads class into METHOD AREA.
        */


        /*
        🧠 MEMORY DURING CLASS LOADING
        =================================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 METHOD AREA                    │
├─────────────────────────────────────────────────┤
│                                                 │
│   Employeeeeeeee.class                         │
│                                                 │
│   Static Variable                              │
│   --------------------------------             │
│   company = null                               │
│                                                 │
│   Static Block                                 │
│   --------------------------------             │
│   static { }                                   │
│                                                 │
│   Static Method                                │
│   --------------------------------             │
│   showCompany()                                │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Static members loaded first
✅ Static block executes during class loading
*/


        /*
        🚀 STEP 2 : STATIC BLOCK EXECUTION
        ===================================

        JVM executes static block automatically.

        company becomes:

            "OpenAI"
        */


        /*
        🧠 MEMORY AFTER STATIC BLOCK EXECUTION
        =======================================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 METHOD AREA                    │
├─────────────────────────────────────────────────┤
│                                                 │
│   company = "OpenAI"                           │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Static variable initialized
✅ Static block runs ONLY ONCE
*/


        /*
        🚀 STEP 3 : STATIC METHOD CALL
        ===============================

        No object required.
        */

        Employeeeeeeee.showCompany();


        /*
        🚀 STEP 4 : OBJECT CREATION
        ============================

        Constructor executes.

        Static block will NOT execute again.
        */

        Employeeeeeeee e1 = new Employeeeeeeee();

        Employeeeeeeee e2 = new Employeeeeeeee();


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
└─────────────────────────────────────────────────┘




┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│   e1 ─────────────────────→ 101                │
│                                                 │
│   e2 ─────────────────────→ 202                │
│                                                 │
└─────────────────────────────────────────────────┘




┌─────────────────────────────────────────────────┐
│                  HEAP MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│   Address : 101                                │
│   ------------------------------------          │
│                                                 │
│   Employeeeeeeee Object                        │
│                                                 │
├─────────────────────────────────────────────────┤
│                                                 │
│   Address : 202                                │
│   ------------------------------------          │
│                                                 │
│   Employeeeeeeee Object                        │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Static block did NOT run again
✅ Constructor runs for every object
*/
    }
}



/*
💬 OUTPUT
===========

Static Block Executed

Company : OpenAI

Constructor Executed
Constructor Executed



🔥 EXECUTION ORDER
===================

1️⃣ Static variables loaded

2️⃣ Static block executes

3️⃣ main() starts

4️⃣ Object creation happens

5️⃣ Constructor executes



🔥 IMPORTANT RULES
===================

✅ Static block belongs to CLASS

✅ Runs automatically

✅ Runs during class loading

✅ Executes ONLY ONCE

✅ Used for one-time initialization



🔥 STATIC BLOCK vs CONSTRUCTOR
================================

STATIC BLOCK
--------------
✅ Runs once
✅ During class loading
✅ Belongs to class


CONSTRUCTOR
-------------
✅ Runs every object creation
✅ During object creation
✅ Belongs to object



🔥 MEMORY UNDERSTANDING
========================

METHOD AREA
-------------
✅ Static variables
✅ Static block
✅ Static methods


HEAP MEMORY
-------------
✅ Objects


STACK MEMORY
--------------
✅ Method execution
✅ References



🔥 GOLDEN RULE
================

STATIC BLOCK
=
one-time class initialization



🔥 FASTEST MEMORY HACK
=======================

Ask:

    "Should this run only once?"

YES
    → static block

NO
    → constructor
*/

































/*
🚀 COMPLETE JVM EXECUTION FLOW
================================


Program Starts
    ↓

JVM Starts
    ↓

JVM Loads Class
    ↓

METHOD AREA Created
    ↓

Static Variables Created
    ↓

Default Values Assigned
    ↓

Static Block Executes
    ↓

main() Method Found
    ↓

main() Execution Starts
    ↓

STACK FRAME for main() Created
    ↓

Object Creation Happens
    ↓

HEAP MEMORY Allocated
    ↓

Instance Variables Created
    ↓

Default Values Assigned
    ↓

Constructor Executes
    ↓

Reference Stored In STACK
    ↓

Object Ready To Use



🔥 REAL FLOW WITH MEMORY
=========================


                JVM MEMORY
════════════════════════════════════════════════════



1️⃣ CLASS LOADING
───────────────────

JVM
    ↓
Loads Class
    ↓
METHOD AREA


┌─────────────────────────────────────┐
│            METHOD AREA             │
├─────────────────────────────────────┤
│                                     │
│   Test.class                        │
│                                     │
│   static int x = 10                 │
│                                     │
│   static { }                        │
│                                     │
│   static void show()                │
│                                     │
│   void display()                    │
│                                     │
└─────────────────────────────────────┘



2️⃣ STATIC BLOCK EXECUTION
───────────────────────────

Class Loaded
    ↓
Static Variables Initialized
    ↓
Static Block Runs
    ↓
main() Starts



3️⃣ main() EXECUTION
─────────────────────

main() Called
    ↓
STACK FRAME Created


┌─────────────────────────────────────┐
│            STACK MEMORY            │
├─────────────────────────────────────┤
│                                     │
│   main() Frame                      │
│                                     │
└─────────────────────────────────────┘



4️⃣ OBJECT CREATION
────────────────────

new Test()
    ↓
HEAP MEMORY Allocated
    ↓
Instance Variables Created
    ↓
Constructor Executes



┌─────────────────────────────────────┐
│             HEAP MEMORY            │
├─────────────────────────────────────┤
│                                     │
│   Address : 101                     │
│                                     │
│   Test Object                       │
│                                     │
│   name = "Aman"                     │
│   age  = 25                         │
│                                     │
└─────────────────────────────────────┘



5️⃣ REFERENCE VARIABLE
───────────────────────

Object Created
    ↓
Reference Stored In STACK



┌─────────────────────────────────────┐
│            STACK MEMORY            │
├─────────────────────────────────────┤
│                                     │
│   t1 ───────────────→ 101           │
│                                     │
└─────────────────────────────────────┘



🔥 FINAL EXECUTION ORDER
=========================

Class Loading
    ↓
Static Variables
    ↓
Static Block
    ↓
main()
    ↓
Object Creation
    ↓
Instance Variables
    ↓
Constructor
    ↓
Methods Execute



🔥 GOLDEN RULES
================

STATIC
    ↓
Created During Class Loading


INSTANCE
    ↓
Created During Object Creation


LOCAL VARIABLES
    ↓
Created During Method Execution



🔥 MEMORY RULES
================

METHOD AREA
-------------
→ Class Metadata
→ Static Variables
→ Static Methods
→ Instance Method Definitions


HEAP MEMORY
-------------
→ Objects
→ Instance Variables


STACK MEMORY
--------------
→ Method Frames
→ Local Variables
→ Reference Variables
*/