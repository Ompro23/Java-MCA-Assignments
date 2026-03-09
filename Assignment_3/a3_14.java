public class a3_14 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (NullPointerException e) {
            System.out.println("Handled");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}