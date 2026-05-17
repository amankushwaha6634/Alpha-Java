import company.student.Aman;

public class Main {
    public static void main(String[] args) {

        Aman s1 = new Aman();

        System.out.println("Hello world! name -" + s1.name);
    }
}

/*
📘 TOPIC: Why java.lang Is Imported By Default
===============================================

🧠 IMPORTANT QUESTION
----------------------

Why can we directly use:

    String
    System
    Math
    Integer

without writing:

    import java.lang.String;
    import java.lang.System;



🔹 ANSWER
-----------

Because Java automatically imports:

    java.lang.*

in EVERY Java program.
*/



/*
🔹 WHAT IS java.lang?
----------------------

java.lang is a built-in package of Java.

It contains MOST IMPORTANT classes used daily.

Examples:

    String
    System
    Object
    Math
    Integer
    Double
    Thread
*/



/*
🔹 AUTOMATIC IMPORT
---------------------

JVM/compiler automatically adds:

    import java.lang.*;

to every Java file.
*/



/*
🔹 SO THIS:
------------

public class Main {

    public static void main(String[] args) {

        String name = "Aman";

        System.out.println(name);
    }
}

actually behaves like:

------------------------------------------------

import java.lang.*;

public class Main {

    public static void main(String[] args) {

        String name = "Aman";

        System.out.println(name);
    }
}

------------------------------------------------
*/



/*
🔹 WHY JAVA DOES THIS?
------------------------

Because these classes are used VERY frequently.

Without automatic import,
every file would need:

    import java.lang.*;

So Java simplifies it.
*/



/*
🔹 IMPORTANT UNDERSTANDING
----------------------------

Only:

    java.lang.*

is imported automatically.

NOT:

    java.util.*
    java.io.*
    java.sql.*

For those packages,
you must import manually.
*/



/*
🔹 EXAMPLE
------------

This works directly:

String s = "Hello";

Math.max(10, 20);

System.out.println();


Because all belong to:

    java.lang
*/



/*
🔹 BUT THIS FAILS
-------------------

Scanner sc = new Scanner(System.in);

WHY?

Because Scanner belongs to:

    java.util

So we must write:

    import java.util.Scanner;
*/



/*
🔹 COMMON java.lang CLASSES
----------------------------

String
System
Object
Math
Integer
Double
Boolean
Thread
Exception
*/



/*
🔹 GOLDEN RULE
----------------

java.lang.*
=
automatically imported
*/



/*
🔹 FASTEST MEMORY HACK
-----------------------

Most commonly used Java classes
exist inside:

    java.lang

So Java imports them automatically.
*/