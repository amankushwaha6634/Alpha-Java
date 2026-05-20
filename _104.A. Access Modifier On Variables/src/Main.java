public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

/*
🚀 Where Access Modifiers Can Be Used

========================================

Access modifiers can be paired with:

Member Type	        public	protected  default	private
Variables	        ✅	    ✅	        ✅	    ✅
Methods	            ✅	    ✅	        ✅	    ✅
Constructors	    ✅	    ✅	        ✅	    ✅
Inner Classes	    ✅	    ✅	        ✅	    ✅
Top-Level Classes	✅	    ❌	        ✅	    ❌
 */


/*
📘 WHERE ACCESS MODIFIERS CAN BE USED
======================================

Access modifiers can be paired with:

    ✅ Variables
    ✅ Methods
    ✅ Constructors
    ✅ Inner Classes
    ✅ Top-Level Classes



🔹 1️⃣ VARIABLES
------------------

All 4 modifiers allowed.

Example:

    public int x;

    protected int y;

    int z;

    private int a;



🔹 2️⃣ METHODS
----------------

All 4 modifiers allowed.

Example:

    public void show() {}

    protected void test() {}

    void display() {}

    private void print() {}



🔹 3️⃣ CONSTRUCTORS
---------------------

All 4 modifiers allowed.

Example:

    public Student() {}

    protected Student(int x) {}

    Student(String name) {}

    private Student(double d) {}



🔹 4️⃣ INNER CLASSES
----------------------

All 4 modifiers allowed.

Example:

class Outer {

    public class A {}

    protected class B {}

    class C {}

    private class D {}
}



🔹 5️⃣ TOP-LEVEL CLASSES
--------------------------

ONLY these modifiers allowed:

    ✅ public
    ✅ default


Example:

    public class Test {

    }


    class Demo {

    }



❌ INVALID
------------

    private class A {

    }


    protected class B {

    }



🔹 IMPORTANT INTERVIEW POINT
------------------------------

Top-level classes support ONLY:

    public
    default


Everything else supports:

    public
    protected
    default
    private



🔹 WHY TOP-LEVEL CLASS CANNOT BE private?
-------------------------------------------

Because top-level class must be accessible somehow.

If class becomes private:

    no outside class can use it

So Java does NOT allow it.



🔹 GOLDEN RULE
----------------

Everything supports all 4 modifiers

EXCEPT:

    top-level classes



🔹 FASTEST MEMORY HACK
------------------------

Top-level class
=
ONLY public/default

Everything else
=
supports all 4
*/