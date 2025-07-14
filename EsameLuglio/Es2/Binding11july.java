package Teoria.EsameLuglio.Es2;

interface I {
    public void m2();
}

class A {
    public void m1() {
        System.out.println("A.m1");
    }
}

class B extends A implements I {
    public void m1() {
        System.out.println("B.m1");
    }

    public void m2() {
        System.out.println("B.m2");    
    }
}

class C extends B {
    public void m1() {
        System.out.println("B.m1");
        super.m1();
    }

    public void m2 (A obj) {
        System.out.println("C.m2");
        obj.m1();
    }
}

public class Binding11july {
    public static void main(String[] args) {
        
    }
}
