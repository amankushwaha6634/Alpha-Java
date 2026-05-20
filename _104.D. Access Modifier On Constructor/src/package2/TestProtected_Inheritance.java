package package2;


import package1.ProtectedConstructor;



public class TestProtected_Inheritance extends ProtectedConstructor {


    public TestProtected_Inheritance() {

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























/*
super calls parent constructor only so methods are not available in parent constructor means
so no method will be inherited ?

📘 DOES super() CONTROL METHOD INHERITANCE?
=============================================

🧠 IMPORTANT QUESTION
----------------------
super() calls parent constructor only.
So are methods inherited or not?



🔹 VERY IMPORTANT RULE
------------------------
❌ Constructors are NOT inherited
BUT
✅ Methods ARE inherited



🔹 WHAT DOES super() DO?
--------------------------
super() ONLY calls:

    parent constructor

for parent initialization.

It does NOT control inheritance.



🔹 WHAT CREATES INHERITANCE?
------------------------------

Inheritance happens because of:

    extends

NOT because of:

    super()



🔹 EXAMPLE
------------

class Parent {

    void show() {

        System.out.println(
                "Parent Method"
        );
    }
}


class Child extends Parent {

}

🔹 OBJECT CREATION
--------------------

Child c = new Child();
c.show();

🔹 OUTPUT
-----------
Parent Method

🔹 WHY METHOD AVAILABLE?
--------------------------
Because:
    extends Parent

inherits:
    ✅ methods
    ✅ variables



🔹 IMPORTANT UNDERSTANDING
----------------------------
Even if parent constructor is empty:

Parent() {

}

methods are STILL inherited.



🔹 CONSTRUCTOR VS INHERITANCE
--------------------------------

Constructor = used for object initialization

extends = creates inheritance relationship

super() = calls parent constructor



🔹 REAL FLOW
---------------

extends
    ↓
inherit methods + variables


super()
    ↓
initialize parent state



🔹 WHY CONSTRUCTORS ARE NOT INHERITED?
----------------------------------------

Because constructor name belongs to:

    class name

Parent constructor:

    Parent()

Child class name:

    Child

So constructor inheritance is impossible.



🔹 BUT METHODS ARE INHERITED
------------------------------

Methods represent:

    behavior

So child class can reuse them.



🔹 GOLDEN RULE
----------------

extends
=
inheritance


super()
=
constructor calling


Both are DIFFERENT concepts.
*/