// File: _1_ArrayListBasics.java
// Topic: Core ArrayList Concepts (Beginner → Interview Level)
// 🧠 Only CONCEPTS, no methods list here

import java.util.ArrayList;

public class _1_ArrayListBasics {

    public static void main(String[] args) {

        // =====================================================
        // 🧩 1️⃣ What is ArrayList?
        // =====================================================
        /*
           ✅ ArrayList is a part of the Java Collections Framework
           ✅ It implements the List interface
           ✅ It is a RESIZABLE (dynamic) array
           ✅ It stores elements in ORDER (index-based)
           ✅ It allows DUPLICATE values
        */

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list); // []


        // =====================================================
        // 🧩 2️⃣ Difference Between Array and ArrayList
        // =====================================================
        /*
           ✅ Array:
              - Fixed size
              - Can store primitives & objects
              - Faster
              - NOT part of Collections

           ✅ ArrayList:
              - Dynamic size
              - Stores ONLY objects
              - Slower than array
              - Part of Collections
        */


        // =====================================================
        // 🧩 3️⃣ Why ArrayList Stores ONLY Objects?
        // =====================================================
        /*
           ✅ Java Collections work only with OBJECTS.
           ✅ Primitive values are wrapped using WRAPPER classes.

           Example:
              int     → Integer
              double  → Double
              char    → Character
        */

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);  // int → Integer (Auto-boxing)
        nums.add(20);


        // =====================================================
        // 🧩 4️⃣ Default Capacity of ArrayList
        // =====================================================
        /*
           ✅ Default initial capacity = 10
           ✅ ArrayList grows automatically when full
           ✅ Growth Formula:

                newCapacity = oldCapacity * 1.5
                              (approximately)
        */


        // =====================================================
        // 🧩 5️⃣ ArrayList Allows Duplicate & Null Values
        // =====================================================
        /*
           ✅ Duplicate values → ALLOWED
           ✅ Multiple null values → ALLOWED
        */

        ArrayList<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Aman");  // duplicate allowed
        names.add(null);
        names.add(null);    // multiple nulls allowed

        System.out.println(names);
        // Output:
        // [Aman, Aman, null, null]


        // =====================================================
        // 🧩 6️⃣ Insertion Order is PRESERVED
        // =====================================================
        /*
           ✅ ArrayList maintains the order of insertion.
        */

        ArrayList<Integer> order = new ArrayList<>();
        order.add(30);
        order.add(10);
        order.add(20);

        System.out.println(order);
        // Output:
        // [30, 10, 20]


        // =====================================================
        // 🧩 7️⃣ Heterogeneous Data with Objects (Possible)
        // =====================================================
        /*
           ✅ With Object type, we can store mixed values.
           ❌ But this is NOT recommended in real projects.
        */

        ArrayList<Object> mixed = new ArrayList<>();
        mixed.add(10);
        mixed.add("Aman");
        mixed.add(true);

        System.out.println(mixed);
        // Output:
        // [10, Aman, true]


        // =====================================================
        // 🧩 8️⃣ Performance Reality of ArrayList
        // =====================================================
        /*
           ✅ Fast for:
              - get(index)
              - add at end

           ❌ Slow for:
              - insert in middle
              - delete from middle
           Because:
              - Shifting of elements is required
        */


        // =====================================================
        // 🧩 9️⃣ When Should You Use ArrayList?
        // =====================================================
        /*
           ✅ When:
              - Size is NOT fixed
              - You need insert & delete
              - You need index-based access
              - You need ordered data
        */


        // =====================================================
        // 🧠 QUICK REVISION (ArrayList Concepts)
        // =====================================================
        /*
           🔹 ArrayList is a Collection (List)
           🔹 Dynamic size
           🔹 Allows duplicates & nulls
           🔹 Stores only objects
           🔹 Maintains insertion order
           🔹 Slower than arrays for insert/delete in middle
        */

    }
}
