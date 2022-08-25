import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,3,2,6,4,5,2));
        Set<Integer> list1 = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list1.add(list.get(i));
            }
        }
        List<Integer> list2 = new ArrayList<>(list1);
        Collections.sort(list2);
        System.out.println(list2);
    }

}
