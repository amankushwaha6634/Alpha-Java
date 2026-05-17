package company.teacher;

import company.student.Aman;

public class Teacher {

    public String subject = "Java";

    public void teach() {
        Aman s1= new Aman();

        System.out.println(
                "Teaching : " + subject + " to " + s1.name
        );
    }
}

/*
📘 WHY PACKAGE DOES NOT INCLUDE src
====================================

🧠 IMPORTANT UNDERSTANDING
---------------------------

Suppose folder structure is:

    src
     └── company
          └── student
                └── Student.java

Inside Student.java we write:
    package company.student;

NOT:
    package src.company.student;


🔹 WHY src IS NOT INCLUDED?
----------------------------

Because:

    src

is NOT part of package.

It is only:

    ✅ SOURCE ROOT FOLDER



🔹 WHAT IS SOURCE ROOT?
------------------------

Source root means:

    "Starting point of Java source code"

Java compiler starts searching FROM:

    src

So package starts AFTER src.



🔹 VISUAL UNDERSTANDING
------------------------

src
 ↓
(source root)
 ↓

company
 ↓
student
 ↓
Student.java


Package includes ONLY:

    company.student

NOT:

    src.company.student



🔹 IMPORTANT RULE
------------------

Package name must match folders
AFTER source root.

So:

    package company.student;

means file should exist inside:

    src/company/student



🔹 INTELLIJ UNDERSTANDING
--------------------------

IntelliJ marks:

    src

as:

    ✅ Sources Root

Meaning:

    package starts after this point.



🔹 DOT RULE
------------

DOT (.)
=
folder (/)

So:

    company.student

becomes:

    company/student



🔹 GOLDEN RULE
----------------

src
=
source root


package
=
folders inside source root



🔹 FASTEST MEMORY HACK
-----------------------

Think:

    src is invisible to package system

Java starts counting package folders
AFTER src.
*/