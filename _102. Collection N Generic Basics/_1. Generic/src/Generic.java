// 📁 File: GenericsAndErasureSimple.java

import java.util.*;

/**
 * 🧠 WHAT YOU’LL LEARN
 * ---------------------
 * 1️⃣ What are Generics in Java
 * 2️⃣ What is Type Erasure
 * 3️⃣ Comparison between Generics and Type Erasure
 */

public class Generic {
    public static void main(String[] args) {

        /**
         * ✅ GENERICS
         * ------------
         * Generics mean "type-safe" code.
         * It lets us specify what type a collection will hold.
         *
         * 🧠 EXPLANATION:
         * - Generics tell the compiler what type of data will be used.
         * - It ensures we cannot add a wrong type (like Integer into List<String>).
         * - Helps detect errors early at compile-time.
         * - Removes the need for manual casting when getting values.
         */

        List<String> names = new ArrayList<>(); // List can only store Strings
        names.add("Aman");
        names.add("Kushwaha");
        // names.add(123); ❌ Error: not a String

        String first = names.get(0); // No casting needed
        System.out.println(first);

        /**
         * 💬 OUTPUT:
         * Aman
         */


        /**
         * ✅ TYPE ERASURE
         * ----------------
         * Java removes all generic type info after compilation.
         * This process is called **Type Erasure**.
         *
         * 🧠 EXPLANATION:
         * - During compilation, List<String> and List<Integer> both become just List.
         * - Type info (<String>, <Integer>) exists only at compile-time.
         * - This ensures old Java (pre-generics) code still works.
         */

        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        System.out.println(list1.getClass() == list2.getClass());

        /**
         * 💬 OUTPUT:
         * true
         *
         * 🧠 REASON:
         * Both look the same at runtime because generic type info is erased.
         */
    }
}


/**
 * 💡 SUMMARY
 * -----------
 * ✅ Generics = Type-safe, compile-time type checking.
 * ✅ Type Erasure = Removes generic info after compilation.
 * ✅ Purpose = Backward compatibility with old Java code.
 */


/**
 * 🔹 COMPARISON TABLE
 * --------------------
 * | Feature            | Generics                         | Type Erasure                     |
 * |--------------------|----------------------------------|----------------------------------|
 * | Purpose            | Compile-time type safety         | Backward compatibility           |
 * | When Happens       | Compile-time                     | After compilation                |
 * | Type Info Visible? | Yes (to compiler)                | No (removed at runtime)          |
 * | Example            | List<String>                     | Becomes List                     |
 * | Benefit            | Prevents ClassCastException      | Works with old Java code         |
 */



/**
In this line:

    List<String> names = new ArrayList<>();

<String> is called a generic type parameter
(or simply “generic”).

It tells Java:

    “This List will store only String objects.”

So:

    List<String>  → List of Strings
    List<Integer> → List of Integers
    List<Double>  → List of Doubles


🔹 Breakdown
------------

    List<String> names

    Part              Meaning
    -----------------------------------------
    List              Generic interface
    <String>          Generic type argument
    names             Variable name


🔹 Why Generics Exist
----------------------

Without generics (old Java):

    List list = new ArrayList();

    list.add("Aman");
    list.add(123); // Allowed 😢

Problem:

    String s = (String) list.get(1); // Runtime error 💥


With generics:

    List<String> list = new ArrayList<>();

    list.add("Aman");
    list.add(123); // ❌ Compile-time error

Now Java protects us before running the program ✅


🔹 Important Concept
---------------------

List itself is a generic class/interface.

    List<T>

Here:

    T

means:

    “Some type will be provided later.”

When you write:

    List<String>

you replace T with String.


🔹 Real Internal Idea
----------------------

Java collections are designed like this:

    class Box<T> {
        T value;
    }

Usage:

    Box<String> b1 = new Box<>();
    Box<Integer> b2 = new Box<>();

Here:

    T becomes String
    T becomes Integer

That is Generics 🔥


🔹 Relation with Type Erasure
------------------------------

At compile-time:

    List<String>
    List<Integer>

After compilation (runtime):

    List
    List

because Java removes generic type info using Type Erasure.

That’s why:

    list1.getClass() == list2.getClass()

returns:

    true

✅ Same runtime class.
*/
