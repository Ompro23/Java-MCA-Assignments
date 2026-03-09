package ass_2;
import java.util.Scanner;

public class a2_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        while (true) {
            System.out.print("Give a number: ");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            count++;
        }

        System.out.println("Number of numbers: " + count);
        sc.close();
    }
    
}
