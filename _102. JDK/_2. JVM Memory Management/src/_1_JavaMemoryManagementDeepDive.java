/*
📘 TOPIC: Java Memory Management Deep Dive
===========================================

🧠 WHAT YOU’LL LEARN
---------------------
1️⃣ What happens internally in JVM
2️⃣ What is Method Area
3️⃣ What is Heap Memory
4️⃣ What is Stack Memory
5️⃣ How objects are created
6️⃣ How references work
7️⃣ Where static variables are stored
8️⃣ Complete memory flow



🔹 JVM MEMORY STRUCTURE
------------------------

JVM divides memory into different areas.

Main memory areas:

    ✅ Method Area
    ✅ Heap Memory
    ✅ Stack Memory



🧠 JVM MEMORY OVERVIEW
=======================


                JVM MEMORY
═══════════════════════════════════════════════════


        ┌────────────────────────────┐
        │        METHOD AREA        │
        └────────────────────────────┘


        ┌────────────────────────────┐
        │        HEAP MEMORY        │
        └────────────────────────────┘


        ┌────────────────────────────┐
        │        STACK MEMORY       │
        └────────────────────────────┘




🔹 EXAMPLE CLASS
-----------------
*/

class Employee {

    /*
    🔹 INSTANCE VARIABLES
    ----------------------
    Stored inside object.
    */

    String name;
    int age;


    /*
    🔹 STATIC VARIABLE
    -------------------
    Stored in METHOD AREA.
    */

    static String company = "OpenAI";


    /*
    🔹 INSTANCE METHOD
    -------------------
    Method definition stored
    in METHOD AREA.
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

public class _1_JavaMemoryManagementDeepDive {

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
═══════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 METHOD AREA                    │
├─────────────────────────────────────────────────┤
│                                                 │
│   Employee.class                               │
│                                                 │
│   Instance Variable Structure:                 │
│      String name                               │
│      int age                                   │
│                                                 │
│   Static Variables:                            │
│      company = "OpenAI"                        │
│                                                 │
│   Methods:                                     │
│      work()                                    │
│                                                 │
└─────────────────────────────────────────────────┘
    IMPORTANT:
    -----------
    ❌ No object exists yet

    Only blueprint/class information exists.
*/


        /*
        🚀 STEP 2 : OBJECT CREATION
        ============================

        This line:

            Employee e1 = new Employee();

        This line: does MANY things internally.
        /*
        🔹 PART 1
        -----------
        Employee e1
        creates reference variable.
        Stored in STACK MEMORY.

        🔹 PART 2
        -----------
        new Employee()
        creates REAL object in HEAP MEMORY.
        */

        Employee e1 = new Employee();


        /*
        🧠 MEMORY AFTER OBJECT CREATION
        ================================
                JVM MEMORY
═══════════════════════════════════════════════════
┌─────────────────────────────────────────────────┐
│                 METHOD AREA                    │
├─────────────────────────────────────────────────┤
│                                                 │
│   Employee.class                               │
│                                                 │
│   Instance Variable Structure:                 │
│      String name                               │
│      int age                                   │
│                                                 │
│   Static Variables:                            │
│      company = "OpenAI"                        │
│                                                 │
│   Methods:                                     │
│      work()                                    │
│                                                 │
└─────────────────────────────────────────────────┘




┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
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
│   name = null                                  │
│   age  = 0                                     │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ e1 stores object address
✅ Actual object lives in HEAP
✅ Default values assigned automatically
*/


        /*
        🚀 STEP 3 : ASSIGN VALUES
        ==========================

        JVM uses e1 reference
        to locate heap object.
        */

        e1.name = "Aman";
        e1.age = 25;


        /*
        🧠 MEMORY AFTER ASSIGNING VALUES
        =================================


                JVM MEMORY
═══════════════════════════════════════════════════



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
│   age  = 25                                    │
│                                                 │
└─────────────────────────────────────────────────┘
*/


        /*
        🚀 STEP 4 : SECOND OBJECT
        ==========================

        New object gets separate memory.
        */

        Employee e2 = new Employee();

        e2.name = "Rahul";
        e2.age = 23;


        /*
        🧠 FINAL MEMORY STATE
        ======================


                        JVM MEMORY
═══════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 METHOD AREA                    │
├─────────────────────────────────────────────────┤
│                                                 │
│   Employee.class                               │
│                                                 │
│   Instance Variable Structure:                 │
│      String name                               │
│      int age                                   │
│                                                 │
│   Static Variables:                            │
│      company = "OpenAI"                        │
│                                                 │
│   Methods:                                     │
│      work()                                    │
│                                                 │
└─────────────────────────────────────────────────┘



┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│      e1                         e2              │
│      │                          │               │
│      │                          │               │
│      ▼                          ▼               │
│     101                        202              │
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
├─────────────────────────────────────────────────┤
│                                                 │
│   Address : 202                                │
│   ------------------------------------          │
│                                                 │
│   Employee Object                              │
│                                                 │
│   name = "Rahul"                               │
│   age  = 23                                    │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Every object gets separate HEAP memory
✅ e1 and e2 point to different objects
✅ Static variable shared by all objects
✅ Methods are NOT copied into objects
*/


        /*
        🔹 METHOD CALL
        ----------------
        Method definition already exists
        in METHOD AREA.

        Objects simply use that method.
        */

        e1.work();
        e2.work();
    }
}



/*
💬 OUTPUT
===========

Aman is working
Rahul is working



🔥 GOLDEN RULE
================

METHOD AREA
-------------
✅ Class metadata
✅ Static variables with values
✅ Method definitions


HEAP MEMORY
-------------
✅ Actual objects
✅ Instance variables


STACK MEMORY
--------------
✅ Reference variables
✅ Local variables
✅ Method calls



🔥 MOST IMPORTANT UNDERSTANDING
================================

e1 and e2 are NOT actual objects.
They only store ADDRESS of objects.
Actual objects live in HEAP MEMORY.



🔥 WHY STATIC IS SHARED?
=========================

Because static variables live in METHOD AREA.
Only ONE copy exists.



🔥 WHY INSTANCE VARIABLES DIFFER?
==================================

Because every object gets separate
memory inside HEAP.
*/

