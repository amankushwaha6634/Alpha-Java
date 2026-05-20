package package2;


import package1.PublicInner;



public class TestPublic {


    public static void main(String[] args) {


        PublicInner outer =
                new PublicInner();


        PublicInner.Demo inner =
                outer.new Demo();


        inner.show();
    }
}