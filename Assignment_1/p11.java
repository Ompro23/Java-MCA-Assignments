public class p11 {
     public static void main(String[] args) {

        int a = 10;

        if (a > 5 && a++ > 10) {
            System.out.println("AND executed");
        }

        System.out.println("Value of a after &&: " + a);

        if (a < 5 || a++ > 10) {
            System.out.println("OR executed");
        }

        System.out.println("Value of a after ||: " + a);
    }
    
}
