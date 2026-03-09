package ass_2;

import java.util.Scanner;

public class a2_5 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("Unsuitable number");
            } else if (num == 0) {
                break;
            } else {
                System.out.println("Square: " + (num * num));
            }
        }

        sc.close();
    }
    
}
