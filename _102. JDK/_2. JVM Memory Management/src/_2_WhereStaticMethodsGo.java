/*
📘 TOPIC: Where Do Static Methods Go In Memory?
================================================

🧠 WHAT YOU’LL LEARN
---------------------
1️⃣ Where static methods are stored
2️⃣ Why static methods belong to class
3️⃣ Difference between static and instance methods
4️⃣ Why static methods do not need object
5️⃣ JVM memory visualization



🔹 EXAMPLE CLASS
-----------------
*/

class Employeee {

    /*
    🔹 STATIC VARIABLE
    -------------------
    Belongs to class.
    Stored in METHOD AREA.
    */

    static String company = "OpenAI";


    /*
    🔹 STATIC METHOD
    -----------------
    Belongs to class.

    Stored in METHOD AREA.
    */

    static void showCompany() {

        System.out.println(company);
    }


    /*
    🔹 INSTANCE VARIABLE
    ---------------------
    Belongs to object.

    Stored inside HEAP object.
    */

    String name;


    /*
    🔹 INSTANCE METHOD
    -------------------
    Method definition also stored
    in METHOD AREA.

    But requires object to execute.
    */

    void work() {

        System.out.println(name + " is working");
    }
}



/*
🔹 MAIN CLASS
--------------
Program execution starts from main().
*/

public class _2_WhereStaticMethodsGo {

    public static void main(String[] args) {


        /*
        🚀 STEP 1 : CLASS LOADING
        ==========================

        JVM first loads Employee.class
        into METHOD AREA.
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
│   Employee.class                               │
│                                                 │
│   Static Variables:                            │
│      company = "OpenAI"                        │
│                                                 │
│   Static Methods:                              │
│      showCompany()                             │
│                                                 │
│   Instance Methods:                            │
│      work()                                    │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Static methods stored in METHOD AREA
✅ Static variables stored in METHOD AREA
✅ Only ONE copy exists
✅ No object created yet
*/


        /*
        🚀 STEP 2 : CALL STATIC METHOD
        ===============================

        Static methods belong to CLASS.

        So object is NOT required.
        */

        Employeee.showCompany();


        /*
        🚀 STEP 3 : CREATE OBJECT
        ==========================

        Object required for instance members.
        */

        Employeee e1 = new Employeee();

        e1.name = "Aman";

        e1.work();


        /*
        🧠 MEMORY AFTER OBJECT CREATION
        =================================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 METHOD AREA                    │
├─────────────────────────────────────────────────┤
│                                                 │
│   Employee.class                               │
│                                                 │
│   Static Variables:                            │
│      company = "OpenAI"                        │
│                                                 │
│   Static Methods:                              │
│      showCompany()                             │
│                                                 │
│   Instance Methods:                            │
│      work()                                    │
│                                                 │
└─────────────────────────────────────────────────┘




┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│      e1                                         │
│      │                                          │
│      │                                          │
│      ▼                                          │
│     101                                         │
│                                                 │
└─────────────────────────────────────────────────┘




┌─────────────────────────────────────────────────┐
│                  HEAP MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│   Address : 101                                │
│   ------------------------------------          │
│                                                 │
│   Employee Object                              │
│                                                 │
│   name = "Aman"                                │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Static methods do NOT go inside objects
✅ Instance methods also NOT copied into objects
✅ Methods stay in METHOD AREA
✅ Objects only store instance variable data
*/
    }
}



/*
💬 OUTPUT
===========

OpenAI
Aman is working



🔥 STATIC METHOD vs INSTANCE METHOD
====================================

STATIC METHOD
---------------
✅ Belongs to class
✅ No object needed
✅ Stored in METHOD AREA
✅ Called using class name


INSTANCE METHOD
----------------
✅ Belongs to object behavior
✅ Requires object
✅ Method definition stored in METHOD AREA
✅ Uses object data



🔥 GOLDEN RULE
================

Methods NEVER go inside objects.

Objects only contain:
    ✅ Instance variable data

Methods remain shared inside:
    ✅ METHOD AREA
*/