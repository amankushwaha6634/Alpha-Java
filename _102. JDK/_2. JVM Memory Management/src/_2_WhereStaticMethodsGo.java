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
7️⃣ Difference between structure vs actual data
8️⃣ Where static variables & methods are stored



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

class Employe {

    /*
    🔹 INSTANCE VARIABLES
    ----------------------

    IMPORTANT:
    These lines DO NOT create actual values.

    They only define OBJECT STRUCTURE.

    Actual values are created only
    after object creation.
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
    🔹 STATIC METHOD
    -----------------

    Belongs to class.

    Stored in METHOD AREA.
    */

    static void showCompany() {

        System.out.println(company);
    }


    /*
    🔹 INSTANCE METHOD
    -------------------

    Method definition stored
    in METHOD AREA.

    Method execution happens in STACK.
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
│   Object Structure / Blueprint:                │
│                                                 │
│      String name                               │
│      int age                                   │
│                                                 │
│   Static Variables:                            │
│                                                 │
│      company = "OpenAI"                        │
│                                                 │
│   Static Methods:                              │
│                                                 │
│      showCompany()                             │
│                                                 │
│   Instance Methods:                            │
│                                                 │
│      work()                                    │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Only blueprint/structure exists
✅ No actual object exists yet
✅ name & age values NOT created yet
*/


        /*
        🚀 STEP 2 : OBJECT CREATION
        ============================

        This line:

            Employee e1 = new Employee();

        creates:
            ✅ Reference variable in STACK
            ✅ Actual object in HEAP
        */

        Employe e1 = new Employe();


        /*
        🧠 MEMORY AFTER OBJECT CREATION
        ================================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 METHOD AREA                    │
├─────────────────────────────────────────────────┤
│                                                 │
│   Employee.class                               │
│                                                 │
│   Blueprint:                                   │
│      String name                               │
│      int age                                   │
│                                                 │
│   company = "OpenAI"                           │
│                                                 │
│   showCompany()                                │
│   work()                                       │
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
│   name = null                                  │
│   age  = 0                                     │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ e1 stores object address
✅ Actual object lives in HEAP
✅ Actual values now created in HEAP
✅ METHOD AREA only stores structure
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
════════════════════════════════════════════════════




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

        Employe e2 = new Employe();

        e2.name = "Rahul";
        e2.age = 23;


        /*
        🧠 FINAL MEMORY STATE
        ======================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 METHOD AREA                    │
├─────────────────────────────────────────────────┤
│                                                 │
│   Employee.class                               │
│                                                 │
│   Blueprint:                                   │
│      String name                               │
│      int age                                   │
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
✅ Actual object values stored in HEAP
✅ Methods are NOT copied into objects
✅ Static members shared by all objects
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

        Employe.showCompany();
    }
}



/*
💬 OUTPUT
===========

Aman is working
Rahul is working
OpenAI



🔥 GOLDEN RULE
================

METHOD AREA
-------------
✅ Class blueprint/structure
✅ Variable definitions
✅ Static variables
✅ Static methods
✅ Instance method definitions


HEAP MEMORY
-------------
✅ Actual objects
✅ Instance variable values


STACK MEMORY
--------------
✅ Reference variables
✅ Local variables
✅ Method execution



🔥 MOST IMPORTANT UNDERSTANDING
================================

METHOD AREA stores:
    "What object should contain"

HEAP stores:
    "Actual object data"



🔥 EXAMPLE
============

METHOD AREA:
--------------
String name

Means:
    Every Employee object should contain
    a variable called name


HEAP OBJECT:
--------------
name = "Aman"

This is actual runtime value.
*/