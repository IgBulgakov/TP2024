package bulgakov;

import java.math.BigInteger;

public class SquareNumbers {
    public static void findLargeSquares() {
        long maxLong = Long.MAX_VALUE;
        BigInteger start = BigInteger.valueOf((long) Math.sqrt(maxLong) + 1);
        int count = 0;

        while (count < 10) {
            BigInteger square = start.pow(2);
            System.out.println(square);
            start = start.add(BigInteger.ONE);
            count++;
        }
    }
}
