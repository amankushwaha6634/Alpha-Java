// File: _2_ArrayListMethods.java
// Topic: Most Important ArrayList Methods (Clean Explanation + Example + Output)
// 🧠 Only METHODS, no theory here

import java.util.ArrayList;
import java.util.Arrays;

public class _2_ArrayListMethods {

    public static void main(String[] args) {

        // =====================================================
        // 🧩 1️⃣ add(value)
        // =====================================================
        // Meaning: Adds an element at the END of the ArrayList.
        // Syntax:
        //     list.add(value);
        //
        // Example:
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        System.out.println(list1);
        // Output:
        // [10, 20]


        // =====================================================
        // 🧩 2️⃣ add(index, value)
        // =====================================================
        // Meaning: Inserts an element at a specific index.
        // Syntax:
        //     list.add(index, value);
        //
        // Example:
        list1.add(1, 99); // insert 99 at index 1
        System.out.println(list1);
        // Output:
        // [10, 99, 20]


        // =====================================================
        // 🧩 3️⃣ get(index)
        // =====================================================
        // Meaning: Fetches the element present at given index.
        // Syntax:
        //     value = list.get(index);
        //
        // Example:
        System.out.println(list1.get(1));
        // Output:
        // 99


        // =====================================================
        // 🧩 4️⃣ set(index, value)
        // =====================================================
        // Meaning: Replaces the element at given index.
        // Syntax:
        //     list.set(index, value);
        //
        // Example:
        list1.set(1, 55);
        System.out.println(list1);
        // Output:
        // [10, 55, 20]


        // =====================================================
        // 🧩 5️⃣ remove(index)
        // =====================================================
        // Meaning: Removes the element at the given index.
        // Syntax:
        //     list.remove(index);
        //
        // Example:
        list1.remove(1);
        System.out.println(list1);
        // Output:
        // [10, 20]


        // =====================================================
        // 🧩 6️⃣ remove(Object)
        // =====================================================
        // Meaning: Removes the FIRST matching value from the list.
        // Syntax:
        //     list.remove(object);
        //
        // Example:
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10, 20, 30, 20));
        list2.remove(Integer.valueOf(20)); // removes first 20
        System.out.println(list2);
        // Output:
        // [10, 30, 20]


        // =====================================================
        // 🧩 7️⃣ size()
        // =====================================================
        // Meaning: Returns the number of elements in the ArrayList.
        // Syntax:
        //     int n = list.size();
        //
        // Example:
        System.out.println(list2.size());
        // Output:
        // 3


        // =====================================================
        // 🧩 8️⃣ contains(value)
        // =====================================================
        // Meaning: Checks whether the given element exists in the list.
        // Syntax:
        //     boolean result = list.contains(value);
        //
        // Example:
        System.out.println(list2.contains(30));
        // Output:
        // true


        // =====================================================
        // 🧩 9️⃣ isEmpty()
        // =====================================================
        // Meaning: Checks whether the list is empty or not.
        // Syntax:
        //     boolean result = list.isEmpty();
        //
        // Example:
        System.out.println(list1.isEmpty());
        // Output:
        // false


        // =====================================================
        // 🧩 1️⃣0️⃣ indexOf(value)
        // =====================================================
        // Meaning: Returns the FIRST index of the given value.
        // Syntax:
        //     int idx = list.indexOf(value);
        //
        // Example:
        System.out.println(list2.indexOf(20));
        // Output:
        // 2


        // =====================================================
        // 🧩 1️⃣1️⃣ lastIndexOf(value)
        // =====================================================
        // Meaning: Returns the LAST index of the given value.
        // Syntax:
        //     int idx = list.lastIndexOf(value);
        //
        // Example:
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(5, 10, 5, 20));
        System.out.println(list3.lastIndexOf(5));
        // Output:
        // 2


        // =====================================================
        // 🧩 1️⃣2️⃣ clear()
        // =====================================================
        // Meaning: Removes ALL elements from the list.
        // Syntax:
        //     list.clear();
        //
        // Example:
        list3.clear();
        System.out.println(list3);
        // Output:
        // []


        // =====================================================
        // 🧩 1️⃣3️⃣ toArray()
        // =====================================================
        // Meaning: Converts ArrayList into an Array.
        // Syntax:
        //     Object[] arr = list.toArray();
        //
        // Example:
        ArrayList<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Rahul");

        Object[] arr = names.toArray();
        System.out.println(Arrays.toString(arr));
        // Output:
        // [Aman, Rahul]


        // =====================================================
        // 🧩 1️⃣4️⃣ iterator()  (Basic intro)
        // =====================================================
        // Meaning: Used to traverse the list safely.
        // Syntax:
        //     Iterator<Type> it = list.iterator();
        //
        // (Detailed iterator topic comes later)


        // =====================================================
        // 🧠 QUICK REVISION (ArrayList Methods)
        // =====================================================
        /*
           🔹 add(), add(index,value)
           🔹 get(), set()
           🔹 remove(index), remove(Object)
           🔹 size(), isEmpty()
           🔹 contains()
           🔹 indexOf(), lastIndexOf()
           🔹 clear()
           🔹 toArray()
        */
    }
}
