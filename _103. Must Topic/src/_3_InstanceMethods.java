/*
📘 TOPIC: Instance Methods
===========================

🧠 WHAT YOU’LL LEARN
---------------------
1️⃣ What are Instance Methods
2️⃣ How methods work with objects
3️⃣ How methods access instance variables
4️⃣ Why objects are needed to call instance methods
5️⃣ Memory visualization
6️⃣ Difference between instance and static methods



🔹 WHAT ARE INSTANCE METHODS?
------------------------------

Methods that belong to object are called
Instance Methods.

These methods can directly access:
    ✅ Instance variables
    ✅ Other instance methods

Example:
*/

class Employee {

    /*
    🔹 INSTANCE VARIABLES
    ----------------------
    Every object gets separate copy.
    */

    String name;
    int salary;


    /*
    🔹 INSTANCE METHOD
    -------------------
    This method belongs to object.

    It uses object's own data.
    */

    void displayDetails() {

        System.out.println(
                "Name : " + name +
                        ", Salary : " + salary
        );
    }


    /*
    🔹 ANOTHER INSTANCE METHOD
    ---------------------------
    Instance methods can call
    other instance methods directly.
    */

    void work() {

        System.out.println(name + " is working");

        displayDetails();
    }
}



/*
🔹 MAIN CLASS
--------------
Program execution starts from main().
*/

public class _3_InstanceMethods {

    public static void main(String[] args) {


        /*
        🔹 CREATING OBJECT
        -------------------
        */

        Employee e1 = new Employee();


        /*
        🔹 ASSIGNING VALUES
        --------------------
        */

        e1.name = "Aman";
        e1.salary = 90000;


        /*
        🔹 CALLING INSTANCE METHODS
        ----------------------------

        Syntax:
            referenceVariable.methodName();
        */

        e1.displayDetails();

        e1.work();


        /*
        🧠 MEMORY VISUALIZATION
        ========================

        STACK MEMORY
        --------------------------------

        e1 ----------------→ 1001



        HEAP MEMORY
        --------------------------------

        Address : 1001

        Employee Object
        ----------------
        name   = "Aman"
        salary = 90000



        METHOD AREA
        --------------------------------

        displayDetails()
        work()



        IMPORTANT:
        -----------
        ✅ Methods are called using object
        ✅ Object data is used inside methods
        ✅ Every object can use same methods
           with different data
        */
    }
}



/*
💬 OUTPUT
===========

Name : Aman, Salary : 90000

Aman is working

Name : Aman, Salary : 90000



🔹 WHY OBJECT IS REQUIRED?
---------------------------

Instance methods belong to object.

So Java needs object reference
to know WHICH object's data to use.



🔹 IMPORTANT UNDERSTANDING
---------------------------

If multiple objects exist:

    e1.displayDetails();
    e2.displayDetails();

Same method runs,
but data changes based on object.



🔥 INSTANCE METHOD vs STATIC METHOD
====================================

INSTANCE METHOD
----------------
✅ Belongs to object
✅ Requires object to call
✅ Can access instance variables directly


STATIC METHOD
--------------
✅ Belongs to class
✅ No object required
✅ Cannot directly access instance variables
*/