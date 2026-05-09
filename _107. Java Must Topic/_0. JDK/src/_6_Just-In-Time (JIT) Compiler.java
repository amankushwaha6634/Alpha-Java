// File: _5_JIT_Compiler.java
// Topic: Just-In-Time (JIT) Compiler in JVM
// 🧠 JIT = Just-In-Time Compiler → makes Java programs run faster by converting bytecode into native machine code at runtime.

/**
 * ============================================================
 * 🧠 What is JIT Compiler?
 * ============================================================
 * • JIT stands for **Just-In-Time Compiler**.
 * • It is part of the **JVM Execution Engine**.
 * • It helps Java programs run faster by changing frequently used
 *   bytecode into real machine code while the program runs.
 *
 * 📘 Simple Flow:
 *   .java → compiled to .class (bytecode)
 *   .class → JVM runs it
 *   → Interpreter runs it line by line (slow)
 *   → JIT converts repeated code to machine code (fast)
 *
 * 💬 In short:
 *   JIT = “Speed Booster” for Java programs at runtime.
 *
 * ============================================================
 * 🔹 1️⃣ Why Do We Need JIT?
 * ============================================================
 * • Interpreter runs code line by line → slower.
 * • JIT finds code that runs many times (called “hotspots”).
 * • It compiles those parts into machine code → faster next time.
 *
 * ✅ Result → Java becomes almost as fast as C/C++ after warm-up.
 *
 * Example:
 *     for (int i = 0; i < 1_000_000; i++) {
 *         add(10, 20);
 *     }
 *     static int add(int a, int b) { return a + b; }
 *
 * 🔹 Explanation:
 *   - JVM sees that “add()” is running again and again.
 *   - It compiles it into CPU code using JIT.
 *   - So future calls run faster.
 *
 * ============================================================
 * 🔹 2️⃣ Steps of JIT Compilation
 * ============================================================
 * 1️⃣ JVM starts interpreting bytecode.
 * 2️⃣ Finds frequently used (hot) code.
 * 3️⃣ JIT compiles that hot code into native machine code.
 * 4️⃣ Stores compiled code in memory for reuse.
 *
 * ✅ So next time JVM skips interpretation → runs compiled code.
 *
 * ============================================================
 * 🔹 3️⃣ Interpreter vs JIT
 * ============================================================
 * | Component | When Used | Speed | Purpose |
 * |------------|------------|--------|----------|
 * | Interpreter | Program start | Slow | Runs bytecode line by line |
 * | JIT Compiler | After warm-up | Fast | Converts hot code to native code |
 *
 * 💡 Both work together:
 *   - Interpreter helps JVM start quickly.
 *   - JIT improves speed as program runs longer.
 *
 * ============================================================
 * 🔹 4️⃣ JIT Optimizations (Easy to Remember)
 * ============================================================
 * 🧩 JIT automatically does:
 *   • Inlining → replaces small method calls with their code.
 *   • Loop Unrolling → reduces loop overhead.
 *   • Constant Folding → replaces 2*10 with 20 directly.
 *   • Dead Code Removal → removes unused code.
 *   • Escape Analysis → keeps some objects on stack (faster).
 *
 * 💡 These tricks make Java faster over time.
 *
 * ============================================================
 * 🔹 5️⃣ Types of JIT Compilers
 * ============================================================
 * | Type | Used For |
 * |-------|----------|
 * | C1 (Client) | Faster startup, small apps |
 * | C2 (Server) | Better optimization, large apps |
 * | Tiered (C1 + C2) | Combination used in most JVMs |
 *
 * ============================================================
 * 🔹 6️⃣ Simple Diagram
 * ============================================================
 *   ┌───────────────────────────────┐
 *   │  Java Source (.java)          │
 *   └────────────┬──────────────────┘
 *                ↓
 *          javac Compiler
 *                ↓
 *          Bytecode (.class)
 *                ↓
 *   ┌───────────────────────────────┐
 *   │      JVM Execution Engine     │
 *   │  → Interpreter (runs slowly)  │
 *   │  → JIT Compiler (makes fast)  │
 *   └───────────────────────────────┘
 *
 * ============================================================
 * 🔹 7️⃣ Quick Recap
 * ============================================================
 * ✅ JIT is part of the Execution Engine.
 * ✅ It makes Java faster by compiling hot code into machine code.
 * ✅ Uses optimizations like inlining and loop unrolling.
 * ✅ Works with interpreter — no configuration needed.
 *
 * 💬 One-liner:
 * “JIT Compiler improves JVM performance by converting hot bytecode
 *  into native CPU code while the program is running.”
 */
