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


Basic Idea:

    Method Area -> Class level things
    Heap Memory -> Actual objects
    Stack Memory -> References & method calls



🧠 JVM MEMORY OVERVIEW
=======================

                JVM MEMORY
════════════════════════════════════


┌──────────────────────┐
│     METHOD AREA      │
└──────────────────────┘


┌──────────────────────┐
│      HEAP MEMORY     │
└──────────────────────┘


┌──────────────────────┐
│      STACK MEMORY    │
└──────────────────────┘




🔹 EXAMPLE CLASS
-----------------
*/

class Employee {

    /*
    🔹 INSTANCE VARIABLES
    ----------------------
    Belong to object.
    Stored inside HEAP object.
    */

    String name;
    int age;


    /*
    🔹 STATIC VARIABLE
    -------------------
    Belongs to class.
    Stored in METHOD AREA.
    */

    static String company = "OpenAI";


    /*
    🔹 INSTANCE METHOD
    -------------------
    Method definition stored in METHOD AREA.
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


        METHOD AREA
        ────────────────────

        Employee.class

        name
        age

        company = "OpenAI"

        work()


        IMPORTANT:
        -----------
        ❌ No object created yet

        Only blueprint/class info exists.
        */


        /*
        🚀 STEP 2 : OBJECT CREATION
        ============================

        This line:

            Employee e1 = new Employee();

        does MANY things internally.
        */

        Employee e1 = new Employee();


        /*
        🔹 PART 1
        -----------

        Employee e1

        creates reference variable.

        Stored in STACK MEMORY.
        */


        /*
        🔹 PART 2
        -----------

        new Employee()

        creates REAL object in HEAP MEMORY.
        */


        /*
        🔹 PART 3
        -----------

        e1 stores ADDRESS of heap object.
        */


        /*
        🧠 MEMORY AFTER OBJECT CREATION
        =================================

                        JVM MEMORY
        ════════════════════════════════════



        METHOD AREA
        ────────────────────

        Employee.class

        company = "OpenAI"

        work()




        STACK MEMORY
        ────────────────────

        e1 ───────────────→ 101




        HEAP MEMORY
        ────────────────────

        Address : 101

        Employee Object
        ----------------
        name = null
        age  = 0



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

        STACK MEMORY
        ────────────────────

        e1 ───────────────→ 101




        HEAP MEMORY
        ────────────────────

        Address : 101

        Employee Object
        ----------------
        name = "Aman"
        age  = 25
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
        ════════════════════════════════════



        METHOD AREA
        ────────────────────

        Employee.class

        company = "OpenAI"

        work()




        STACK MEMORY
        ────────────────────

        e1 ───────────────→ 101

        e2 ───────────────→ 202




        HEAP MEMORY
        ────────────────────

        Address : 101

        Employee Object
        ----------------
        name = "Aman"
        age  = 25



        Address : 202

        Employee Object
        ----------------
        name = "Rahul"
        age  = 23



        IMPORTANT:
        -----------
        ✅ Every object gets separate memory
        ✅ Instance variables stored in HEAP
        ✅ Static variables stored in METHOD AREA
        ✅ Reference variables stored in STACK
        */


        /*
        🔹 METHOD CALL
        ----------------

        Method definition already exists
        inside METHOD AREA.

        Object simply uses that method.
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
✅ Static variables
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