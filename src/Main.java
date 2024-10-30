package bulgakov;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №1: Демонстрация класса MyDate");
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);
        System.out.println("Дата 1: " + date1.getYear() + "-" + (date1.getMonth() + 1) + "-" + date1.getDay());
        System.out.println("Дата 2: " + date2.getYear() + "-" + (date2.getMonth() + 1) + "-" + date2.getDay());

        System.out.println("\nЗадание №2: Первые 10 чисел с 50 десятичными цифрами, кратные 2 или 3");
        LargeNumbers.findLargeNumbers();

        System.out.println("\nЗадание №3: Первые 10 квадратных чисел, превышающих Long.MAX_VALUE");
        SquareNumbers.findLargeSquares();
    }
}
