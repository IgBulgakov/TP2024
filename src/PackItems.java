package bulgakov;

import java.util.ArrayList;

public class PackItems {
    public static void packItems(int[] weights) {
        ArrayList<ArrayList<Integer>> containers = new ArrayList<>();

        for (int weight : weights) {
            boolean packed = false;
            for (ArrayList<Integer> container : containers) {
                int currentWeight = container.stream().mapToInt(Integer::intValue).sum();
                if (currentWeight + weight <= 10) {
                    container.add(weight);
                    packed = true;
                    break;
                }
            }

            if (!packed) {
                ArrayList<Integer> newContainer = new ArrayList<>();
                newContainer.add(weight);
                containers.add(newContainer);
            }
        }

        System.out.println("Контейнеры:");
        int containerNumber = 1;
        for (ArrayList<Integer> container : containers) {
            System.out.print("Контейнер " + containerNumber++ + " содержит предметы с весом ");
            for (int weight : container) {
                System.out.print(weight + " ");
            }
            System.out.println();
        }
    }
}