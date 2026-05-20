public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

/*

🧠 MOST IMPORTANT RULE

=========================

For TOP-LEVEL classes Java allows ONLY:
---------------------------------------
Modifier	Allowed?
public	     ✅
default	     ✅
private	     ❌
protected	 ❌
 */

/*
🚀 WHY private/protected NOT ALLOWED?
========================================

Because top-level class should be accessible somehow.

If class becomes:
private

then:
no outside class can access it

Makes no sense for top-level class.
 */



/*
🚨 INTERVIEW QUESTION
========================

❓ Can class be private?
✅ Answer

Top-level class:
❌ NO

Inner class:
✅ YES

VERY important 🚀
 */


/*
🧠 GOLDEN RULE
=================

Top-level classes support ONLY:

public
or
default
 */