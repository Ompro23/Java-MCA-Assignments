class LowBalanceException extends Exception {
    LowBalanceException(String msg) {
        super(msg);
    }
}

public class a3_13 {
    public static void main(String[] args) {
        String accNo = "018";
        String name = "tushar";
        double balance = 500;

        try {
            if (balance < 1000) {
                throw new LowBalanceException("Balance below Rs 1000");
            }
        } catch (LowBalanceException e) {
            System.out.println("Account: " + accNo);
            System.out.println("User: " + name);
            System.out.println(e.getMessage());
        }
    }
}