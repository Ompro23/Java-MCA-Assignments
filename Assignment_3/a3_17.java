public class a3_17 {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                throw new Exception("Chained Exception", e);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}