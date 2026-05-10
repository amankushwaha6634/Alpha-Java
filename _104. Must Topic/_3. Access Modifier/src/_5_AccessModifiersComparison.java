/*
📘 TOPIC: Access Modifiers Comparison In Java
==============================================

🧠 WHAT YOU’LL LEARN
---------------------
1️⃣ Comparison of all access modifiers
2️⃣ public vs private vs protected vs default
3️⃣ Accessibility rules
4️⃣ Package understanding
5️⃣ Inheritance understanding
6️⃣ Important interview tricks
7️⃣ Complete memory visualization



🔹 THE 4 ACCESS MODIFIERS
--------------------------

1️⃣ public
2️⃣ private
3️⃣ protected
4️⃣ default



🔹 CORE PURPOSE
----------------

Access modifiers control:

    ✅ visibility
    ✅ accessibility
    ✅ security
    ✅ encapsulation
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

class Parentttttttt {


    /*
    🔹 PUBLIC VARIABLE
    -------------------

    Accessible everywhere.
    */

    public String publicVar =
            "PUBLIC";



    /*
    🔹 PRIVATE VARIABLE
    --------------------

    Accessible only inside same class.
    */

    private String privateVar =
            "PRIVATE";



    /*
    🔹 DEFAULT VARIABLE
    --------------------

    Accessible only inside same package.
    */

    String defaultVar =
            "DEFAULT";



    /*
    🔹 PROTECTED VARIABLE
    ----------------------

    Accessible:
        same package
        child classes
    */

    protected String protectedVar =
            "PROTECTED";



    /*
    🔹 METHOD INSIDE SAME CLASS
    ----------------------------

    Same class can access EVERYTHING.
    */

    void insideSameClass() {

        System.out.println(
                publicVar
        );

        System.out.println(
                privateVar
        );

        System.out.println(
                defaultVar
        );

        System.out.println(
                protectedVar
        );
    }
}



/*
🔹 CHILD CLASS
----------------

Inheritance example.
*/

class Childddddddddd
        extends Parentttttttt {


    void childAccess() {


        /*
        ✅ Accessible
        */

        System.out.println(
                publicVar
        );


        /*
        ❌ NOT Accessible

        privateVar
        */


        /*
        ✅ Accessible
        */

        System.out.println(
                defaultVar
        );


        /*
        ✅ Accessible
        */

        System.out.println(
                protectedVar
        );
    }
}



/*
🔹 MAIN CLASS
--------------
*/

public class _5_AccessModifiersComparison {

    public static void main(String[] args) {


        /*
        🚀 STEP 1 : OBJECT CREATION
        ============================

        Create parent object.
        */

        Parentttttttt p1 =
                new Parentttttttt();


        /*
        🚀 STEP 2 : ACCESS PUBLIC
        ==========================

        Accessible everywhere.
        */

        System.out.println(
                p1.publicVar
        );


        /*
        🚀 STEP 3 : ACCESS PRIVATE
        ===========================

        ❌ ERROR

        private accessible only
        inside same class.
        */

        /*
        System.out.println(
                p1.privateVar
        );
        */


        /*
        🚀 STEP 4 : ACCESS DEFAULT
        ===========================

        Allowed because same package.
        */

        System.out.println(
                p1.defaultVar
        );


        /*
        🚀 STEP 5 : ACCESS PROTECTED
        =============================

        Allowed because same package.
        */

        System.out.println(
                p1.protectedVar
        );


        /*
        🚀 STEP 6 : CHILD CLASS ACCESS
        ===============================

        Child class inherits members.
        */

        Childddddddddd c1 =
                new Childddddddddd();

        c1.childAccess();


        /*
        🧠 MEMORY VISUALIZATION
        ========================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 METHOD AREA                    │
├─────────────────────────────────────────────────┤
│                                                 │
│   Parentttttttt.class                          │
│                                                 │
│   publicVar                                    │
│   privateVar                                   │
│   defaultVar                                   │
│   protectedVar                                 │
│                                                 │
├─────────────────────────────────────────────────┤
│                                                 │
│   Childddddddddd.class                         │
│                                                 │
│   inherits accessible members                  │
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
│   Parentttttttt Object                         │
│                                                 │
│   publicVar    = "PUBLIC"                      │
│   privateVar   = "PRIVATE"                     │
│   defaultVar   = "DEFAULT"                     │
│   protectedVar = "PROTECTED"                   │
│                                                 │
├─────────────────────────────────────────────────┤
│                                                 │
│   Address : 202                                │
│   ------------------------------------          │
│                                                 │
│   Childddddddddd Object                        │
│                                                 │
│   inherited accessible members                 │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Access modifiers affect accessibility
✅ Memory storage remains same
✅ Compiler checks access rules
*/
    }
}



/*
💬 OUTPUT
===========

PUBLIC

DEFAULT

PROTECTED

PUBLIC

DEFAULT

PROTECTED



🔥 COMPLETE ACCESS MODIFIER TABLE
==================================

| Modifier  | Same Class | Same Package | Child Class | Different Package |
|-----------|------------|---------------|--------------|-------------------|
| public    | ✅ | ✅ | ✅ | ✅ |
| private   | ✅ | ❌ | ❌ | ❌ |
| default   | ✅ | ✅ | ❌ | ❌ |
| protected | ✅ | ✅ | ✅ | ❌ |



🔥 SIMPLE UNDERSTANDING
========================

public
--------
accessible everywhere


private
---------
same class only


default
---------
same package only


protected
-----------
same package
+
inheritance access



🔥 IMPORTANT INTERVIEW POINT
=============================

Access modifiers:

    ❌ DO NOT change memory location

They ONLY control:

    ✅ accessibility



🔥 MEMORY UNDERSTANDING
========================

METHOD AREA
-------------
✅ method definitions
✅ static members


HEAP MEMORY
-------------
✅ object variables


STACK MEMORY
--------------
✅ references
✅ method execution



🔥 GOLDEN RULE
================

Access Modifiers
=
visibility control



🔥 FASTEST MEMORY HACK
=======================

MORE ACCESS
    → public

LESS ACCESS
    → private
*/