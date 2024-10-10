package bulgakov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nЗадание №1:");
        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество строчек и столбцов массива: ");
        int rows = input.nextInt();
        int cols = input.nextInt();
        input.nextLine();

        double[][] array = new double[rows][cols];
        System.out.println("Введите массив:");
        for (int i = 0; i < rows; i++) {
            String line = input.nextLine();
            String[] numbers = line.split(" ");
            for (int j = 0; j < cols; j++) {
                array[i][j] = Double.parseDouble(numbers[j]);
            }
        }

        Location location = Location.locateLargest(array);

        System.out.printf("Наибольший элемент массива, равный %.1f, находится в позиции (%d, %d)\n", location.maxValue, location.row, location.column);

        System.out.println("\nЗадание №2:");
        MyTime time1 = new MyTime();
        MyTime time2 = new MyTime(555550000L);
        MyTime time3 = new MyTime(5, 23, 55);

        System.out.println("Текущее время (по Москве): " + time1);
        System.out.println("Время от миллисекунд: " + time2);
        System.out.println("Время: " + time3);

        System.out.println("\nЗадание №3:");
        MyInteger myInt = new MyInteger(7);

        System.out.println("Value: " + myInt.getValue());
        System.out.println("Is Even: " + myInt.isEven());
        System.out.println("Is Odd: " + myInt.isOdd());
        System.out.println("Is Prime: " + myInt.isPrime());

        System.out.println("Static isEven(10): " + MyInteger.isEven(10));
        System.out.println("Static isOdd(10): " + MyInteger.isOdd(10));
        System.out.println("Static isPrime(10): " + MyInteger.isPrime(10));

        System.out.println("Static isEven(myInt): " + MyInteger.isEven(myInt));
        System.out.println("Static isOdd(myInt): " + MyInteger.isOdd(myInt));
        System.out.println("Static isPrime(myInt): " + MyInteger.isPrime(myInt));

        System.out.println("Equals 7: " + myInt.equals(7));
        System.out.println("Equals new MyInteger(7): " + myInt.equals(new MyInteger(7)));

        char[] chars = {'1', '2', '3'};
        System.out.println("ParseInt chars: " + MyInteger.parseInt(chars));

        String str = "456";
        System.out.println("ParseInt string: " + MyInteger.parseInt(str));
    }
}