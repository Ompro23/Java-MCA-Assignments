package ass_2;

import java.util.Scanner;

public class a2_1 {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int square = num * num;
        System.out.println("Square: " + square);

        sc.close();
    }
    
}
