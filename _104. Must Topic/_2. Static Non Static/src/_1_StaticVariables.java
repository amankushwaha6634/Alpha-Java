/*
📘 TOPIC: Static Variables In Java
===================================

🧠 WHAT YOU’LL LEARN
---------------------
1️⃣ What is static variable
2️⃣ Why static variable is needed
3️⃣ Difference between static & instance variable
4️⃣ Memory visualization
5️⃣ Why only one copy exists
6️⃣ How static is shared among objects



🔹 WHAT IS A STATIC VARIABLE?
------------------------------

A static variable belongs to:

    ✅ CLASS

NOT object.

Meaning:

    only ONE copy exists
    for all objects.



🔹 WHY STATIC VARIABLE IS NEEDED?
----------------------------------

Suppose all employees work in same company.

Without static:

    every object gets separate company variable

which wastes memory.

So static creates:

    ONE shared variable.
*/



/*
🔹 CLASS CREATION
------------------
*/

class Employeeeeee {


    /*
    🔹 INSTANCE VARIABLES
    ----------------------

    Every object gets separate copy.

    Stored inside HEAP object.
    */

    String name;
    int age;



    /*
    🔹 STATIC VARIABLE
    -------------------

    Shared by all objects.

    Stored only ONCE
    in METHOD AREA.
    */

    static String company = "OpenAI";
}



/*
🔹 MAIN CLASS
--------------
Program execution starts from main().
*/

public class _1_StaticVariables {

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
│   Employeeeeee.class                           │
│                                                 │
│   Instance Variable Structure                  │
│   --------------------------------             │
│   String name                                  │
│   int age                                      │
│                                                 │
│   Static Variable                              │
│   --------------------------------             │
│   company = "OpenAI"                           │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Static variable created during class loading
✅ Only ONE copy exists
✅ Shared by all objects
*/


        /*
        🚀 STEP 2 : OBJECT CREATION
        ============================

        Creates first object.
        */

        Employeeeeee e1 = new Employeeeeee();

        e1.name = "Aman";
        e1.age = 25;


        /*
        🚀 STEP 3 : SECOND OBJECT
        ==========================

        Creates second object.
        */

        Employeeeeee e2 = new Employeeeeee();

        e2.name = "Rahul";
        e2.age = 30;


        /*
        🧠 MEMORY AFTER OBJECT CREATION
        =================================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 METHOD AREA                    │
├─────────────────────────────────────────────────┤
│                                                 │
│   Employeeeeee.class                           │
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
│   Employeeeeee Object                          │
│                                                 │
│   name = "Aman"                                │
│   age  = 25                                    │
│                                                 │
├─────────────────────────────────────────────────┤
│                                                 │
│   Address : 202                                │
│   ------------------------------------          │
│                                                 │
│   Employeeeeee Object                          │
│                                                 │
│   name = "Rahul"                               │
│   age  = 30                                    │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ name & age are separate for every object
✅ company is shared by ALL objects
✅ company does NOT go inside objects
*/


        /*
        🚀 STEP 4 : ACCESS STATIC VARIABLE
        ===================================

        Best way:

            ClassName.variable
        */

        System.out.println(
                Employeeeeee.company
        );


        /*
        🚀 STEP 5 : MODIFY STATIC VARIABLE
        ===================================

        Changing static variable affects ALL objects.
        */

        Employeeeeee.company = "Google";


        /*
        🚀 STEP 6 : CHECK VALUES
        =========================
        */

        System.out.println(
                e1.company
        );

        System.out.println(
                e2.company
        );
    }
}



/*
💬 OUTPUT
===========

OpenAI

Google
Google



🔥 STATIC vs INSTANCE VARIABLE
================================

INSTANCE VARIABLE
-------------------
✅ Belongs to object
✅ Stored in HEAP
✅ Separate copy for each object


STATIC VARIABLE
-----------------
✅ Belongs to class
✅ Stored in METHOD AREA
✅ Only ONE shared copy



🔥 WHY STATIC SAVES MEMORY
============================

Without static:

    every object stores duplicate data

With static:

    JVM stores only ONE shared copy.



🔥 IMPORTANT RULES
===================

✅ Static variable belongs to CLASS

✅ Access using:
    ClassName.variable

✅ Only one copy exists

✅ Shared among all objects

✅ Created during class loading



🔥 GOLDEN RULE
================

STATIC
=
shared by all objects



🔥 FASTEST MEMORY HACK
=======================

Ask yourself:

    "Should every object have separate copy?"

YES
    → instance variable

NO
    → static variable
*/