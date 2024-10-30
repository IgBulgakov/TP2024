package bulgakov;

import java.math.BigInteger;

public class LargeNumbers {
    public static void findLargeNumbers() {
        BigInteger start = new BigInteger("1" + "0".repeat(49));
        int count = 0;

        while (count < 10) {
            if (start.mod(BigInteger.TWO).equals(BigInteger.ZERO) || start.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) {
                System.out.println(start);
                count++;
            }
            start = start.add(BigInteger.ONE);
        }
    }
}

