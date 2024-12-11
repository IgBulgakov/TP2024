package bulgakov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задание №1");
        System.out.print("Введите размер матрицы: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        Random random = new Random();

        System.out.println("Матрица со случайными значениями равна:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(2);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        int[] rowCounts = new int[n];
        int[] colCounts = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowCounts[i] += matrix[i][j];
                colCounts[j] += matrix[i][j];
            }
        }

        int maxRow = 0, maxCol = 0;
        for (int i = 1; i < n; i++) {
            if (rowCounts[i] > rowCounts[maxRow]) maxRow = i;
            if (colCounts[i] > colCounts[maxCol]) maxCol = i;
        }

        ArrayList<Integer> maxRowIndices = new ArrayList<>();
        ArrayList<Integer> maxColIndices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (rowCounts[i] == rowCounts[maxRow]) maxRowIndices.add(i);
            if (colCounts[i] == colCounts[maxCol]) maxColIndices.add(i);
        }

        System.out.println("Индексы строк с наибольшим количеством единиц: " + maxRowIndices);
        System.out.println("Индексы столбцов с наибольшим количеством единиц: " + maxColIndices);

        System.out.println("\nЗадание №2");
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Введите 5 чисел для сортировки: ");
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }

        Collections.sort(list);
        System.out.println("Список в порядке возрастания: " + list);

        System.out.println("\nЗадание №3");
        ArrayList<Double> doubleList = new ArrayList<>();
        System.out.print("Введите 5 чисел для подсчета суммы: ");
        for (int i = 0; i < 5; i++) {
            doubleList.add(scanner.nextDouble());
        }

        double totalSum = 0;
        for (double num : doubleList) {
            totalSum += num;
        }

        System.out.println("Сумма чисел: " + totalSum);
    }
}