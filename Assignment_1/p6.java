public class p6 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        double avg = (double) sum / numbers.length;

        System.out.println("Average = " + avg);
    }
    
}
