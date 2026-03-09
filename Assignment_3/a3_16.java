import java.io.*;

public class a3_16 {

    static void readFile() throws IOException {
        FileReader f = new FileReader("abc.txt");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Exception handled");
        }
    }
}