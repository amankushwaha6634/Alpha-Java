
/*
📘 TOPIC: this Keyword In Java
================================

🧠 WHAT YOU’LL LEARN
---------------------
1️⃣ What is this keyword
2️⃣ Why this is needed
3️⃣ Current object reference
4️⃣ this with instance variables
5️⃣ this with methods
6️⃣ this() constructor chaining
7️⃣ Memory visualization
8️⃣ Why this cannot be used in static methods



🔹 WHAT IS this?
-----------------

this is a reference variable that points to:

    ✅ CURRENT OBJECT

Simple Meaning:

    this = current object address



🔹 WHY this IS NEEDED?
-----------------------

Suppose:

    Student s1 = new Student("Aman");

Constructor:

    Student(String name) {

        this.name = name;
    }

Here:

    LEFT SIDE  -> instance variable
    RIGHT SIDE -> local variable / parameter

Without this:

    name = name;

JVM gets confused because both names are same.

So:

    this.name

means:

    current object's instance variable
*/



/*
🔹 CLASS CREATION
------------------
*/

class Studentt {


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
    */

    Studentt() {

        System.out.println(
                "Default Constructor Called"
        );
    }



    /*
    🔹 PARAMETERIZED CONSTRUCTOR
    ----------------------------

    this.name
        → instance variable

    name
        → local variable / parameter
    */

    Studentt(String name, int age) {

        this.name = name;
        this.age = age;


        System.out.println(
                "Parameterized Constructor Called"
        );
    }



    /*
    🔹 INSTANCE METHOD
    -------------------
    */

    void display() {

        /*
        this.name
            → current object's variable
        */

        System.out.println(
                "Name : " + this.name
        );

        System.out.println(
                "Age : " + this.age
        );
    }



    /*
    🔹 METHOD USING this
    ---------------------

    this.display()

    means:
        call current object's method
    */

    void show() {

        this.display();
    }



    /*
    🔹 SAME THING WITHOUT this
    ---------------------------

    Java automatically adds:

        this.

    internally.

    So:

        display();

    internally becomes:

        this.display();
    */

    void showWithoutThis() {

        display();
    }



    /*
    🔹 IMPORTANT UNDERSTANDING
    ---------------------------

    Both are SAME:

        display();

        this.display();


    Java internally understands:

        display();

    as:

        this.display();
    */



    /*
    🔹 CONSTRUCTOR CHAINING
    ------------------------

    this()

    calls another constructor
    of SAME class.
    */

    Studentt(String name) {

        this();

        this.name = name;
    }
}



/*
🔹 MAIN CLASS
--------------
Program execution starts from main().
*/

public class _5_ThisKeyword {

    public static void main(String[] args) {


        /*
        🚀 STEP 1 : OBJECT CREATION
        ============================

        Creates object in HEAP.
        */

        Studentt s1 = new Studentt(
                "Aman",
                25
        );


        /*
        🧠 MEMORY AFTER OBJECT CREATION
        =================================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│     s1                                          │
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
│   Student Object                               │
│                                                 │
│   name = "Aman"                                │
│   age  = 25                                    │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
Inside constructor:

    this = current object

So:

    this.name

means:

    object variable inside heap object
*/


        /*
        🚀 STEP 2 : METHOD CALL
        ========================

        Current object uses display().
        */

        s1.display();


        /*
        🚀 STEP 3 : this.method()
        ==========================

        show() internally calls:

            this.display()
        */

        s1.show();


        /*
        🚀 STEP 4 : METHOD WITHOUT this
        ================================

        showWithoutThis() internally becomes:

            this.display();
        */

        s1.showWithoutThis();


        /*
        🚀 STEP 5 : CONSTRUCTOR CHAINING
        =================================

        this()

        calls another constructor.
        */

        Studentt s2 = new Studentt("Rahul");
    }
}



/*
💬 OUTPUT
===========

Parameterized Constructor Called

Name : Aman
Age : 25

Name : Aman
Age : 25

Name : Aman
Age : 25

Default Constructor Called



🔥 MEMORY UNDERSTANDING
========================

Suppose:

    Student s1 = new Student();

Then:

    this = s1

Meaning:

    this stores current object reference.



🔥 USES OF this
================

✅ this.variable
    → current object variable

✅ this.method()
    → current object method

✅ this()
    → another constructor of same class



🔥 IMPORTANT RULES
===================

✅ this refers to current object

✅ this works only inside:
    constructors
    instance methods

❌ this cannot be used in static methods

Because:
    static methods belong to CLASS
    not object



🔥 WHY STATIC CANNOT USE this?
================================

Static methods do not have current object.

So JVM cannot determine:

    "which object is this?"



🔥 IMPORTANT UNDERSTANDING
===========================

Both are SAME:

    display();

    this.display();


Java automatically assumes:

    this.

inside instance methods.



🔥 GOLDEN RULE
================

this
=
current object reference



🔥 FASTEST MEMORY HACK
=======================

Suppose:

    Student s1 = new Student();

Inside constructor/method:

    this = s1
*/
