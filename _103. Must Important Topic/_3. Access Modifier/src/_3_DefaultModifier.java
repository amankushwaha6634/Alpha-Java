/*
📘 TOPIC: Default Access Modifier In Java
==========================================

🧠 WHAT YOU’LL LEARN
---------------------
1️⃣ What is default access modifier
2️⃣ Why default is used
3️⃣ Package-level access
4️⃣ Same package access
5️⃣ Different package restriction
6️⃣ Memory visualization
7️⃣ Important interview rules



🔹 WHAT IS DEFAULT ACCESS MODIFIER?
------------------------------------

When NO access modifier is written:

    public
    private
    protected

then Java automatically uses:

    ✅ default access modifier

Also called:

    ✅ package-private



🔹 IMPORTANT UNDERSTANDING
---------------------------

Default members are accessible ONLY inside:

    ✅ SAME PACKAGE

NOT accessible from:

    ❌ different package



🔹 EXAMPLE
------------

int age;

void display() {

}

Both are:

    default access members
*/



/*
🔹 PACKAGE DECLARATION
-----------------------

Suppose all classes below
belong to SAME package.
*/

package accessmodifiers;



/*
🔹 CLASS CREATION
------------------
*/

class Studenttttttttt {


    /*
    🔹 DEFAULT INSTANCE VARIABLE
    -----------------------------

    No modifier written.

    Accessible ONLY inside same package.
    */

    String name = "Aman";



    /*
    🔹 DEFAULT STATIC VARIABLE
    ---------------------------

    Package-level access.
    */

    static String company = "OpenAI";



    /*
    🔹 DEFAULT CONSTRUCTOR
    -----------------------

    Accessible inside same package only.
    */

    Studenttttttttt() {

        System.out.println(
                "Default Constructor Called"
        );
    }



    /*
    🔹 DEFAULT METHOD
    ------------------

    Package-level access.
    */

    void display() {

        System.out.println(
                "Name : " + name
        );
    }



    /*
    🔹 DEFAULT STATIC METHOD
    -------------------------

    Accessible inside same package.
    */

    static void showCompany() {

        System.out.println(
                "Company : " + company
        );
    }
}



/*
🔹 SAME PACKAGE CLASS
----------------------

This class belongs to SAME package.

So access is allowed.
*/

public class _3_DefaultModifier {

    public static void main(String[] args) {


        /*
        🚀 STEP 1 : ACCESS STATIC MEMBERS
        ==================================

        Allowed because same package.
        */

        System.out.println(
                Studenttttttttt.company
        );

        Studenttttttttt.showCompany();


        /*
        🚀 STEP 2 : OBJECT CREATION
        ============================

        Allowed because constructor
        is in same package.
        */

        Studenttttttttt s1 =
                new Studenttttttttt();


        /*
        🚀 STEP 3 : ACCESS INSTANCE MEMBERS
        ====================================

        Allowed because same package.
        */

        System.out.println(
                s1.name
        );

        s1.display();


        /*
        🧠 MEMORY VISUALIZATION
        ========================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 METHOD AREA                    │
├─────────────────────────────────────────────────┤
│                                                 │
│   Studenttttttttt.class                        │
│                                                 │
│   Default Static Variable                      │
│   --------------------------------             │
│   company = "OpenAI"                           │
│                                                 │
│   Default Static Method                        │
│   --------------------------------             │
│   showCompany()                                │
│                                                 │
│   Default Instance Method                      │
│   --------------------------------             │
│   display()                                    │
│                                                 │
└─────────────────────────────────────────────────┘




┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
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
│   Studenttttttttt Object                       │
│                                                 │
│   name = "Aman"                                │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Default members still stored normally
✅ Access restriction checked at compile-time
✅ Accessible only inside same package
*/
    }
}



/*
💬 OUTPUT
===========

OpenAI

Company : OpenAI

Default Constructor Called

Aman

Name : Aman



🔥 WHERE DEFAULT CAN BE USED
=============================

✅ variable
✅ method
✅ constructor
✅ class



🔥 ACCESSIBILITY OF DEFAULT
============================

Accessible from:

    ✅ same class
    ✅ same package

NOT accessible from:

    ❌ different package



🔥 IMPORTANT UNDERSTANDING
===========================

If NO modifier is written:

    Java automatically uses:

        default access



🔥 DEFAULT vs PRIVATE
======================

PRIVATE
---------
same class only


DEFAULT
---------
same package only



🔥 MEMORY UNDERSTANDING
========================

METHOD AREA
-------------
✅ default static variables
✅ default methods


HEAP MEMORY
-------------
✅ default instance variables


STACK MEMORY
--------------
✅ references
✅ method execution



🔥 GOLDEN RULE
================

default
=
same package access



🔥 FASTEST MEMORY HACK
=======================

Think:

    "Should only package members access this?"

YES
    → default access modifier
*/