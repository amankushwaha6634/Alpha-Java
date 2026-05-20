package package1;

public class C2 {

    public static void main(String[] args) {

        C1 c = new C1();

        System.out.println(c.x);

        System.out.println(c.y);

        System.out.println(c.z);

        // System.out.println(c.a);
    }
}

/*
🧠 UNDERSTANDING
===================

C2 is: same package

So accessible:

Modifier	Access
public	     ✅
protected	 ✅
default	     ✅
private	     ❌
 */