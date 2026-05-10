/*
📘 TOPIC: Public Access Modifier In Java
=========================================

🧠 WHAT YOU’LL LEARN
---------------------
1️⃣ What is public modifier
2️⃣ Why public is used
3️⃣ Public variable access
4️⃣ Public method access
5️⃣ Public class access
6️⃣ Memory visualization
7️⃣ Important interview rules

🧠 What Access Modifiers Control
===================================
Access modifiers decide:
WHO can access WHAT


🔹 WHAT IS public?
-------------------

public means:

    ✅ accessible from EVERYWHERE

Access allowed from:

    ✅ same class
    ✅ same package
    ✅ different package
    ✅ child class
    ✅ non-child class



🔹 WHY public IS USED?
-----------------------

Used when data/method should be:

    globally accessible

Examples:
    main()
    APIs
    utility methods
*/



/*
🔹 PUBLIC CLASS
----------------

This class can be accessed
from anywhere.
*/

public class _1_PublicModifier {


    /*
    🔹 PUBLIC STATIC VARIABLE
    --------------------------

    Accessible from everywhere.

    Stored in METHOD AREA.
    */

    public static String company =
            "OpenAI";



    /*
    🔹 PUBLIC INSTANCE VARIABLE
    ----------------------------

    Accessible from everywhere.

    Stored inside HEAP object.
    */

    public String name = "Aman";



    /*
    🔹 PUBLIC CONSTRUCTOR
    ----------------------

    Object can be created
    from anywhere.
    */

    public _1_PublicModifier() {

        System.out.println(
                "Public Constructor Called"
        );
    }



    /*
    🔹 PUBLIC INSTANCE METHOD
    --------------------------

    Accessible from everywhere.

    Requires object.
    */

    public void display() {

        System.out.println(
                "Name : " + name
        );
    }



    /*
    🔹 PUBLIC STATIC METHOD
    ------------------------

    Accessible from everywhere.

    No object required.
    */

    public static void showCompany() {

        System.out.println(
                "Company : " + company
        );
    }



    /*
    🔹 MAIN METHOD
    ----------------

    main() must be public.

    WHY?

    JVM should access it
    from outside class.
    */

    public static void main(String[] args) {


        /*
        🚀 STEP 1 : ACCESS STATIC MEMBERS
        ==================================

        No object required.
        */

        System.out.println(
                _1_PublicModifier.company
        );

        _1_PublicModifier.showCompany();


        /*
        🚀 STEP 2 : OBJECT CREATION
        ============================

        Public constructor accessible.
        */

        _1_PublicModifier obj =
                new _1_PublicModifier();


        /*
        🚀 STEP 3 : ACCESS INSTANCE MEMBERS
        ====================================

        Access using object.
        */

        System.out.println(
                obj.name
        );

        obj.display();


        /*
        🧠 MEMORY VISUALIZATION
        ========================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 METHOD AREA                    │
├─────────────────────────────────────────────────┤
│                                                 │
│   _1_PublicModifier.class                      │
│                                                 │
│   Public Static Variable                       │
│   --------------------------------             │
│   company = "OpenAI"                           │
│                                                 │
│   Public Static Methods                        │
│   --------------------------------             │
│   main()                                       │
│   showCompany()                                │
│                                                 │
│   Public Instance Method                       │
│   --------------------------------             │
│   display()                                    │
│                                                 │
└─────────────────────────────────────────────────┘




┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│   obj ─────────────────────→ 101               │
│                                                 │
└─────────────────────────────────────────────────┘




┌─────────────────────────────────────────────────┐
│                  HEAP MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│   Address : 101                                │
│   ------------------------------------          │
│                                                 │
│   _1_PublicModifier Object                     │
│                                                 │
│   name = "Aman"                                │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Public members accessible everywhere
✅ Static members accessed using class
✅ Instance members accessed using object
*/
    }
}



/*
💬 OUTPUT
===========

OpenAI

Company : OpenAI

Public Constructor Called

Aman

Name : Aman



🔥 WHERE public CAN BE USED
=============================

✅ class
✅ variable
✅ method
✅ constructor



🔥 ACCESSIBILITY OF public
============================

Accessible from:

    ✅ same class
    ✅ same package
    ✅ different package
    ✅ child class
    ✅ non-child class



🔥 IMPORTANT RULES
===================

✅ public gives maximum visibility

✅ public members accessible everywhere

✅ public static members:
    accessed using ClassName

✅ public instance members:
    accessed using object



🔥 WHY main() IS public?
=========================

JVM accesses main()
from outside class.

So JVM needs:

    public access



🔥 MEMORY UNDERSTANDING
========================

METHOD AREA
-------------
✅ public static variables
✅ public static methods
✅ method definitions


HEAP MEMORY
-------------
✅ public instance variables


STACK MEMORY
--------------
✅ references
✅ method execution



🔥 GOLDEN RULE
================

public
=
accessible everywhere



🔥 FASTEST MEMORY HACK
=======================

Think:

    "Should everyone access this?"

YES
    → public
*/