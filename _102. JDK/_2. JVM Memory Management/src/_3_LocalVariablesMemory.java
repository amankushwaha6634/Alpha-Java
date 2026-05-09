/*
📘 TOPIC: Where Do Local Variables Go In Memory?
=================================================

🧠 WHAT YOU’LL LEARN
---------------------
1️⃣ What are local variables
2️⃣ Where local variables are stored
3️⃣ Difference between instance & local variables
4️⃣ What happens during method execution
5️⃣ Stack frame concept
6️⃣ Complete memory visualization



🔹 EXAMPLE CLASS
-----------------
*/

class Employeee {

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

    Method definition stored
    in METHOD AREA.

    Local variables created during
    method execution go into STACK.
    */

    void work() {

        /*
        🔹 LOCAL VARIABLE
        ------------------

        Exists only during method execution.

        Stored in STACK MEMORY.
        */

        int hours = 8;

        System.out.println(
                name + " works for " + hours + " hours"
        );
    }
}



/*
🔹 MAIN CLASS
--------------
Program execution starts from main().
*/

public class _3_LocalVariablesMemory {

    public static void main(String[] args) {


        /*
        🚀 STEP 1 : CLASS LOADING
        ==========================

        JVM loads Employee.class
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
│   Object Structure:                            │
│      String name                               │
│                                                 │
│   Methods:                                     │
│      work()                                    │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Only class blueprint exists
✅ No object created yet
*/


        /*
        🚀 STEP 2 : OBJECT CREATION
        ============================

        Creates object in HEAP.
        */

        Employeee e1 = new Employeee();

        e1.name = "Aman";


        /*
        🧠 MEMORY AFTER OBJECT CREATION
        ================================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│      e1                                         │
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
*/


        /*
        🚀 STEP 3 : METHOD EXECUTION
        =============================

        Method call:

            e1.work();

        creates METHOD FRAME in STACK.
        */

        e1.work();


        /*
        🧠 MEMORY DURING METHOD EXECUTION
        ==================================


                    JVM MEMORY
════════════════════════════════════════════════════


┌─────────────────────────────────────────────────┐
│                 METHOD AREA                    │
├─────────────────────────────────────────────────┤
│                                                 │
│   Employee.class                               │
│                                                 │
│   Object Structure:                            │
│      String name                               │
│                                                 │
│   Methods:                                     │
│      work()                                    │
│                                                 │
└─────────────────────────────────────────────────┘


┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│   main() Frame                                 │
│   ---------------------                        │
│   e1 ───────────────→ 101                      │
│                                                 │
├─────────────────────────────────────────────────┤
│                                                 │
│   work() Frame                                 │
│   ---------------------                        │
│   hours = 8                                    │
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
✅ Local variable stored in STACK
✅ Created during method execution
✅ Removed after method finishes
*/


        /*
        🚀 STEP 4 : METHOD FINISHES
        ============================

        work() method ends.

        Stack frame removed.
        */


        /*
        🧠 MEMORY AFTER METHOD COMPLETION
        ==================================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│   main() Frame                                 │
│   ---------------------                        │
│   e1 ───────────────→ 101                      │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
❌ hours variable destroyed
❌ work() frame removed
✅ Object still exists in HEAP
*/
    }
}



/*
💬 OUTPUT
===========

Aman works for 8 hours



🔥 INSTANCE VARIABLE vs LOCAL VARIABLE
=======================================

INSTANCE VARIABLE
-------------------
✅ Belongs to object
✅ Stored in HEAP
✅ Lives as long as object exists


LOCAL VARIABLE
----------------
✅ Belongs to method execution
✅ Stored in STACK
✅ Destroyed after method ends



🔥 GOLDEN RULE
================

CLASS LEVEL
-------------
→ METHOD AREA


OBJECT LEVEL
--------------
→ HEAP


METHOD EXECUTION LEVEL
------------------------
→ STACK



🔥 MOST IMPORTANT UNDERSTANDING
================================

Method definition:
    Stored in METHOD AREA

Method execution variables:
    Stored in STACK

Actual object data:
    Stored in HEAP
*/