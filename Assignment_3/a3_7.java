import java.io.*;

public class a3_7 {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}