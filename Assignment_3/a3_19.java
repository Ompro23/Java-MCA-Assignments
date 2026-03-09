import java.io.*;

class SuperClass {
    void display() throws IOException {
        System.out.println("Super class method");
    }
}

class SubClass extends SuperClass {
    void display() throws FileNotFoundException {
        System.out.println("Sub class method");
    }
}

public class a3_19 {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        try {
            s.display();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}