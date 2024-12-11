package bulgakov;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nЗадание 1");
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Введите десять целых чисел: ");
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
        }
        RemoveDuplicate.removeDuplicate(list);
        System.out.print("Несовпадающие целые числа равны: ");
        for (int number : list) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("\nЗадание 2");
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Введите пять целых чисел для списка 1: ");
        for (int i = 0; i < 5; i++) {
            list1.add(scanner.nextInt());
        }
        System.out.print("Введите пять целых чисел для списка 2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(scanner.nextInt());
        }
        ArrayList<Integer> unionList = Union.union(list1, list2);
        System.out.print("Объединенный список равен: ");
        for (int number : unionList) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("\nЗадание 3");
        scanner.nextLine();
        System.out.print("Введите строку для преобразования в список символов: ");
        String input = scanner.nextLine();
        ArrayList<Character> charList = ToCharacterArray.toCharacterArray(input);
        System.out.println("Список символов: " + charList);

        System.out.print("Введите количество предметов: ");
        int itemCount = scanner.nextInt();
        int[] weights = new int[itemCount];
        System.out.print("Введите вес каждого предмета: ");
        for (int i = 0; i < itemCount; i++) {
            weights[i] = scanner.nextInt();
        }
        PackItems.packItems(weights);
    }
}