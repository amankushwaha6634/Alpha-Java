// File: _2_JVM_Architecture.java
// Topic: JVM Architecture — ClassLoader, Method Area, Heap, Stack, Execution Engine
// 🧠 Beginner-friendly notes focused on interview clarity.

public class _2_JVM_Architecture {
    public static void main(String[] args) {
        System.out.println("🚀 JVM Architecture — Core Notes Loaded!");
    }
}

/**
 * 🧠 JVM Architecture — Simple & Accurate
 * ------------------------------------------------------------
 * The Java Virtual Machine (JVM) runs compiled bytecode (.class files),
 * manages memory, and executes your program in a platform-independent way.
 *
 * 📘 Flow:
 *   .java  --(javac)-->  .class (bytecode)  --(JVM)-->  runs on any OS
 *
 * ============================================================
 * 🔹 1️⃣ High-Level Structure (Three Main Subsystems)
 * ============================================================
 *  1) Class Loader Subsystem
 *     - Loads classes into the JVM when needed.
 *     - Phases:
 *           • Loading – Reads `.class` file.
 *           • Linking – Verifies and connects references.
 *           • Initializing – Runs static blocks and sets static values.
 *
 *  2) Runtime Data Areas  ← (JVM Memory at runtime)
 *     - Where all data lives while the program runs.
 *     - Contains these areas:
 *         • Method Area (Metaspace in Java 8+)
 *         • Heap
 *         • Java Stacks (one per thread)
 *         • PC (Program Counter) Register (one per thread)
 *         • Native Method Stack (for JNI/native code)
 *
 *  3) Execution Engine
 *     - Actually executes the bytecode.
 *     - Parts:
 *         • Interpreter   → executes bytecode instruction-by-instruction
 *         • JIT Compiler  → compiles hot code paths to native for speed
 *         • Garbage Collector (GC) → frees memory of unreachable objects
 *
 * 🚫 Note: Class Loader is NOT a memory area; it's separate from Runtime Data Areas.
 *
 * ============================================================
 * 🔹 2️⃣ Runtime Data Areas (Memory) — What each stores
 * ============================================================
 *  • Method Area (Metaspace in Java 8+; uses native memory)
 *      - Class metadata (names, methods, fields)
 *      - Static variables
 *      - Runtime constant pool (literals, symbolic refs)
 *      - Bytecode of methods
 *      ⚠ Error when full: OutOfMemoryError: Metaspace
 *
 *  • Heap (shared by all threads)
 *      - All objects and arrays created with `new`
 *      - Managed by GC
 *      - Typically split into Young Gen (Eden + Survivor) and Old Gen
 *      ⚠ Error when full: OutOfMemoryError: Java heap space
 *
 *  • Java Stack (one stack per thread)
 *      - Stack frames per method call
 *      - Each frame holds:
 *          · Local variables
 *          · Operand stack (intermediate results)
 *          · Return address
 *      ⚠ Deep recursion error: StackOverflowError
 *
 *  • PC (Program Counter) Register (per thread)
 *      - Address of the current bytecode instruction being executed
 *
 *  • Native Method Stack (per thread)
 *      - Supports native calls (e.g., C/C++ via JNI)
 *
 * ============================================================
 * 🔹 3️⃣ Quick Diagram (Mental Model)
 * ============================================================
 *
 *   .java --javac--> .class (bytecode)
 *                      |
 *                      v
 *          ┌───────────────────────────────┐
 *          │              JVM              │
 *          │ ┌──────────────────────────┐  │
 *          │ │  Class Loader Subsystem  │  │  (loads classes)
 *          │ └──────────────────────────┘  │
 *          │ ┌──────────────────────────┐  │
 *          │ │     Runtime Data Areas   │  │  (memory)
 *          │ │  • Method Area/Metaspace │  │
 *          │ │  • Heap                  │  │
 *          │ │  • Java Stacks           │  │
 *          │ │  • PC Registers          │  │
 *          │ │  • Native Method Stacks  │  │
 *          │ └──────────────────────────┘  │
 *          │ ┌──────────────────────────┐  │
 *          │ │     Execution Engine     │  │  (Interpreter + JIT + GC)
 *          │ └──────────────────────────┘  │
 *          └───────────────────────────────┘
 *
 * ============================================================
 * 🔹 4️⃣ Mini Comparison Table (Interview-Friendly)
 * ============================================================
 * | Part/Area       | Shared?        | Purpose / Stores                             | Typical Error                    |
 * |-----------------|----------------|----------------------------------------------|----------------------------------|
 * | Class Loader    | Shared         | Loads & links classes                        | —                                |
 * | Method Area     | Shared         | Class meta, static vars, constant pool       | OOM: Metaspace                   |
 * | Heap            | Shared         | Objects & arrays                             | OOM: Java heap space             |
 * | Java Stack      | Per Thread     | Frames: locals, operand stack, return addr   | StackOverflowError               |
 * | PC Register     | Per Thread     | Current instruction address                  | —                                |
 * | Native Stack    | Per Thread     | Native (JNI) call support                    | —                                |
 *
 * ============================================================
 * 🔹 5️⃣ One-liner for Interviews
 * ============================================================
 * “The JVM loads classes via the Class Loader, stores metadata/objects in
 * Runtime Data Areas (Method Area, Heap, Stacks, etc.), and executes bytecode
 * through the Execution Engine (Interpreter + JIT + GC).”
 */
