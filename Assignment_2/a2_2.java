package ass_2;

import java.util.Scanner;

public class a2_2 {


     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        int sum = a + b;
        double result = Math.sqrt(sum);

        System.out.println("Square root of sum: " + result);

        sc.close();
    }
}
