package package2;

import package1.ProtectedInner;



/*
🔹 CHILD CLASS
----------------

TestProtected becomes child of:

    ProtectedInner

using:

    extends
*/

public class TestProtected1
        extends ProtectedInner {


    /*
    METHOD
    --------
    Testing protected inner class access.
    */

    void test() {

        Demo d = new Demo();

        d.display();
    }
}

/*
📘 WHAT WAS THE ISSUE IN THIS CODE?
====================================

Code:

    Demo d = new Demo();

inside:

    class TestProtected1
            extends ProtectedInner



🔹 WHAT WE THOUGHT
--------------------

We thought:

    TestProtected1
            extends
    ProtectedInner

means child class can directly create:

    Demo

object.



🔹 WHY WE EXPECTED IT TO WORK?
--------------------------------

Because protected allows access to:

    child classes

even in different package.



🔹 BUT REAL ISSUE WAS
-----------------------

Demo is NOT normal method/variable.

Demo is:

    protected INNER CLASS

Meaning:

    Demo itself is a protected TYPE.



🔹 IMPORTANT UNDERSTANDING
----------------------------

This works for protected variable:

    y

This works for protected method:

    show()

Because inherited members become part
of child class directly.



🔹 BUT INNER CLASS IS DIFFERENT
---------------------------------

Demo is a NESTED TYPE.

Meaning:

    ProtectedInner.Demo

So Java applies stricter protected
visibility rules.



🔹 WHAT JAVA SAW
------------------

Java saw:

    trying to directly instantiate
    protected nested type
    from different package



🔹 THIS LINE CAUSED ISSUE
---------------------------

    Demo d = new Demo();

Because Java treated:

    Demo

as protected nested type from
another package.



🔹 WHY INHERITANCE ALONE WAS NOT ENOUGH?
------------------------------------------

Because:

    outer class inheritance

does NOT automatically make nested
protected type fully visible
for direct instantiation.



🔹 REAL RULE
---------------

For protected inner classes
across packages:

Often you must:

    extend the inner class too

OR

access through proper inherited path.



🔹 CORRECT PROFESSIONAL WAY
-----------------------------

protected class ChildDemo
        extends Demo {

}



🔹 WHY THIS WORKS?
--------------------

Because now:

    ChildDemo

inherits:

    Demo

through inheritance chain.



🔹 IMPORTANT DIFFERENCE
-------------------------

Protected variable/method:
    easier access

Protected nested type:
    stricter access rules



🔹 GOLDEN RULE
----------------

protected nested class
across package
works best through subclassing.
*/