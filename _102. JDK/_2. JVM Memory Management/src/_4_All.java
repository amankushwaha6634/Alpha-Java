/*
📘 TOPIC: Complete JVM Memory Management
========================================

🧠 WHAT YOU’LL LEARN
---------------------
1️⃣ Method Area
2️⃣ Heap Memory
3️⃣ Stack Memory
4️⃣ Instance Variables
5️⃣ Static Variables
6️⃣ Instance Methods
7️⃣ Static Methods
8️⃣ Local Variables
9️⃣ Method Execution Flow
🔟 Complete JVM Diagram



🔹 JVM MEMORY RULE
-------------------

CLASS LEVEL
    → METHOD AREA

OBJECT LEVEL
    → HEAP

METHOD EXECUTION LEVEL
    → STACK



🔹 EXAMPLE CLASS
-----------------
*/

class Employeeee {

    /*
    🔹 INSTANCE VARIABLES
    ----------------------

    Belong to OBJECT.

    Structure stored in METHOD AREA.
    Actual values stored in HEAP object.
    */

    String name;
    int age;


    /*
    🔹 STATIC VARIABLE
    -------------------

    Belongs to CLASS.

    Stored only ONCE
    in METHOD AREA.
    */

    static String company = "OpenAI";


    /*
    🔹 STATIC METHOD
    -----------------

    Belongs to CLASS.

    Stored in METHOD AREA.
    */

    static void showCompany() {

        System.out.println(
                "Company : " + company
        );
    }


    /*
    🔹 INSTANCE METHOD
    -------------------

    Method definition stored
    in METHOD AREA.

    Uses object data.
    */

    void work() {

        /*
        🔹 LOCAL VARIABLE
        ------------------

        Exists only during
        method execution.

        Stored in STACK MEMORY.
        */

        int hours = 8;


        System.out.println(
                name + " works for " +
                        hours + " hours"
        );
    }
}



/*
🔹 MAIN CLASS
--------------
Program execution starts from main().
*/

public class All {

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
│   Object Structure / Blueprint                 │
│   --------------------------------             │
│   String name                                  │
│   int age                                      │
│                                                 │
│   Static Variables                             │
│   --------------------------------             │
│   company = "OpenAI"                           │
│                                                 │
│   Static Methods                               │
│   --------------------------------             │
│   showCompany()                                │
│                                                 │
│   Instance Methods                             │
│   --------------------------------             │
│   work()                                       │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Only blueprint exists
❌ No object exists yet
❌ No actual values yet
*/


        /*
        🚀 STEP 2 : OBJECT CREATION
        ============================

        This line:

            Employee e1 = new Employee();

        does 3 things:

        1️⃣ Creates reference variable in STACK
        2️⃣ Creates object in HEAP
        3️⃣ Stores object address in reference
        */

        Employee e1 = new Employee();


        /*
        🧠 MEMORY AFTER OBJECT CREATION
        ================================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 METHOD AREA                    │
├─────────────────────────────────────────────────┤
│                                                 │
│ Employee.class                                 │
│ company = "OpenAI"                             │
│ showCompany()                                  │
│ work()                                         │
│                                                 │
└─────────────────────────────────────────────────┘




┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│     e1                                          │
│     │                                           │
│     │                                           │
│     ▼                                           │
│    101                                          │
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
│   name = null                                  │
│   age  = 0                                     │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ e1 is NOT actual object
✅ e1 stores ADDRESS of object
✅ Actual object lives in HEAP
*/


        /*
        🚀 STEP 3 : ASSIGN VALUES
        ==========================

        JVM uses e1 reference
        to find heap object.
        */

        e1.name = "Aman";
        e1.age = 25;


        /*
        🧠 MEMORY AFTER ASSIGNING VALUES
        =================================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│     e1                                          │
│     │                                           │
│     ▼                                           │
│    101                                          │
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
│   age  = 25                                    │
│                                                 │
└─────────────────────────────────────────────────┘
*/


        /*
        🚀 STEP 4 : STATIC METHOD CALL
        ===============================

        No object required.

        Because static methods belong to CLASS.
        */

        Employeeee.showCompany();


        /*
        🚀 STEP 5 : INSTANCE METHOD CALL
        =================================

        Requires object.

        Creates METHOD FRAME in STACK.
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
│ Employee.class                                 │
│ company = "OpenAI"                             │
│ showCompany()                                  │
│ work()                                         │
│                                                 │
└─────────────────────────────────────────────────┘




┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│  main() Frame                                  │
│  ----------------------------                   │
│  e1 ─────────────────────→ 101                 │
│                                                 │
├─────────────────────────────────────────────────┤
│                                                 │
│  work() Frame                                  │
│  ----------------------------                   │
│  hours = 8                                     │
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
│   age  = 25                                    │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Local variables stored in STACK
✅ Method execution happens in STACK
✅ Method definitions stay in METHOD AREA
✅ Object data stays in HEAP
*/


        /*
        🚀 STEP 6 : METHOD FINISHES
        ============================

        work() frame removed from STACK.

        Local variables destroyed.
        */


        /*
        🧠 MEMORY AFTER METHOD FINISHES
        =================================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│  main() Frame                                  │
│  ----------------------------                   │
│  e1 ─────────────────────→ 101                 │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
❌ hours destroyed
❌ work() frame removed
✅ Object still alive in HEAP
*/
    }
}



/*
💬 OUTPUT
===========

Company : OpenAI
Aman works for 8 hours



🔥 COMPLETE MEMORY SUMMARY
============================

METHOD AREA
-------------
✅ Class blueprint
✅ Method definitions
✅ Static variables
✅ Static methods


HEAP MEMORY
-------------
✅ Actual objects
✅ Instance variable values


STACK MEMORY
--------------
✅ Reference variables
✅ Local variables
✅ Method execution frames



🔥 MOST IMPORTANT UNDERSTANDING
================================

METHOD AREA
-------------
"What object SHOULD contain"


HEAP
------
"What object CURRENTLY contains"


STACK
-------
"Who is USING the object"



🔥 GOLDEN RULE
================

STATIC
→ METHOD AREA

INSTANCE VARIABLES
→ HEAP

LOCAL VARIABLES
→ STACK

METHOD EXECUTION
→ STACK

METHOD DEFINITIONS
→ METHOD AREA
*/