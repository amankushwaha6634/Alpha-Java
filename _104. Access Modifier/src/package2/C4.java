package package2;

import package1.C1;

class UsingC1 extends C1 {
    void meth() {

        System.out.println(x);

        System.out.println(y);

        // System.out.println(z);

        // System.out.println(a);
    }
}

public class C4 {
    public static void main(String[] args) {
        UsingC1 ob = new UsingC1();
        ob.meth();

    }
}

/*
🧠 NOW WHY protected WORKS?
==============================

Because:
inheritance + subclass
🚨 MOST IMPORTANT protected RULE

===================================
Different package subclass can access:
protected

ONLY through:
child object

NOT parent object 🚨
 */


/*
🔥 MOST IMPORTANT LEARNING
=============================
Access Type	Through Parent Object	Through    Child Object
protected (different package)	      ❌        	✅
 */