import java.io.*;

public class a3_10 {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("test.txt");
            f.read();
        } catch (IOException e) {
            System.out.println("IOException occurred");
        }
    }
}