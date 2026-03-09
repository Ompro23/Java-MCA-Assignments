class Parent {
    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void show() throws RuntimeException {
        System.out.println("Child method with unchecked exception");
    }
}

public class a3_18 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}