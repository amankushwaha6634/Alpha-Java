package package2;


import package1.ProtectedConstructor;



public class TestProtected extends ProtectedConstructor {


    public TestProtected() {

        /*
        ✅ VALID

        child class calling
        protected constructor
        */

        super();
    }
}

/*
📘 DIFFERENCE BETWEEN super() AND OBJECT CREATION
==================================================

🧠 IMPORTANT QUESTION
----------------------

Why do we use:  super();
instead of: new Parent();


🔹 WHAT IS super()?
---------------------

super() means:  "Call parent class constructor"

It initializes parent part inside current child object.




🔹 EXAMPLE
------------
class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent {
    Child() {
        System.out.println( "Child Constructor" );
    }
}

🔹 OBJECT CREATION
--------------------
new Child();

🔹 JVM INTERNAL FLOW
----------------------

Child object creation starts
        ↓
Parent constructor runs first
        ↓
Child constructor runs


🔹 OUTPUT
-----------

Parent Constructor
Child Constructor


🔹 WHY PARENT CONSTRUCTOR RUNS FIRST?
---------------------------------------

Because child inherits:

    parent variables
    parent methods
    parent structure

So parent initialization
must happen first.



🔹 WHAT DOES super() DO?
--------------------------
super() initializes: inherited parent part inside SAME child object.


🔹 VISUAL UNDERSTANDING
-------------------------

Child Object
┌─────────────────┐
│ Parent Part     │ ← initialized by super()
├─────────────────┤
│ Child Part      │
└─────────────────┘

ONLY ONE OBJECT CREATED.



🔹 WHAT DOES new Parent() DO?
-------------------------------
new Parent() creates: completely separate object


🔹 VISUAL UNDERSTANDING
-------------------------

Parent Object
┌──────────────┐
│ Parent Part  │
└──────────────┘


Child Object
┌──────────────┐
│ Parent Part  │
├──────────────┤
│ Child Part   │
└──────────────┘

NOW TWO OBJECTS EXIST.



🔹 IMPORTANT DIFFERENCE
-------------------------

super() = initializes inherited parent state inside current child object

new Parent() = creates separate parent object



🔹 WHY super() IS USED?
-------------------------
Because inheritance needs: ONE combined object
NOT separate parent object.



🔹 GOLDEN RULE
----------------
super()= parent constructor call
new Parent() = separate parent object creation
*/