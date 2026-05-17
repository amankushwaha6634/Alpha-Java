/*
🔹 PACKAGE DECLARATION
-----------------------
This class belongs to package:
    company.student

IMPORTANT:
------------
Package name tells Java: "Where this class exists"

This package name MUST match folder structure.
*/

package company.student;
/*
🔹 FOLDER STRUCTURE
--------------------

Because package is:
    company.student

Java expects file inside:
    src/company/student/

REAL STRUCTURE:
----------------

src
 └── company
      └── student
            └── Student.java
*/



/*
🔹 DOT RULE
------------

In package:
    company.student

DOT (.)
means:
    folder (/)

So:
    company.student

becomes:
    company/student
*/



/*
🔹 PUBLIC CLASS
----------------

Class name:
    Student

IMPORTANT RULE:
----------------

If class is public:
    file name = class name

So:

    Student.java
        ↓
    public class Student
*/

public class Student {
    /* Simple variable. */
    public String name = "Aman";

    /*  Simple method. */
    public void display() {

        System.out.println(
                "Student Name : " + name
        );
    }
}



/*
🚀 HOW OTHER PACKAGE USES THIS CLASS
=====================================

🔥 IMPORTANT PACKAGE RULES
===========================

RULE 1
--------
Package statement should be FIRST line.


RULE 2
--------
Package name must match folder structure.


RULE 3
--------
One file belongs to ONLY one package.


RULE 4
--------
DOT (.)
=
folder (/)


RULE 5
--------
If class is public:

    file name
    =
    class name



🔥 GOLDEN RULE
================

package=group of related classes


🔥 FASTEST MEMORY HACK
=======================

package:
    company.student

means folder:
    company/student
*/