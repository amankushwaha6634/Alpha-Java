/*
📘 TOPIC: Constructors In Java
================================

🧠 WHAT YOU’LL LEARN
---------------------
1️⃣ What is Constructor
2️⃣ Why Constructor is needed
3️⃣ Default Constructor
4️⃣ Parameterized Constructor
5️⃣ Constructor vs Method
6️⃣ Object Initialization Flow
7️⃣ Memory Visualization
8️⃣ Important Rules



🔹 WHAT IS A CONSTRUCTOR?
--------------------------

A constructor is a special method-like block
used to initialize objects.

It runs automatically when object is created.

Example:

    new Employeeeee()

Here:

    Employeeeee()

is constructor call.



🔹 WHY CONSTRUCTOR IS NEEDED?
------------------------------

Without constructor:

    Employeeeee e1 = new Employeeeee();

    e1.name = "Aman";
    e1.age = 25;

We create object first,
then assign values separately.


With constructor:

    Employeeeee e1 = new Employeeeee("Aman", 25);

Object gets initialized immediately.
*/



/*
🔹 CLASS CREATION
------------------
*/

class Employeeeee {

    /*
    🔹 INSTANCE VARIABLES
    ----------------------
    Stored inside HEAP object.
    */

    String name;
    int age;



    /*
    🔹 DEFAULT CONSTRUCTOR
    -----------------------

    Constructor with NO parameters.

    Automatically called when object created.

    RULES:
    --------
    ✅ Constructor name = Class name
    ✅ No return type
    ✅ Runs automatically
    */

    Employeeeee() {

        System.out.println(
                "Default Constructor Called"
        );
    }



    /*
    🔹 PARAMETERIZED CONSTRUCTOR
    ----------------------------

    Used to initialize object
    with custom values.
    */

    Employeeeee(String n, int a) {

        /*
        LEFT SIDE:
            instance variables

        RIGHT SIDE:
            local variables / parameters
        */

        name = n;
        age = a;


        System.out.println(
                "Parameterized Constructor Called"
        );
    }



    /*
    🔹 INSTANCE METHOD
    -------------------
    */

    void display() {

        System.out.println(
                "Name : " + name
        );

        System.out.println(
                "Age : " + age
        );
    }
}



/*
🔹 MAIN CLASS
--------------
Program execution starts from main().
*/

public class _4_Constructors {

    public static void main(String[] args) {


        /*
        🚀 STEP 1 : OBJECT CREATION
        ============================

        Constructor automatically runs.
        */

        Employeeeee e1 = new Employeeeee();


        /*
        🧠 MEMORY AFTER DEFAULT CONSTRUCTOR
        ====================================


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
│   Employeeeee Object                           │
│                                                 │
│   name = null                                  │
│   age  = 0                                     │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Constructor executed automatically
✅ Object created in HEAP
✅ Reference stored in STACK
*/


        /*
        🚀 STEP 2 : PARAMETERIZED CONSTRUCTOR
        ======================================

        Values passed during object creation.
        */

        Employeeeee e2 = new Employeeeee(
                "Aman",
                25
        );


        /*
        🧠 MEMORY AFTER PARAMETERIZED CONSTRUCTOR
        ==========================================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│     e1                         e2               │
│     │                          │                │
│     ▼                          ▼                │
│    101                        202               │
│                                                 │
└─────────────────────────────────────────────────┘




┌─────────────────────────────────────────────────┐
│                  HEAP MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│   Address : 101                                │
│   ------------------------------------          │
│                                                 │
│   Employeeeee Object                           │
│                                                 │
│   name = null                                  │
│   age  = 0                                     │
│                                                 │
├─────────────────────────────────────────────────┤
│                                                 │
│   Address : 202                                │
│   ------------------------------------          │
│                                                 │
│   Employeeeee Object                           │
│                                                 │
│   name = "Aman"                                │
│   age  = 25                                    │
│                                                 │
└─────────────────────────────────────────────────┘
*/


        /*
        🔹 METHOD CALL
        ----------------
        */

        e2.display();
    }
}



/*
💬 OUTPUT
===========

Default Constructor Called
Parameterized Constructor Called

Name : Aman
Age : 25



🔥 CONSTRUCTOR FLOW
====================

new Employeeeee("Aman", 25)
        ↓
Object created in HEAP
        ↓
Constructor runs
        ↓
Values initialized
        ↓
Reference returned



🔥 CONSTRUCTOR vs METHOD
==========================

CONSTRUCTOR
-------------
✅ Same name as class
✅ No return type
✅ Runs automatically
✅ Used for initialization


METHOD
--------
✅ Can have any name
✅ Has return type
✅ Called manually
✅ Used for behavior



🔥 IMPORTANT RULES
===================

✅ Constructor name must match class name

✅ Constructor has NO return type

✅ Constructor runs automatically

✅ Constructor can be overloaded

✅ Constructor initializes object



🔥 GOLDEN RULE
================

Constructor is used to:

    "Initialize object during creation"
*/