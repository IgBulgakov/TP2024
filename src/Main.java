package bulgakov;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задание №1");
        System.out.print("Введите сторону 1 треугольника: ");
        double side1 = scanner.nextDouble();
        System.out.print("Введите сторону 2 треугольника: ");
        double side2 = scanner.nextDouble();
        System.out.print("Введите сторону 3 треугольника: ");
        double side3 = scanner.nextDouble();

        System.out.print("Введите цвет треугольника: ");
        String color = scanner.next();
        System.out.print("Закрашен ли треугольник? (true/false): ");
        boolean filled = scanner.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("\nДетали треугольника:");
        System.out.println(triangle.toString());
        System.out.printf("Площадь: %.2f%n", triangle.getArea());
        System.out.printf("Периметр: %.2f%n", triangle.getPerimeter());
        System.out.println("Цвет: " + triangle.getColor());
        System.out.println("Закрашен: " + triangle.isFilled());

        System.out.println("\nЗадание №2");
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Введите числа (0 для завершения ввода):");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break;
            numbers.add(num);
        }

        Integer max = max(numbers);
        if (max != null) {
            System.out.println("Максимальное значение: " + max);
        } else {
            System.out.println("Список пуст.");
        }

        System.out.println("\nЗадание №3");
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(triangle);
        objects.add(new java.util.Date());
        objects.add("Пример строки");
        objects.add(new Circle(5));

        System.out.println("Элементы списка:");
        for (Object obj : objects) {
            System.out.println(obj.toString());
        }

        scanner.close();
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        Integer max = list.get(0);
        for (Integer num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}