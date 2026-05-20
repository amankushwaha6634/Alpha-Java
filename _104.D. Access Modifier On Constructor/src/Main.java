public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
/*
📘 ACCESS MODIFIERS ON CONSTRUCTORS
====================================

Constructors support ALL 4 modifiers:
    ✅ public
    ✅ protected
    ✅ default
    ✅ private

🔹 PUBLIC CONSTRUCTOR
-----------------------
Accessible everywhere.


🔹 PROTECTED CONSTRUCTOR
--------------------------
Accessible:
    ✅ same package
    ✅ child class
    ❌ not in non-child different package


🔹 DEFAULT CONSTRUCTOR
------------------------
Accessible ONLY inside same package.


🔹 PRIVATE CONSTRUCTOR
------------------------
Accessible ONLY inside same class.



🔹 IMPORTANT INTERVIEW POINT
------------------------------
private constructors are used in:
    ✅ Singleton Design Pattern
    ✅ Utility Classes



🔹 GOLDEN RULE
----------------
Constructor access modifier controls:
    "Who can create object?"



🔹 FASTEST MEMORY HACK
------------------------
public constructor = everyone can create object

private constructor = only same class can create object
*/