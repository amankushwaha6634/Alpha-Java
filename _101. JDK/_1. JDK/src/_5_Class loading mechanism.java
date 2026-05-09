// File: _4_ClassLoadingMechanism.java
// Topic: JVM Class Loading Mechanism (Simple Notes)
// 🧠 How Java loads classes before running your program

/**
 * ============================================================
 * 🧠 What is Class Loading?
 * ============================================================
 * ➤ When you run a Java program, the JVM needs to bring your
 *    `.class` files into memory before it can execute them.
 *
 * 👉 In simple words:
 *     Java file (.java) → Compiled (.class) → Loaded by JVM → Runs
 *
 * Each class goes through 3 steps:
 *     1️⃣ Loading
 *     2️⃣ Linking
 *     3️⃣ Initialization
 *
 * ============================================================
 * 🔹 1️⃣ Loading
 * ============================================================
 * • JVM uses a **ClassLoader** to find and load `.class` files.
 * • It reads bytecode and stores class info inside **Method Area**.
 *
 * Example:
 *     new Student();
 *     → Loads “Student.class” into memory if not already loaded.
 *
 * ============================================================
 * 🔹 2️⃣ Linking
 * ============================================================
 * • JVM prepares the class before use.
 *
 * Steps:
 *   1. Verification → checks for bytecode safety.
 *   2. Preparation  → memory given for static fields (default values).
 *   3. Resolution   → converts names into memory addresses.
 *
 * Example:
 *     static int x = 5;  // during preparation → memory reserved with value 0
 *
 * ============================================================
 * 🔹 3️⃣ Initialization
 * ============================================================
 * • Static variables are assigned real values.
 * • Static blocks are executed.
 *
 * Example:
 *     static int a = 10;
 *     static { System.out.println("Class initialized!"); }
 *
 * ============================================================
 * 🔹 4️⃣ ClassLoader Hierarchy (Parent Delegation Model)
 * ============================================================
 * JVM uses 3 main loaders in a chain:
 *
 *     ApplicationClassLoader (loads user code)
 *            ↑
 *     ExtensionClassLoader  (loads ext libs)
 *            ↑
 *     BootstrapClassLoader  (loads core Java libs)
 *
 * 💡 Rule: Each loader asks its parent first before loading the class.
 * ✅ Avoids loading same class multiple times.
 *
 * ============================================================
 * 🔹 5️⃣ When Does Class Load?
 * ============================================================
 * ✅ When you:
 *   • Create an object using `new`
 *   • Access a static variable/method
 *   • Call `Class.forName("MyClass")`
 *
 * ============================================================
 * 🔹 6️⃣ Unloading Classes
 * ============================================================
 * • JVM unloads a class only when its ClassLoader is no longer reachable.
 * • Usually happens in frameworks like Tomcat that use custom loaders.
 *
 * ============================================================
 * 🔹 7️⃣ Diagram — Easy Flow
 * ============================================================
 *
 *   ┌───────────────────────────────┐
 *   │  Disk (.class file)           │
 *   └────────────┬──────────────────┘
 *                ↓
 *        [ClassLoader loads it]
 *                ↓
 *   ┌───────────────────────────────┐
 *   │  Method Area (Class info)     │
 *   ├───────────────────────────────┤
 *   │  Linking + Initialization     │
 *   ├───────────────────────────────┤
 *   │  Execution (Heap + Stack)     │
 *   └───────────────────────────────┘
 *
 * ============================================================
 * 🔹 8️⃣ Quick Recap
 * ============================================================
 * ✅ Loading → ClassLoader reads .class file.
 * ✅ Linking → Verifies + prepares + resolves.
 * ✅ Initialization → Runs static blocks, assigns values.
 * ✅ ClassLoaders → Bootstrap → Extension → Application.
 *
 * 💬 One-liner:
 * “JVM loads, links, and initializes classes using ClassLoaders
 *  before executing them safely and efficiently.”
 */
