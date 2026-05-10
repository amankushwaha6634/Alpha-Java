/*
📘 TOPIC: Protected Access Modifier In Java
============================================

🧠 WHAT YOU’LL LEARN
---------------------
1️⃣ What is protected modifier
2️⃣ Why protected is used
3️⃣ Same package access
4️⃣ Child class access
5️⃣ Inheritance + protected
6️⃣ Memory visualization
7️⃣ Important interview rules



🔹 WHAT IS protected?
----------------------

protected means:

    ✅ accessible inside same package
    ✅ accessible inside child class

NOT accessible from:

    ❌ unrelated class in different package



🔹 WHY protected IS USED?
--------------------------

Used when data/method should be accessible:

    ✅ to child classes

but NOT fully public.



🔹 IMPORTANT UNDERSTANDING
---------------------------

protected is mainly useful in:

    ✅ inheritance

Without inheritance,
protected behaves almost like default access.
*/



/*
🔹 PACKAGE DECLARATION
-----------------------
*/

package accessmodifiers;



/*
🔹 PARENT CLASS
----------------
*/

class Parenttttttt {


    /*
    🔹 PROTECTED VARIABLE
    ----------------------

    Accessible:
        same package
        child class
    */

    protected String name =
            "Aman";



    /*
    🔹 PROTECTED STATIC VARIABLE
    -----------------------------

    Accessible:
        same package
        child class
    */

    protected static String company =
            "OpenAI";



    /*
    🔹 PROTECTED METHOD
    --------------------

    Accessible:
        same package
        child class
    */

    protected void display() {

        System.out.println(
                "Name : " + name
        );
    }



    /*
    🔹 PROTECTED STATIC METHOD
    ---------------------------

    Accessible:
        same package
        child class
    */

    protected static void showCompany() {

        System.out.println(
                "Company : " + company
        );
    }
}



/*
🔹 CHILD CLASS
----------------

extends
    → inheritance

Child class inherits parent members.
*/

class Childdddddddd
        extends Parenttttttt {


    void childMethod() {


        /*
        ✅ VALID
        ----------

        Child class can access
        protected members.
        */

        System.out.println(
                name
        );

        display();

        System.out.println(
                company
        );

        showCompany();
    }
}



/*
🔹 MAIN CLASS
--------------
*/

public class _4_ProtectedModifier {

    public static void main(String[] args) {


        /*
        🚀 STEP 1 : SAME PACKAGE ACCESS
        =================================

        Allowed because same package.
        */

        Parenttttttt p1 =
                new Parenttttttt();

        System.out.println(
                p1.name
        );

        p1.display();


        /*
        🚀 STEP 2 : CHILD CLASS ACCESS
        ===============================

        Allowed because inheritance.
        */

        Childdddddddd c1 =
                new Childdddddddd();

        c1.childMethod();


        /*
        🚀 STEP 3 : STATIC ACCESS
        ==========================

        Allowed because same package.
        */

        System.out.println(
                Parenttttttt.company
        );

        Parenttttttt.showCompany();


        /*
        🧠 MEMORY VISUALIZATION
        ========================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 METHOD AREA                    │
├─────────────────────────────────────────────────┤
│                                                 │
│   Parenttttttt.class                           │
│                                                 │
│   Protected Static Variable                    │
│   --------------------------------             │
│   company = "OpenAI"                           │
│                                                 │
│   Protected Static Method                      │
│   --------------------------------             │
│   showCompany()                                │
│                                                 │
│   Protected Instance Method                    │
│   --------------------------------             │
│   display()                                    │
│                                                 │
├─────────────────────────────────────────────────┤
│                                                 │
│   Childdddddddd.class                          │
│                                                 │
│   Inherits protected members                   │
│                                                 │
└─────────────────────────────────────────────────┘




┌─────────────────────────────────────────────────┐
│                 STACK MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│   p1 ─────────────────────→ 101                │
│                                                 │
│   c1 ─────────────────────→ 202                │
│                                                 │
└─────────────────────────────────────────────────┘




┌─────────────────────────────────────────────────┐
│                  HEAP MEMORY                   │
├─────────────────────────────────────────────────┤
│                                                 │
│   Address : 101                                │
│   ------------------------------------          │
│                                                 │
│   Parenttttttt Object                          │
│                                                 │
│   name = "Aman"                                │
│                                                 │
├─────────────────────────────────────────────────┤
│                                                 │
│   Address : 202                                │
│   ------------------------------------          │
│                                                 │
│   Childdddddddd Object                         │
│                                                 │
│   inherited name = "Aman"                      │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Child object inherits protected members
✅ Access checked at compile-time
*/
    }
}



/*
💬 OUTPUT
===========

Aman

Name : Aman

Aman

Name : Aman

OpenAI

Company : OpenAI

OpenAI

Company : OpenAI



🔥 WHERE protected CAN BE USED
================================

✅ variable
✅ method
✅ constructor

❌ top-level class



🔥 ACCESSIBILITY OF protected
================================

Accessible from:

    ✅ same class
    ✅ same package
    ✅ child class

NOT accessible from:

    ❌ unrelated class in different package



🔥 protected vs default
========================

DEFAULT
---------
same package only


PROTECTED
-----------
same package
+
child classes



🔥 IMPORTANT UNDERSTANDING
===========================

protected is mainly useful in:

    ✅ inheritance



🔥 MEMORY UNDERSTANDING
========================

METHOD AREA
-------------
✅ protected static variables
✅ protected methods


HEAP MEMORY
-------------
✅ protected instance variables


STACK MEMORY
--------------
✅ references
✅ method execution



🔥 GOLDEN RULE
================

protected
=
same package
+
inheritance access



🔥 FASTEST MEMORY HACK
=======================

Think:

    "Should child classes access this?"

YES
    → protected
*/