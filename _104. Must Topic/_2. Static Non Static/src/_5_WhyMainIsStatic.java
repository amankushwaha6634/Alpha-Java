/*
📘 TOPIC: Why main() Is Static In Java
=======================================

🧠 WHAT YOU’LL LEARN
---------------------
1️⃣ Why JVM needs static main()
2️⃣ What happens when program starts
3️⃣ Why object is not available initially
4️⃣ Memory visualization
5️⃣ Why JVM calls main() directly
6️⃣ Why non-static main() would fail



🔹 IMPORTANT QUESTION
----------------------

Why is main() static?

Answer:

    Because JVM starts program
    BEFORE any object exists.



🔹 WHAT IS main()?
-------------------

main() is the entry point of Java program.

Program execution starts from:

    main()



🔹 JVM EXECUTION FLOW
----------------------

When program starts:

    JVM loads class
        ↓
    JVM searches main()
        ↓
    JVM calls main()
        ↓
    Program execution starts



🔹 IMPORTANT UNDERSTANDING
---------------------------

At program start:

    ❌ no object exists

So JVM cannot call:

    object.main()

because no object is available yet.

Therefore main() must be:

    ✅ static
*/



/*
🔹 CLASS CREATION
------------------
*/

class Studentttttttt {


    /*
    🔹 INSTANCE METHOD
    -------------------

    Requires object.
    */

    void display() {

        System.out.println(
                "Display Method"
        );
    }



    /*
    🔹 STATIC METHOD
    -----------------

    Does NOT require object.
    */

    static void test() {

        System.out.println(
                "Static Method"
        );
    }
}



/*
🔹 MAIN CLASS
--------------
Program execution starts from main().
*/

public class _5_WhyMainIsStatic {


    /*
    🔹 MAIN METHOD
    ----------------

    public
        → JVM can access it

    static
        → JVM can call without object

    void
        → returns nothing

    String[] args
        → command line arguments
    */

    public static void main(String[] args) {


        /*
        🚀 STEP 1 : JVM LOADS CLASS
        ============================

        JVM loads:

            _5_WhyMainIsStatic.class

        into METHOD AREA.
        */


        /*
        🧠 MEMORY AFTER CLASS LOADING
        =================================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 METHOD AREA                    │
├─────────────────────────────────────────────────┤
│                                                 │
│   _5_WhyMainIsStatic.class                     │
│                                                 │
│   Static Method                                │
│   --------------------------------             │
│   main()                                       │
│                                                 │
│   Studentttttttt.class                         │
│                                                 │
│   Static Method                                │
│   --------------------------------             │
│   test()                                       │
│                                                 │
│   Instance Method                              │
│   --------------------------------             │
│   display()                                    │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Only classes loaded
❌ No objects created yet
*/


        /*
        🚀 STEP 2 : JVM CALLS main()
        =============================

        JVM directly calls:

            main()

        WITHOUT object.

        Possible because main() is static.
        */


        System.out.println(
                "Program Started"
        );


        /*
        🚀 STEP 3 : OBJECT CREATION
        ============================

        Objects are created AFTER main() starts.
        */

        Studentttttttt s1 = new Studentttttttt();

        s1.display();


        /*
        🚀 STEP 4 : STATIC METHOD CALL
        ===============================

        No object required.
        */

        Studentttttttt.test();


        /*
        🧠 MEMORY AFTER OBJECT CREATION
        =================================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│   main() Frame                                 │
│                                                 │
│   s1 ─────────────────────→ 101                │
│                                                 │
└─────────────────────────────────────────────────┘




┌─────────────────────────────────────────────────┐
│                  HEAP MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│   Address : 101                                │
│   ------------------------------------          │
│                                                 │
│   Studentttttttt Object                        │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Object created AFTER main() started
✅ JVM needed static main() initially
*/
    }
}



/*
💬 OUTPUT
===========

Program Started

Display Method

Static Method



🔥 WHY main() MUST BE STATIC?
================================

At program start:

    ❌ no object exists

JVM needs method callable directly.

So JVM calls:

    ClassName.main()

NOT:

    object.main()



🔥 WHAT IF main() WAS NON-STATIC?
==================================

Suppose:

    void main()

Then JVM would need object first.

But:

    object creation itself needs code execution

which starts from main().

This creates circular dependency.



🔥 JVM EXECUTION FLOW
======================

JVM loads class
        ↓
finds static main()
        ↓
calls main()
        ↓
program starts
        ↓
objects created later



🔥 IMPORTANT RULES
===================

✅ main() must be static

✅ JVM calls main() directly

✅ No object needed

✅ Objects created AFTER main() starts



🔥 MEMORY UNDERSTANDING
========================

METHOD AREA
-------------
✅ main()
✅ static methods


HEAP MEMORY
-------------
✅ objects


STACK MEMORY
--------------
✅ main() execution frame



🔥 GOLDEN RULE
================

main() is static because:

    JVM needs entry point
    BEFORE object creation



🔥 FASTEST MEMORY HACK
=======================

Ask:

    "Who creates first object?"

Answer:

    code inside main()

So JVM must start:

    WITHOUT object
*/