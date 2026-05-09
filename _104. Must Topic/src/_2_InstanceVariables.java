/*
📘 TOPIC: Instance Variables
=============================

🧠 WHAT YOU’LL LEARN
---------------------
1️⃣ What are Instance Variables
2️⃣ Why they are called "Instance" variables
3️⃣ How objects store separate values
4️⃣ Default values of instance variables
5️⃣ Memory visualization
6️⃣ Difference between instance and static variables



🔹 WHAT ARE INSTANCE VARIABLES?
--------------------------------

Variables declared INSIDE class
but OUTSIDE methods are called
Instance Variables.

Example:
*/

class Student {

    /*
    🔹 INSTANCE VARIABLES
    ----------------------
    These variables belong to object.

    Every object gets separate copy.
    */

    String name;
    int age;


    /*
    🔹 INSTANCE METHOD
    -------------------
    Used to display object data.
    */

    void display() {

        System.out.println(
                "Name : " + name +
                        ", Age : " + age
        );
    }
}



/*
🔹 MAIN CLASS
--------------
Program execution starts from main().
*/

public class _2_InstanceVariables {

    public static void main(String[] args) {


        /*
        🔹 CREATING FIRST OBJECT
        -------------------------
        */

        Student s1 = new Student();


        /*
        🔹 ASSIGNING VALUES TO FIRST OBJECT
        ------------------------------------
        */

        s1.name = "Aman";
        s1.age = 25;


        /*
        🔹 CREATING SECOND OBJECT
        --------------------------
        */

        Student s2 = new Student();


        /*
        🔹 ASSIGNING VALUES TO SECOND OBJECT
        -------------------------------------
        */

        s2.name = "Rahul";
        s2.age = 30;


        /*
        🔹 PRINTING OBJECT VALUES
        --------------------------
        */

        s1.display();
        s2.display();


        /*
        🧠 MEMORY VISUALIZATION
        ========================

        STACK MEMORY
        --------------------------------

        s1 ----------------→ 1001

        s2 ----------------→ 2001



        HEAP MEMORY
        --------------------------------

        Address : 1001

        Student Object
        ----------------
        name = "Aman"
        age  = 25



        Address : 2001

        Student Object
        ----------------
        name = "Rahul"
        age  = 30



        IMPORTANT:
        -----------
        ✅ Every object gets separate memory
        ✅ s1 and s2 store different data
        ✅ Changing s1 does NOT affect s2
        */
    }
}



/*
💬 OUTPUT
===========

Name : Aman, Age : 25
Name : Rahul, Age : 30



🔹 WHY CALLED "INSTANCE VARIABLES"?
------------------------------------

Because every object(instance)
gets its own separate copy.



🔹 DEFAULT VALUES OF INSTANCE VARIABLES
----------------------------------------

If values are NOT assigned,
Java automatically gives default values.

int     -> 0
double  -> 0.0
boolean -> false
String  -> null



🔥 INSTANCE vs STATIC VARIABLES
================================

INSTANCE VARIABLE
-------------------
✅ Belongs to object
✅ Separate copy for every object


STATIC VARIABLE
----------------
✅ Belongs to class
✅ Shared among all objects
*/