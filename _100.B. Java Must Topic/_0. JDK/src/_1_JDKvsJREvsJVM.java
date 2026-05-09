/*
 * 🎀 File: JDK_Notes.java
 * 📘 Topic: JDK vs JRE vs JVM — The Heart of Java 💚
 */

public class _1_JDKvsJREvsJVM {
    public static void main(String[] args) {

        // 💬 Simple demo to show where JDK, JRE, and JVM fit in
        System.out.println("🌸 Hello Java World! 🌸");
        System.out.println("Let's understand how JDK, JRE, and JVM work together 💫");

        /*
         * ==============================================================
         * 🧩 1️⃣ What is JDK (Java Development Kit)?
         * --------------------------------------------------------------
         * 🧠 The JDK is the full package you install to DEVELOP Java apps.
         *     💼 It contains:
         *       ➜ JRE (Java Runtime Environment)
         *       ➜ Development Tools (javac, java, javadoc, jar, etc.)
         *       ➜ Core Libraries (java.lang, java.util, etc.)
         *
         * ⚙️ In simple words:
         *     👩‍💻 JDK = JRE + Compiler + Tools
         *
         * Example:
         *     javac Hello.java  ➜ Compiles code → Hello.class (bytecode)
         *                         JavaC Compiler in JDK converts java file(.java) into bytecode (.class)
         *     java Hello        ➜ Runs program using JRE + JVM
         * ==============================================================
         */


        /*
         * ==============================================================
         * ☕ 2️⃣ What is JRE (Java Runtime Environment)?
         * --------------------------------------------------------------
         * 🧠 The JRE is needed to RUN Java programs.
         *     💼 It contains:
         *       ➜ JVM (Java Virtual Machine)
         *       ➜ Core Libraries (Collections, IO, Math, etc.)
         *
         * ⚙️ Think of JRE as the environment where your program lives 🌍
         *
         * Example:
         *     When you type 'java Hello',
         *     ➜ The JRE loads the JVM.
         *     ➜ JVM interprets the bytecode and executes it.
         *
         * 🔹 JRE = JVM + Libraries
         * ==============================================================
         */


        /*
         * ==============================================================
         * ⚙️ 3️⃣ What is JVM (Java Virtual Machine)?
         * --------------------------------------------------------------
         * 🧠 JVM is the "engine" that runs the compiled bytecode.
         * It makes Java platform-independent 🌏
         *
         * 💡 Role of JVM:
         *    ➜ Converts bytecode (.class) → machine code
         *    ➜ Manages memory (heap + stack)
         *    ➜ Handles garbage collection
         *
         * 🧱 JVM sits inside the JRE
         * ==============================================================
         */


        /*
         * ==============================================================
         * 🪄 4️⃣ Summary Table
         * --------------------------------------------------------------
         * | Term | Full Form | Used For | Contains |
         * |------|------------|----------|-----------|
         * | JDK  | Java Development Kit | Develop + Run | JRE + Tools |
         * | JRE  | Java Runtime Environment | Run only | JVM + Libraries |
         * | JVM  | Java Virtual Machine | Execute Bytecode | Converts Bytecode to Machine Code |
         * ==============================================================
         */


        /*
         * ==============================================================
         * 🌸 5️⃣ Visual Diagram (Super Cute Edition)
         * --------------------------------------------------------------
         *
         *          🧱 JDK (Developer Kit)
         *          ├── 🧩 JRE (Runtime Environment)
         *          │      ├── ⚙️ JVM (Virtual Machine)
         *          │      └── 📚 Core Libraries
         *          └── 🛠️ Development Tools (javac, jar, jdb, etc.)
         *
         * 💡 So:  JDK > JRE > JVM
         *
         * 🥰 Simple Formula:
         *     JDK = JRE + Tools
         *     JRE = JVM + Libraries
         * ==============================================================
         */


        /*
         * ==============================================================
         * 🌟 6️⃣ Cute Summary (Easy to Remember)
         * --------------------------------------------------------------
         * 👩‍💻 JDK → For Developers (Write + Compile + Run)
         * 🧑‍🏫 JRE → For Users (Only Run)
         * ⚙️ JVM → For Machines (Executes Bytecode)
         *
         * ☕ Java Motto:
         *      “Write Once, Run Anywhere” 🌍 — powered by JVM magic!
         * ==============================================================
         */

        System.out.println("✅ All clear! You just learned JDK, JRE, and JVM 💖");
    }
}
