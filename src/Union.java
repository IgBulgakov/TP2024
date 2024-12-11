package bulgakov;

import java.util.ArrayList;

public class Union {
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> unionList = new ArrayList<>(list1);
        unionList.addAll(list2);
        return unionList;
    }
}