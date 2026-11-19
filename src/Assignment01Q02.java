public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        int terms = Integer.parseInt(args[0]);
        double sign = 1.0;
        for (int k = 0; k < terms; k++) {
            approxPi += sign / (2.0 * k + 1.0);
            sign = -sign;
        }
        approxPi *= 4.0;

        System.out.println(approxPi + " " + actualPi);
    }
}
