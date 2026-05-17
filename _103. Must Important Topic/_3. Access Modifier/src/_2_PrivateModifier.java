/*
📘 TOPIC: Private Access Modifier In Java
==========================================

🧠 WHAT YOU’LL LEARN
---------------------
1️⃣ What is private modifier
2️⃣ Why private is used
3️⃣ Data hiding
4️⃣ Encapsulation basics
5️⃣ Why direct access is blocked
6️⃣ Getter & Setter concept
7️⃣ Memory visualization
8️⃣ Important interview rules



🔹 WHAT IS private?
--------------------

private means:

    ✅ accessible ONLY inside same class

Access NOT allowed from:

    ❌ outside class
    ❌ different class
    ❌ child class
    ❌ different package



🔹 WHY private IS USED?
------------------------

Used for:

    ✅ data hiding
    ✅ security
    ✅ controlled access

Direct modification of important data
should NOT be allowed.



🔹 REAL-LIFE ANALOGY
---------------------

ATM PIN is private.

Everyone should NOT directly access it.

Access should happen using controlled methods.
*/



/*
🔹 CLASS CREATION
------------------
*/

public class _2_PrivateModifier {


    /*
    🔹 PRIVATE INSTANCE VARIABLE
    -----------------------------

    Accessible ONLY inside same class.

    Stored inside HEAP object.
    */

    private String password =
            "12345";



    /*
    🔹 PRIVATE STATIC VARIABLE
    ---------------------------

    Accessible ONLY inside same class.

    Stored in METHOD AREA.
    */

    private static String companySecret =
            "AI_Model_Key";



    /*
    🔹 PRIVATE METHOD
    ------------------

    Can be called ONLY inside same class.
    */

    private void showPassword() {

        System.out.println(
                "Password : " + password
        );
    }



    /*
    🔹 PRIVATE STATIC METHOD
    -------------------------

    Accessible ONLY inside same class.
    */

    private static void showSecret() {

        System.out.println(
                "Secret : " + companySecret
        );
    }



    /*
    🔹 PUBLIC METHOD
    -----------------

    Used to provide controlled access
    to private data.

    This is called:

        ✅ Getter Method
    */

    public String getPassword() {

        return password;
    }



    /*
    🔹 PUBLIC METHOD
    -----------------

    Used to safely modify private data.

    This is called:

        ✅ Setter Method
    */

    public void setPassword(String newPassword) {


        /*
        Example validation.
        */

        if(newPassword.length() >= 5) {

            password = newPassword;

            System.out.println(
                    "Password Updated"
            );

        } else {

            System.out.println(
                    "Weak Password"
            );
        }
    }



    /*
    🔹 MAIN METHOD
    ----------------
    */

    public static void main(String[] args) {


        /*
        🚀 STEP 1 : OBJECT CREATION
        ============================

        Object created in HEAP.
        */

        _2_PrivateModifier obj =
                new _2_PrivateModifier();


        /*
        🚀 STEP 2 : ACCESS PRIVATE DATA
        =================================

        Allowed INSIDE same class.
        */

        System.out.println(
                obj.password
        );

        obj.showPassword();


        /*
        🚀 STEP 3 : ACCESS PRIVATE STATIC
        ==================================

        Allowed INSIDE same class.
        */

        System.out.println(
                companySecret
        );

        showSecret();


        /*
        🚀 STEP 4 : GETTER METHOD
        ==========================

        Controlled access to private data.
        */

        System.out.println(
                obj.getPassword()
        );


        /*
        🚀 STEP 5 : SETTER METHOD
        ==========================

        Controlled modification.
        */

        obj.setPassword("Aman123");


        /*
        🚀 STEP 6 : CHECK UPDATED VALUE
        =================================
        */

        System.out.println(
                obj.getPassword()
        );


        /*
        ❌ INVALID ACCESS
        ==================

        Suppose another class tries:

            obj.password

        ERROR.

        Because password is private.
        */


        /*
        🧠 MEMORY VISUALIZATION
        ========================


                    JVM MEMORY
════════════════════════════════════════════════════



┌─────────────────────────────────────────────────┐
│                 METHOD AREA                    │
├─────────────────────────────────────────────────┤
│                                                 │
│   _2_PrivateModifier.class                     │
│                                                 │
│   Private Static Variable                      │
│   --------------------------------             │
│   companySecret = "AI_Model_Key"               │
│                                                 │
│   Private Static Method                        │
│   --------------------------------             │
│   showSecret()                                 │
│                                                 │
│   Instance Methods                             │
│   --------------------------------             │
│   showPassword()                               │
│   getPassword()                                │
│   setPassword()                                │
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
│   _2_PrivateModifier Object                    │
│                                                 │
│   password = "Aman123"                         │
│                                                 │
└─────────────────────────────────────────────────┘



IMPORTANT:
-----------
✅ Private members still exist in memory
✅ Access restriction checked at compile-time
✅ JVM memory unaffected
*/
    }
}



/*
💬 OUTPUT
===========

12345

Password : 12345

AI_Model_Key

Secret : AI_Model_Key

12345

Password Updated

Aman123



🔥 WHERE private CAN BE USED
==============================

✅ variable
✅ method
✅ constructor

❌ top-level class



🔥 ACCESSIBILITY OF private
=============================

Accessible ONLY from:

    ✅ same class

NOT accessible from:

    ❌ outside class
    ❌ child class
    ❌ different package



🔥 WHY private IS IMPORTANT?
=============================

Without private:

    anyone can directly modify data

Example:

    bank balance
    password
    PIN

This is dangerous.



🔥 ENCAPSULATION
=================

private + getter/setter
=
Encapsulation

Meaning:

    data hiding with controlled access



🔥 IMPORTANT RULES
===================

✅ private gives maximum restriction

✅ private members accessible only inside class

✅ getter → read private data

✅ setter → modify private data safely



🔥 MEMORY UNDERSTANDING
========================

METHOD AREA
-------------
✅ private static variables
✅ private methods


HEAP MEMORY
-------------
✅ private instance variables


STACK MEMORY
--------------
✅ references
✅ method execution



🔥 GOLDEN RULE
================

private
=
same class only



🔥 FASTEST MEMORY HACK
=======================

Think:

    "Should this data be hidden?"

YES
    → private
*/