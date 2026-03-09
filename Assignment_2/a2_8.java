package ass_2;
import java.util.Scanner;

public class a2_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Give a number: ");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
        }

        System.out.println("Sum of the numbers: " + sum);
        sc.close();
    }
    
}
