package ass_2;
import java.util.Scanner;

public class a2_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        while (true) {
            System.out.print("Give a number: ");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num < 0) {
                count++;
            }
        }

        System.out.println("Number of negative numbers: " + count);
        sc.close();
    }
    
}
