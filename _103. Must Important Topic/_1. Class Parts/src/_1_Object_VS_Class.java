/*
📘 TOPIC: Class vs Object
==========================

🧠 WHAT YOU’LL LEARN
---------------------

1️⃣ What is a Class
2️⃣ What is an Object
3️⃣ How objects are created
4️⃣ What is a Reference Variable
5️⃣ How memory works in Java
6️⃣ How methods work with objects



🔹 WHAT IS A CLASS?
--------------------

A class is a blueprint/template/design.

Real Life Example:
    Class  -> Car Design
    Object -> Actual Car

A class defines:
    ✅ Variables (properties/data)
    ✅ Methods (behavior/actions)

IMPORTANT:
    Class itself is NOT a real object. It is only a design/template.



🔹 CLASS CREATION
------------------

Below we created a class named Car.

This class contains:
    color -> variable
    speed -> variable
    drive() -> method
*/

class Car {
    /*
    INSTANCE VARIABLES
    -------------------
    These variables belong to object.
    Every object gets separate copy.
    */

    String color;
    int speed;


    /*
    INSTANCE METHOD
    ----------------
    This method belongs to object.
    Used to define behavior of object.
    */
    void drive() {

        System.out.println(
                color + " car is driving at speed " + speed
        );
    }
}



/*
🔹 MAIN CLASS
--------------

Program execution starts from main().
*/

public class _1_Object_VS_Class {

    public static void main(String[] args) {
        /*
        🔹 OBJECT CREATION
        -------------------
        Syntax: ClassName referenceVariable = new ClassName();
        Example:
        */

        Car c1 = new Car();


        /*
        🔥 BREAKDOWN OF ABOVE LINE
        ---------------------------

        Car -> Class type
        c1  -> Reference variable
        new -> Creates real object in HEAP memory
        Car -> Constructor call
        */


        /*
        🚨 VERY IMPORTANT CONCEPT
        --------------------------
        c1 is NOT the actual object.
        c1 stores ADDRESS / REFERENCE of object created in heap memory.
        */


        /*
        🧠 MEMORY VISUALIZATION
        ========================
        AFTER:
            Car c1 = new Car();

        ┌──────────────────────────────┐
        │         STACK MEMORY         │
        ├──────────────────────────────┤
        │                              │
        │  c1  ───────────────────┐    │
        │                         │    │
        └─────────────────────────│────┘
                                  │
                                  │
                                  ▼

                        ┌──────────────────────┐
                        │      HEAP MEMORY     │
                        ├──────────────────────┤
                        │                      │
                        │   Address : 1001     │
                        │   ----------------   │
                        │   Car Object         │
                        │                      │
                        │   color = null       │
                        │   speed = 0          │
                        │                      │
                        └──────────────────────┘
        IMPORTANT:
        -----------
        ✅ c1 is a reference variable
        ✅ c1 stores ADDRESS of object
        ✅ Actual object lives in HEAP memory
        ✅ Reference variable lives in STACK memory

        IMPORTANT:
        Object lives in HEAP memory.
        Reference variable lives in STACK memory.
        */


        /*
        🔹 ASSIGNING VALUES
        --------------------
        */

        c1.color = "Red";
        c1.speed = 120;


        /*
        AFTER ASSIGNING VALUES
        -----------------------

        HEAP MEMORY
        --------------------------------

        Address : 1001

        Car Object
        ----------------
        color = "Red"
        speed = 120
        */


        /*
        🔹 CALLING METHOD
        ------------------

        Object uses its own data.
        */

        c1.drive();


        /*
        🔹 CREATING SECOND OBJECT
        --------------------------
        */

        Car c2 = new Car();

        c2.color = "Blue";
        c2.speed = 180;

        c2.drive();


        /*
        🧠 MEMORY AFTER MULTIPLE OBJECTS
        =================================

        STACK MEMORY
        ---------------------------------

        ┌──────────────────────────────┐
        │         STACK MEMORY         │
        ├──────────────────────────────┤
        │                              │
        │  c1 ───────────────────┐     │
        │                        │     │
        │  c2 ───────────────┐   │     │
        │                    │   │     │
        └────────────────────│───│─────┘
                             │   │
                             ▼   ▼


                ┌──────────────────────┐
                │      HEAP MEMORY     │
                ├──────────────────────┤
                │                      │
                │   Address : 1001     │
                │   ----------------   │
                │   Car Object         │
                │   color = "Red"      │
                │   speed = 120        │
                │                      │
                └──────────────────────┘


                ┌──────────────────────┐
                │      HEAP MEMORY     │
                ├──────────────────────┤
                │                      │
                │   Address : 2001     │
                │   ----------------   │
                │   Car Object         │
                │   color = "Blue"     │
                │   speed = 180        │
                │                      │
                └──────────────────────┘



        IMPORTANT:
        -----------
        ✅ Each object gets separate memory
        ✅ c1 points to first object
        ✅ c2 points to second object
        ✅ Changing c1 does NOT affect c2

        IMPORTANT 🔥
        Each object gets SEPARATE memory.
        Changing c1 does NOT affect c2.
        */
    }
}

/*
💬 OUTPUT
===========

Red car is driving at speed 120
Blue car is driving at speed 180


🔥 CLASS vs OBJECT
===================
CLASS
------

✅ Blueprint / Design
✅ Logical entity
✅ Defines structure
✅ No actual memory for object data

OBJECT
-------

✅ Real instance
✅ Physical entity
✅ Occupies memory
✅ Stores actual values
*/