public class Stats {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: error");
            return;
        }

        int count = args.length;
        int sum = 0;
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[0]);

        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            sum = sum + num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        double average = (double) sum / count;

        System.out.println("The count is : " + count);
        System.out.println("The sum is: " + sum);
        System.out.println("The minimum value is: " + min);
        System.out.println("The max value is: " + max);
        System.out.printf("The average: is %.2f\n", average);
    }
}