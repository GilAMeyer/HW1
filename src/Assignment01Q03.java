import java.math.BigInteger;

public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        BigInteger current = BigInteger.ONE;
        BigInteger next = BigInteger.ONE;
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(current);
            if (current.testBit(0)) {
                numOdd++;
            }
            BigInteger sum = current.add(next);
            current = next;
            next = sum;
        }
        System.out.println();
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
