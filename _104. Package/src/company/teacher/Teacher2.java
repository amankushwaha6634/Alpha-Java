package company.teacher;

//import company.student.Aman;
//import company.student.Ankit;
//import company.student.Arpan;
  import company.student.*;
/*   With *: import company.student.*;   all classes become available of company.student */

/*  * imports ONLY classes.
    It does NOT import: sub-packages  => so we have to import subpackage classes explicitily*/
import company.student.backlogStudent.Amit;


public class Teacher2 {
    public String subject = "DSA";

    public void teach() {
        Aman s1= new Aman();
        Ankit s2 = new Ankit();
        Arpan s3 = new Arpan();
        Amit s4 = new Amit();

        System.out.println(
                "Teacher 2 Teaching  " + subject + " to all : " + s1.name + " , " + s2.name + " , " + s3.name + " , " + s4.name
        );

    }
}


/*
🔹 WHAT DOES * MEAN?
----------------------
* means:
    "Import all classes"

from package:
    company.student


🔹 EXAMPLE
------------
Suppose package contains:
company.student
    ├── Aman.java
    ├── Ankit.java
    └── Arpan.java


Then:

import company.student.*;

allows using:

    Aman
    Ankit
    Arpan

directly inside current class.
*/






/*
🔹 WITH *
-----------

With *:

import company.student.*;

all classes become available.
*/



/*
🔹 IMPORTANT UNDERSTANDING
----------------------------

* imports ONLY classes.

It does NOT import:

    sub-packages

Example:

company.student.math

will NOT import automatically.
*/



/*
🔹 IMPORTANT RULE
-------------------

* does NOT load all classes into memory.

Java imports class ONLY when used.

So:

import company.student.*;

does NOT create performance issue.
*/



/*
🔹 WHAT HAPPENS INTERNALLY?
----------------------------

When compiler sees:

import company.student.*;

it understands:

"If any class is used from
company.student package,
allow access."
*/



/*
🔹 YOUR CURRENT EXAMPLE
------------------------

You wrote:

import company.student.*;

So now directly usable:

Aman s1 = new Aman();

Ankit s2 = new Ankit();

Arpan s3 = new Arpan();

WITHOUT writing full package path.
*/



/*
🔹 WITHOUT IMPORT
-------------------

You would need:

company.student.Aman s1 =
        new company.student.Aman();

VERY BIG 😵
*/



/*
🔹 GOLDEN RULE
----------------

* means:

    all classes of package

NOT:

    all sub-packages
*/



/*
🔹 FASTEST MEMORY HACK
-----------------------

import company.student.*;

means:

"Use all classes inside
company/student folder"
*/