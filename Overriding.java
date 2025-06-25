package xyz;

public class Overriding {
    public static void main(String[] args) {
        Child c = new Child();
        c.property();

        Parent p = new Parent();
        p.property();
    }
}

class Parent {
    void property() {
        System.out.println("My property is for my child");
    }
}

class Child extends Parent {
    void property() {
        System.out.println("My parent property is my property");
    }
}