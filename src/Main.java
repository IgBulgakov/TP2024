package bulgakov;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1:");
        BigInteger number = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
        int count = 0;
        System.out.println("5 простых чисел, больше Long.MAX_VALUE:");

        while (count < 5) {
            if (number.isProbablePrime(100)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }

        System.out.println("\nЗадание №2:");
        System.out.printf("%-5s %-20s%n", "p", "2^p - 1");

        for (int p = 2; p <= 100; p++) {
            BigInteger mersenne = BigInteger.valueOf(2).pow(p).subtract(BigInteger.ONE);
            if (mersenne.isProbablePrime(100)) {
                System.out.printf("%-5d %-20s%n", p, mersenne.toString());
            }
        }

        System.out.println("\nЗадание №3:");
        BigInteger numb = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
        int cnt = 0;
        System.out.println("Первые 10 чисел, больших Long.MAX_VALUE, кратных 5 или 6:");

        while (cnt < 10) {
            if (numb.mod(BigInteger.valueOf(5)).equals(BigInteger.ZERO) ||
                    numb.mod(BigInteger.valueOf(6)).equals(BigInteger.ZERO)) {
                System.out.println(numb);
                cnt++;
            }
            numb = numb.add(BigInteger.ONE);
        }
    }
}
