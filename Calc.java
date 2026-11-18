public class Calc {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: error");
            return;
        }

        String op = args[0];
        int result = Integer.parseInt(args[1]);

        if (op.equals("add")) {
            for (int i = 2; i < args.length; i++) {
                result = result + Integer.parseInt(args[i]);
            }
        } else if (op.equals("mult")) {
            for (int i = 2; i < args.length; i++) {
                result = result * Integer.parseInt(args[i]);
            }
        } else if (op.equals("max")) {
            for (int i = 2; i < args.length; i++) {
                int num = Integer.parseInt(args[i]);
                if (num > result) {
                    result = num;
                }
            }
        } else if (op.equals("min")) {
            for (int i = 2; i < args.length; i++) {
                int num = Integer.parseInt(args[i]);
                if (num < result) {
                    result = num;
                }
            }
        } else {
            System.err.println("Unknown operation: " + op);
            return;
        }

        System.out.println(result);
    }
}