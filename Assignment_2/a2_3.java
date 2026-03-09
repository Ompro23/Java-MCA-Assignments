package ass_2;

import java.util.Scanner;

public class a2_3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println(num * -1);
        } else {
            System.out.println(num);
        }

        sc.close();
    }
}
