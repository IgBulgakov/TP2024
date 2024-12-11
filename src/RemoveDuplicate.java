package bulgakov;

import java.util.ArrayList;

public class RemoveDuplicate {
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (Integer number : list) {
            if (!uniqueList.contains(number)) {
                uniqueList.add(number);
            }
        }
        list.clear();
        list.addAll(uniqueList);
    }
}